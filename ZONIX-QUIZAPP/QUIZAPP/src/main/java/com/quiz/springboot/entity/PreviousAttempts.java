package com.quiz.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "previousattempts")
public class PreviousAttempts {

	public String userid;
	@Id
	public String quizid;
	public String date;
	public String score;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getQuizid() {
		return quizid;
	}

	public void setQuizid(String quizid) {
		this.quizid = quizid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public PreviousAttempts(String userid, String quizid, String date, String score) {
		super();
		this.userid = userid;
		this.quizid = quizid;
		this.date = date;
		this.score = score;
	}

	public PreviousAttempts() {
		super();
		// TODO Auto-generated constructor stub
	}

}