package com.quiz.springboot.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.quiz.springboot.entity.Quiz;
import com.quiz.springboot.entity.UserDetails;
import com.quiz.springboot.service.QuizService;
import com.quiz.springboot.service.UserService;

@Controller
@SessionAttributes({ "username", "adminid", "userid" })
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	QuizService quizService;

	@GetMapping(value = "/registration/user")
	public String showRegistrationPage(ModelMap model) {
		String userid = (String) model.get("userid");
		// is user logged in or not
		if (!userService.isUserNotExists(userid)) // current user logged in
		{
			return "redirect:/user/index";
		}
		if(model.get("adminid")!=null && model.get("adminid").equals("ADMIN"))
		{
			return "redirect:/admin/quiz-control";
		}
		return "user-reg";
	}
	
	@GetMapping(value="/home")
	public String homePage(ModelMap model)
	{
		String userid = (String) model.get("userid");
		// is user logged in or not
		if (!userService.isUserNotExists(userid)) // current user logged in
		{
			return "redirect:/user/index";
		}
		if(model.get("adminid")!=null && model.get("adminid").equals("ADMIN"))
		{
			return "redirect:/admin/quiz-control";
		}
		return "home";
	}

	@PostMapping("/registration-success")
	public String Registration(@RequestParam String userid, @RequestParam String username,
			@RequestParam String useremail, @RequestParam long userphone, @RequestParam String pass,
			@RequestParam String repass, ModelMap model) {
		if (!userService.isPasswordMatching(pass, repass)) {
			model.addAttribute("error", "ENTERED AND RE-ENTERED PASSWORD DOESN'T MATCH!!");
			return "user-reg";
		}

		if (userService.isEmailIdExists(useremail)) {
			model.addAttribute("error", "EMAIL-ID ALREADY EXISTS!!");
			return "user-reg";
		}

		if (userService.isUserIdExists(userid)) {
			model.addAttribute("error", "USER-ID ALREADY EXISTS!!");
			return "user-reg";
		}

		if (userService.isUserPhoneExists(userphone)) {
			model.addAttribute("error", "USER PHONE-NUMBER ALREADY EXISTS!!");
			return "user-reg";
		}
		if (userid.equalsIgnoreCase("null")) {
			model.addAttribute("error", "TRY ANOTHER USER-ID!! (USER-ID CANNOT BE 'NULL'");
			return "user-reg";
		}

		model.addAttribute("error", "REGISTRATION SUCCESSFUL!!");
		userService.addUsers(new UserDetails(userid, username, useremail, userphone, pass, 0));
		return "user-reg";
	}

	@GetMapping(value = "/login")
	public String showLoginPage(ModelMap model) {
		String userid = (String) model.get("userid");
		// is user logged in or not
		if (!userService.isUserNotExists(userid)) // current user logged in
		{
			return "redirect:/user/index";	
		}
		if(model.get("adminid")!=null && model.get("adminid").equals("ADMIN"))
		{
			return "redirect:/admin/quiz-control";
		}
		model.put("userid", "");
		model.put("adminid", "");
		return "login";
	}

	@PostMapping(value = "/login-success")
	public String login(@RequestParam String userid, @RequestParam String pass, ModelMap model) {
		if(userid.equals("ADMIN") && pass.equals("1234"))
		{
			model.put("userid", "");
			model.put("adminid", "ADMIN");
			return "redirect:/admin/quiz-control";
		}
		
		if (userService.isUserNotExists(userid)) {
			model.addAttribute("error", "USER-ID DOSEN'T EXISTS!! WANNA SIGNUP?");
			return "login";
		}
		if (userService.isValidUser(userid, pass) == false) {
			model.addAttribute("error", "ENTER CORRECT CREDENTIALS");
			return "login";
		}
		
		userService.authenticated(userid);
		String username = userService.retrieveByUserId(userid).getUsername();
		model.put("username", username);
		model.put("userid", userid);
		model.put("adminid", "");
		
		return "redirect:/user/index";
	}

	@GetMapping(value = "/user/index")
	public String hello(ModelMap model) {
		String userid = (String) model.get("userid");
		// is user logged in or not
		if (userService.findUserByUserId(userid) == null) // can't find user by userid
		{
			model.addAttribute("error", "LOGIN FIRST!!");
			return "login";
		}
		SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		System.out.println(formatter.format(date));
		List<Quiz> quizes = quizService.retrieveAllQuizes();
		model.addAttribute("quizes", quizes);
		return "index";
	}

	@PostMapping(value = "/logout")
	public String logout(ModelMap model) {
		String userid = (String) model.get("userid");
		if (userService.findUserByUserId(userid) == null) {
			model.addAttribute("error", "LOGIN FIRST!!");
			return "login";
		}
		userService.disconnected(userid);
		model.put("userid", "");
		model.put("adminid", "");
		model.put("logout", "YOU HAVE BEEN SUCCESSFULLY LOGGED OUT!!");
		return "home";
	}
	
	@PostMapping(value = "/logout-admin")
	public String logoutadmin(ModelMap model) {
		if (model.get("adminid").equals("")) {
			model.addAttribute("error", "LOGIN FIRST!!");
			return "login";
		}
		model.put("userid", "");
		model.put("adminid", "");
		model.put("logout", "YOU HAVE BEEN SUCCESSFULLY LOGGED OUT!!");
		return "home";
	}

}