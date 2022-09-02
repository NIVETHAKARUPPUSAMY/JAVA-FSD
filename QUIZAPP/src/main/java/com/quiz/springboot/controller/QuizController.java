package com.quiz.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.quiz.springboot.entity.Quiz;
import com.quiz.springboot.service.OptionsService;
import com.quiz.springboot.service.QuestionService;
import com.quiz.springboot.service.QuizService;

@Controller
@SessionAttributes({ "username", "adminid", "userid" })
@RequestMapping("/admin")
public class QuizController {

	@Autowired
	QuizService quizService;
	
	@Autowired
	QuestionService questionService;
	
	@Autowired
	OptionsService optionService;

	@GetMapping("/quiz-add")
	public String getQuizAddPage(ModelMap model) {
		
		if (model.get("adminid").equals("") ||  model.get("adminid")==null) // can't find user by userid
		{
			model.addAttribute("error", "LOGIN FIRST!!");
			return "login";
		}
		return "quiz-add";
	}

	@PostMapping("/quiz-add-success")
	public String addQuiz(@RequestParam String quizid, @RequestParam String quizname, @RequestParam String quizdesc,
			ModelMap model) {
		
		if (model.get("adminid").equals("") || model.get("adminid")==null) // can't find user by userid
		{
			model.addAttribute("error", "LOGIN FIRST!!");
			return "login";
		}
		

		if (quizService.isQuizIdPresent(quizid)) {
			model.addAttribute("error", "QUIZ-ID ALREADY EXISTS!!");
			return "quiz-add";
		}
		quizService.add(new Quiz(quizid, quizname, quizdesc));
		return "redirect:/admin/quiz-control";
	}

	@GetMapping("/quiz-control")
	public String showViewQuizPage(ModelMap model) {
		if (model.get("adminid").equals("") ||  model.get("adminid")==null) // can't find user by userid
		{
			model.addAttribute("error", "LOGIN FIRST!!");
			return "login";
		}
		List<Quiz> allQuizes = quizService.retrieveAllQuizes();
		model.addAttribute("quizes", allQuizes);
		return "quiz-control";
	}

	@PostMapping("/quiz-control/{quizid}/delete")
	public String delete(@PathVariable String quizid , ModelMap model) {
		if (model.get("adminid").equals("") ||  model.get("adminid")==null) // can't find user by userid
		{
			model.addAttribute("error", "LOGIN FIRST!!");
			return "login";
		}
		
		quizService.remove(quizid);
		optionService.deleteOptions(quizid);
		questionService.deleteQuestions(quizid);
		return "redirect:/admin/quiz-control";
	}

	@GetMapping("/quiz-control/{quizid}/update")
	public String viewQuizUpdatePage(@PathVariable String quizid, ModelMap model) {
		if (model.get("adminid").equals("") ||  model.get("adminid")==null) // can't find user by userid
		{
			model.addAttribute("error", "LOGIN FIRST!!");
			return "login";
		}
		
		model.addAttribute("quizId", quizid);
		return "quiz-update";
	}

	@PostMapping("/quiz-update/{quizid}/success")
	public String updateQuiz(@PathVariable String quizid, @RequestParam String quizname, @RequestParam String quizdesc,
			ModelMap model) {
		if (model.get("adminid").equals("") ||  model.get("adminid")==null) // can't find user by userid
		{
			model.addAttribute("error", "LOGIN FIRST!!");
			return "login";
		}
		
		

		quizService.add(new Quiz(quizid, quizname, quizdesc));
		return "redirect:/admin/quiz-control";
	}

}
