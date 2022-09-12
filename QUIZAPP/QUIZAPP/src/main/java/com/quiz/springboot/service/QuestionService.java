package com.quiz.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.springboot.dao.QuestionDao;
import com.quiz.springboot.entity.Question;

@Service
public class QuestionService {

	@Autowired
	QuestionDao questionDao;

	public List<Question> retrieveQuestionsByQuizId(String quizid) {
		List<Question> allQuestions = (List<Question>) questionDao.findAll();
		List<Question> quizQuestion = new ArrayList<Question>();

		for (Question question : allQuestions) {
			if (question.getQuizid().equals(quizid)) {
				quizQuestion.add(question);
			}
		}
		return quizQuestion;
	}

	public void addQuestion(Question question) {
		questionDao.save(question);
	}

	public void deleteQuestion(String quizid, String questionid) {
		List<Question> quizQuestion = retrieveQuestionsByQuizId(quizid);

		for (Question question : quizQuestion) {
			if (question.getQuestionid().equals(questionid)) {
				questionDao.delete(question);
			}
		}
	}

	public Question viewQuestion(String quizid, String questionid) {
		List<Question> quizQuestion = retrieveQuestionsByQuizId(quizid);

		for (Question question : quizQuestion) {
			if (question.getQuestionid().equals(questionid)) {
				return question;
			}
		}
		return null;
	}

	public boolean isQuestionIdExists(String quizid, String questionid) {
		if (viewQuestion(quizid, questionid) == null) {
			return false;
		}
		return true;
	}
	
	public void deleteQuestions(String quizid)
	{
		List<Question> questions = retrieveQuestionsByQuizId(quizid);
		for(Question question : questions)
		{
			questionDao.delete(question);
		}
	}
}
