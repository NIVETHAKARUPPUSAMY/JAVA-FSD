package com.quiz.springboot.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.quiz.springboot.entity.PreviousAttempts;
import com.quiz.springboot.entity.Question;
import com.quiz.springboot.service.OptionsService;
import com.quiz.springboot.service.PreviousAttemptsService;
import com.quiz.springboot.service.QuestionService;
import com.quiz.springboot.service.QuizService;
import com.quiz.springboot.service.UserQuizService;
import com.quiz.springboot.service.UserService;

@Controller
@RequestMapping("/user")
@SessionAttributes({ "flag", "username", "adminid", "userid", "points", "outof" })
public class UserQuizController {

	@Autowired
	QuizService quizService;
	@Autowired
	QuestionService questionService;
	@Autowired
	OptionsService optionService;
	@Autowired
	UserQuizService userService;
	@Autowired
	PreviousAttemptsService previousAttemptsService;

	@Autowired
	UserService user;

	int points = 0;
	int outof = 0;
	int flag = 0;

	@GetMapping("/{quizid}/start")
	public String startPage(@PathVariable String quizid, ModelMap model) {
		String userid = (String) model.get("userid");
		// is user logged in or not
		if (user.findUserByUserId(userid) == null) // can't find user by userid
		{
			model.addAttribute("error", "LOGIN FIRST!!");
			return "login";
		}

		if (userService.retrieveFirstQuestion(quizid) == null) {
			return "redirect:/user/index";
		}
		points = 0;
		outof = 0;
		model.addAttribute("flag", 0);
		model.addAttribute("points", 0);
		model.addAttribute("outof", 0);
		model.addAttribute("quizdetails", quizService.retrieveByQuizId(quizid));
		model.addAttribute("first", userService.retrieveFirstQuestion(quizid));
		return "quiz-start-page";
	}

	@GetMapping("/{quizid}/{questionid}")
	public String questionPage(@PathVariable String quizid, @PathVariable String questionid, ModelMap model) {
		String userid = (String) model.get("userid");
		// is user logged in or not
		if (user.findUserByUserId(userid) == null) // can't find user by userid
		{
			model.addAttribute("error", "LOGIN FIRST!!");
			return "login";
		}

		if ((int) model.get("flag") == 1) {
			points++;
		}

		flag = 0;
		model.addAttribute("flag", flag);
		Question question = questionService.viewQuestion(quizid, questionid);
		Question nextQuestion = userService.getNextQuestion(quizid, questionid);
		model.addAttribute("quizid", quizid);
		model.addAttribute("question", question);
		model.addAttribute("options", optionService.getOptionsByQuestions(quizid, questionid));
		if (nextQuestion.getQuestionid().equals("end")) {
			nextQuestion.setQuestionid("end");
			model.addAttribute("next", nextQuestion);
			model.addAttribute("buttonnx", "FINISH ATTEMPT");
		}

		else {
			model.addAttribute("next", nextQuestion);
			model.addAttribute("buttonnx", "NEXT QUESTION");
		}

		if (userService.retrieveFirstQuestion(quizid).getQuestionid().equals(questionid)) {
			model.addAttribute("message", "THIS IS YOUR FIRST QUESTION , BEST OF LUCK");
		}
		model.addAttribute("points", points);
		return "question-page";
	}

	@PostMapping("/{quizid}/{questionid}")
	public String get(@PathVariable String quizid, @PathVariable String questionid, ModelMap model,
			@RequestParam String response, @RequestParam String curr) {
		String userid = (String) model.get("userid");
		// is user logged in or not
		if (user.findUserByUserId(userid) == null) // can't find user by userid
		{
			model.addAttribute("error", "LOGIN FIRST!!");
			return "login";
		}

		Question question = questionService.viewQuestion(quizid, questionid);
		outof++;
		model.addAttribute("quizid", quizid);
		model.addAttribute("question", question);
		model.addAttribute("options", optionService.getOptionsByQuestions(quizid, curr));

		if (userService.isCorrectAnswer(userService.searchCorrectAnswer(quizid, curr), response)) {
			flag = 1;
			model.addAttribute("flag", flag);
		}

		else {
			flag = 0;
			model.addAttribute("flag", flag);
		}

		model.addAttribute("points", points);

		return "redirect:/user/{quizid}/{questionid}";
	}

	@GetMapping("/{quizid}/end")
	public String end(ModelMap model, @PathVariable String quizid) {
		String userid = (String) model.get("userid");
		// is user logged in or not
		if (user.findUserByUserId(userid) == null) // can't find user by userid
		{
			model.addAttribute("error", "LOGIN FIRST!!");
			return "login";
		}

		if ((int) model.get("flag") == 1) {
			points++;
			model.addAttribute("points", points);
			model.addAttribute("outof", outof);
		}

		String score = Integer.toString(points) + " / " + Integer.toString(outof);
		if (previousAttemptsService.retrievePreviousAttempts(quizid) == null || Integer.parseInt(previousAttemptsService
				.getScoreDiv(previousAttemptsService.retrievePreviousAttempts(quizid).getScore())[0]) < points) {
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy 'at' HH:mm:ss z");
			Date date = new Date(System.currentTimeMillis());

			previousAttemptsService
					.addPreviousAttempts(new PreviousAttempts(userid, quizid, formatter.format(date), score));
		}

		flag = 0;
		model.addAttribute("points", points);
		model.addAttribute("outof", outof);
		model.addAttribute("flag", 0);
		return "quiz-end";
	}
}