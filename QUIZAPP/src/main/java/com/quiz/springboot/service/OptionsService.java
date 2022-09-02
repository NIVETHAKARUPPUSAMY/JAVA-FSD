package com.quiz.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.springboot.dao.OptionsDao;
import com.quiz.springboot.entity.Options;

@Service
public class OptionsService {

	@Autowired
	OptionsDao optionsDao;

	public List<Options> getOptionsByQuestions(String quizid, String questionid) {
		List<Options> allOptions = (List<Options>) optionsDao.findAll();
		List<Options> questionOptions = new ArrayList<Options>();

		for (Options options : allOptions) {
			if (options.getQuizid().equals(quizid) && options.getQuestionid().equals(questionid)) {
				questionOptions.add(options);
			}
		}
		return questionOptions;
	}

	public List<Options> getOptionsByQuizes(String quizid) {
		List<Options> allOptions = (List<Options>) optionsDao.findAll();
		List<Options> questionOptions = new ArrayList<Options>();

		for (Options options : allOptions) {
			if (options.getQuizid().equals(quizid)) {
				questionOptions.add(options);
			}
		}
		return questionOptions;
	}

	public void addOption(Options option) {
		optionsDao.save(option);
	}

	public void deleteOptions(String quizid, String questionid) {
		List<Options> questionOptions = getOptionsByQuestions(quizid, questionid);
		questionOptions = new ArrayList<Options>(questionOptions);

		for (Options option : questionOptions) {
			optionsDao.delete(option);
		}
	}

	public void deleteOptions(String quizid) {
		List<Options> options = getOptionsByQuizes(quizid);
		options = new ArrayList<Options>(options);

		for (Options option : options) {
			optionsDao.delete(option);
		}
	}
	
	public boolean isOptionsMatch(String op1 , String op2 , String op3 , String op4 , String correct)
	{
		return (op1.equals(correct) || op2.equals(correct) || op3.equals(correct) || op4.equals(correct));
	}

}
