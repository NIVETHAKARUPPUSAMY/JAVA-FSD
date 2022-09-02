package com.quiz.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.springboot.dao.PreviousAttemptsDao;
import com.quiz.springboot.entity.PreviousAttempts;

@Service
public class PreviousAttemptsService {

	@Autowired
	PreviousAttemptsDao prevoiusAttemptsDao;
	
	public void addPreviousAttempts(PreviousAttempts previousAttempts)
	{
		 prevoiusAttemptsDao.save(previousAttempts);
	}
	
	public PreviousAttempts retrievePreviousAttempts(String quizid)
	{
		List<PreviousAttempts> previousAttempts = (List<PreviousAttempts>) prevoiusAttemptsDao.findAll();
		
		for(PreviousAttempts previousAttempt : previousAttempts)
		{
			if(previousAttempt.getQuizid().equals(quizid))
			{
				return previousAttempt;
			}
		}
		return null;
	}
	
	public List<PreviousAttempts> retrievePreviousAttemptsUserid(String userid)
	{
		List<PreviousAttempts> previousAttempts = (List<PreviousAttempts>) prevoiusAttemptsDao.findAll();
		List<PreviousAttempts> attempts = new ArrayList<PreviousAttempts>();
		for(PreviousAttempts previousAttempt : previousAttempts)
		{
			if(previousAttempt.getUserid().equals(userid))
			{
				attempts.add(previousAttempt);
			}
		}
		return attempts;
	}
	
	public String [] getScoreDiv(String score)
	{
		String [] div = score.split(" / ");
		
		return div;
	}
}
