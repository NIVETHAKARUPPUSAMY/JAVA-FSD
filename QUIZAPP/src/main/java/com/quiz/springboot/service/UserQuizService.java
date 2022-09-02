package com.quiz.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.springboot.entity.Question;

@Service
public class UserQuizService {

	@Autowired
	QuestionService questionService;
	
	public List<Question> paddingQuestions(String quizid)
	{
		List<Question> questions = questionService.retrieveQuestionsByQuizId(quizid);
		Question start = new Question(0 , quizid, "start", "", "");
		Question end = new Question(0 , quizid, "end", "", "");
		
		List<Question> paddedQuestions = new ArrayList<Question>();
		
		paddedQuestions.add(start);
		for(Question question : questions)
		{
			paddedQuestions.add(question);
		}
		paddedQuestions.add(end);
		
		return paddedQuestions;
	}
	
	public Question retrieveFirstQuestion(String quizid)
	{
		List<Question> questions = questionService.retrieveQuestionsByQuizId(quizid);
		if(questions.size()>0)
		{
			return questions.get(0);
		}
		return null;
	}
	
	public Question getNextQuestion(String quizid , String questionId) {
		List<Question> questions = paddingQuestions(quizid);
		int pos = 0;
		for (int i = 0; i < questions.size() - 1; i++) {
			if (questions.get(i).getQuestionid().equals(questionId)) {
				pos = i;
				break;
			}
		}

		return questions.get(pos + 1);
	}
	
	public String searchCorrectAnswer(String quizid , String questionid)
	{
		Question question = questionService.viewQuestion(quizid, questionid);
		return question.getCorrectanswer();
	}
	
	public boolean isCorrectAnswer(String correct , String response)
	{
		return correct.equals(response);
	}
}
