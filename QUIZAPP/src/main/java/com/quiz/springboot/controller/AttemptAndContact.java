package com.quiz.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.quiz.springboot.entity.PreviousAttempts;
import com.quiz.springboot.service.PreviousAttemptsService;
import com.quiz.springboot.service.QuizService;
import com.quiz.springboot.service.UserService;

@Controller
@RequestMapping("/user")
@SessionAttributes({ "username", "adminid", "userid" })
public class AttemptAndContact {

	@Autowired
	PreviousAttemptsService previousAttemptsService;
	@Autowired
	QuizService quizService;
	@Autowired
	UserService user;

	@GetMapping("/previous-attempts")
	public String getPreviousAttempts(ModelMap model) {
		String userid = (String) model.get("userid");
		// is user logged in or not
		if (user.findUserByUserId(userid) == null) // can't find user by userid
		{
			model.addAttribute("error", "LOGIN FIRST!!");
			return "login";
		}

		List<PreviousAttempts> attempts = previousAttemptsService.retrievePreviousAttemptsUserid(userid);
		if (attempts != null) {
			model.addAttribute("attempts", attempts);
			model.addAttribute("quizService", quizService);
		}
		return "response";
	}
	
	@GetMapping("/contact")
	public String getContact(ModelMap model)
	{
		String userid = (String) model.get("userid");
		// is user logged in or not
		if (user.findUserByUserId(userid) == null) // can't find user by userid
		{
			model.addAttribute("error", "LOGIN FIRST!!");
			return "login";
		}
		return "about";
	}
}
