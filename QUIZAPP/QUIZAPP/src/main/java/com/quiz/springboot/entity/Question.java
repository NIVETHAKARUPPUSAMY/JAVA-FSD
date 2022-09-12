package com.quiz.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Question {
	@Id
	@GeneratedValue
	private long id;
	private String quizid;
	private String questionid;
	private String questiondetails;
	private String correctanswer;

	public String getQuizid() {
		return quizid;
	}

	public void setQuizid(String quizid) {
		this.quizid = quizid;
	}

	public String getQuestionid() {
		return questionid;
	}

	public void setQuestionid(String questionid) {
		this.questionid = questionid;
	}

	public String getQuestiondetails() {
		return questiondetails;
	}

	public void setQuestiondetails(String questiondetails) {
		this.questiondetails = questiondetails;
	}

	public String getCorrectanswer() {
		return correctanswer;
	}

	public void setCorrectanswer(String correctanswer) {
		this.correctanswer = correctanswer;
	}

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Question(long id, String quizid, String questionid, String questiondetails, String correctanswer) {
		super();
		this.id = id;
		this.quizid = quizid;
		this.questionid = questionid;
		this.questiondetails = questiondetails;
		this.correctanswer = correctanswer;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Question [quizid=" + quizid + ", questionid=" + questionid + ", questiondetails=" + questiondetails
				+ ", correctanswer=" + correctanswer + "]";
	}

}
