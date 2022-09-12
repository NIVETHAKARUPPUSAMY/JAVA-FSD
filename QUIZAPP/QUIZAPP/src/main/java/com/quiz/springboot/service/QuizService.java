package com.quiz.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.springboot.dao.QuizDao;
import com.quiz.springboot.entity.Quiz;

@Service
public class QuizService {

	@Autowired
	QuizDao quizDao;

	public List<Quiz> retrieveAllQuizes() {
		return (List<Quiz>) quizDao.findAll();
	}

	public Quiz retrieveByQuizId(String quizid) {
		List<Quiz> allQuizes = retrieveAllQuizes();

		for (Quiz quiz : allQuizes) {
			if (quiz.getQuizid().equals(quizid)) {
				return quiz;
			}
		}
		return null;
	}
	
	public void add(Quiz quiz)
	{
		quizDao.save(quiz);
	}
	
	public boolean isQuizIdPresent(String quizid)
	{
		if(retrieveByQuizId(quizid)==null)
		{
			return false;
		}
		return true;
	}
	
	public void remove(String quizid)
	{
		quizDao.delete(retrieveByQuizId(quizid));
	}
}
