package com.quiz.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "options")
public class Options {

	private String quizid;
	private String questionid;
	@Id
	@GeneratedValue
	private long optionid;
	private String optionvalue;

	public long getOptionid() {
		return optionid;
	}

	public void setOptionid(long optionid) {
		this.optionid = optionid;
	}

	public String getOptionvalue() {
		return optionvalue;
	}

	public void setOptionvalue(String optionvalue) {
		this.optionvalue = optionvalue;
	}

	public Options() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Options(String quizid, String questionid, long optionid, String optionvalue) {
		super();
		this.quizid = quizid;
		this.questionid = questionid;
		this.optionid = optionid;
		this.optionvalue = optionvalue;
	}

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

	@Override
	public String toString() {
		return "Options [quizid=" + quizid + ", questionid=" + questionid + ", optionid=" + optionid + ", optionvalue="
				+ optionvalue + "]";
	}

}
