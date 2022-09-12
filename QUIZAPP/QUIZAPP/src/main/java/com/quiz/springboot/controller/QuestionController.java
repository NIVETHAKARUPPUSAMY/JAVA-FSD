package com.quiz.springboot.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.quiz.springboot.entity.Options;
import com.quiz.springboot.entity.Question;
import com.quiz.springboot.entity.Quiz;
import com.quiz.springboot.service.OptionsService;
import com.quiz.springboot.service.QuestionService;
import com.quiz.springboot.service.QuizService;

@Controller
@RequestMapping("/admin")
@SessionAttributes({ "username", "adminid", "userid" })
public class QuestionController {
	@Autowired
	QuizService quizService;
	@Autowired
	QuestionService questionService;
	@Autowired
	OptionsService optionsService;

	@GetMapping("/quiz-control/{quizid}/question-control")
	public String viewQuizInsidePage(@PathVariable String quizid, ModelMap model) {
		
		if (model.get("adminid").equals("") ||  model.get("adminid")==null) // can't find user by userid
		{
			model.addAttribute("error", "LOGIN FIRST!!");
			return "login";
		}
		
		Quiz specificQuiz = quizService.retrieveByQuizId(quizid);
		model.addAttribute("quiz", specificQuiz);

		List<Question> quizQuestions = questionService.retrieveQuestionsByQuizId(quizid);
		model.addAttribute("questions", quizQuestions);
		return "question-control";
	}

	@GetMapping("/{quizid}/question-add")
	public String getQuestionAddPage(@PathVariable String quizid, ModelMap model) {
		if (model.get("adminid").equals("") ||  model.get("adminid")==null) // can't find user by userid
		{
			model.addAttribute("error", "LOGIN FIRST!!");
			return "login";
		}
		
		model.addAttribute("quizid", quizid);
		return "question-add";
	}

	@PostMapping("/{quizid}/add-question/success")
	public String addQuestion(@PathVariable String quizid, @RequestParam String questionid,
			@RequestParam String questiondetails, @RequestParam String option1, @RequestParam String option2,
			@RequestParam String option3, @RequestParam String option4, @RequestParam String correctans,
			ModelMap model) {

		if (model.get("adminid").equals("") ||  model.get("adminid")==null) // can't find user by userid
		{
			model.addAttribute("error", "LOGIN FIRST!!");
			return "login";
		}
		
		if (questionService.isQuestionIdExists(quizid, questionid)) {
			model.addAttribute("error", "QUESTION-ID ALREADY EXISTS!!");
			return "question-add";
		}
		Random rand = new Random();
		long optionid = rand.nextLong();
		
		if(!optionsService.isOptionsMatch(option1, option2, option3, option4, correctans))
		{
			model.addAttribute("error", "CORRECT ANSWER IS WRONG!! PLEASE CHECK AGAIN");
			return "question-add";
		}
		long id = rand.nextLong();
		questionService.addQuestion(new Question(id , quizid, questionid, questiondetails, correctans));

		optionsService.addOption(new Options(quizid, questionid, optionid, option1));
		optionid = rand.nextLong();
		optionsService.addOption(new Options(quizid, questionid, optionid, option2));
		optionid = rand.nextLong();
		optionsService.addOption(new Options(quizid, questionid, optionid, option3));
		optionid = rand.nextLong();
		optionsService.addOption(new Options(quizid, questionid, optionid, option4));

		return "redirect:/admin/quiz-control/{quizid}/question-control";
	}

	@PostMapping("/{quizid}/delete/{questionid}/success")
	public String deleteQuestion(@PathVariable String quizid, @PathVariable String questionid , ModelMap model) {
		if (model.get("adminid").equals("") ||  model.get("adminid")==null) // can't find user by userid
		{
			model.addAttribute("error", "LOGIN FIRST!!");
			return "login";
		}
		
		questionService.deleteQuestion(quizid, questionid);
		optionsService.deleteOptions(quizid, questionid);
		return "redirect:/admin/quiz-control/{quizid}/question-control";
	}

	@GetMapping("/{quizid}/view/{questionid}/update")
	public String getUpdatePage(@PathVariable String quizid, @PathVariable String questionid, ModelMap model) {
		if (model.get("adminid").equals("") ||  model.get("adminid")==null) // can't find user by userid
		{
			model.addAttribute("error", "LOGIN FIRST!!");
			return "login";
		}
		
		model.addAttribute("quizid", quizid);
		model.addAttribute("questionid", questionid);
		model.addAttribute("question" , questionService.viewQuestion(quizid, questionid));
		model.addAttribute("options" , optionsService.getOptionsByQuestions(quizid, questionid));
		return "question-update";
	}

	@PostMapping("/{quizid}/view/{questionid}/update/success")
	public String updateQuestion(@PathVariable String quizid, @PathVariable String questionid,
			@RequestParam String questiondetails, @RequestParam String option1, @RequestParam String option2,
			@RequestParam String option3, @RequestParam String option4, ModelMap model,
			@RequestParam String correctans) {
		if (model.get("adminid").equals("") ||  model.get("adminid")==null) // can't find user by userid
		{
			model.addAttribute("error", "LOGIN FIRST!!");
			return "login";
		}
		
		optionsService.deleteOptions(quizid, questionid);
		questionService.deleteQuestion(quizid, questionid);
		
		Random rand = new Random();
		long optionid = rand.nextLong();
		long id = rand.nextLong();
		questionService.addQuestion(new Question(id , quizid, questionid, questiondetails, correctans));
		optionid = rand.nextLong();
		optionsService.addOption(new Options(quizid, questionid, optionid, option1));
		optionid = rand.nextLong();
		optionsService.addOption(new Options(quizid, questionid, optionid, option2));
		optionid = rand.nextLong();
		optionsService.addOption(new Options(quizid, questionid, optionid, option3));
		optionid = rand.nextLong();
		optionsService.addOption(new Options(quizid, questionid, optionid, option4));

		return "redirect:/admin/quiz-control/{quizid}/question-control";

	}

	@GetMapping("/{quizid}/view/questions/{questionid}")
	public String viewQuestionPage(ModelMap model, @PathVariable String quizid, @PathVariable String questionid) {
		if (model.get("adminid").equals("") ||  model.get("adminid")==null) // can't find user by userid
		{
			model.addAttribute("error", "LOGIN FIRST!!");
			return "login";
		}
		model.addAttribute("options", optionsService.getOptionsByQuestions(quizid, questionid));
		model.addAttribute("question", questionService.viewQuestion(quizid, questionid));
		model.addAttribute("quiz", quizService.retrieveByQuizId(quizid));
		return "view-question";
	}
}
