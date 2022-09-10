package com.quiz.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quiz")
public class Quiz {

	@Id
	private String quizid;
	private String quizname;
	private String quizdetails;

	public String getQuizid() {
		return quizid;
	}

	public void setQuizid(String quizid) {
		this.quizid = quizid;
	}

	public String getQuizname() {
		return quizname;
	}

	public void setQuizname(String quizname) {
		this.quizname = quizname;
	}

	public String getQuizdetails() {
		return quizdetails;
	}

	public void setQuizdetails(String quizdetails) {
		this.quizdetails = quizdetails;
	}

	public Quiz(String quizid, String quizname, String quizdetails) {
		super();
		this.quizid = quizid;
		this.quizname = quizname;
		this.quizdetails = quizdetails;
	}

	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Quiz [quizid=" + quizid + ", quizname=" + quizname + ", quizdetails=" + quizdetails + "]";
	}

}
