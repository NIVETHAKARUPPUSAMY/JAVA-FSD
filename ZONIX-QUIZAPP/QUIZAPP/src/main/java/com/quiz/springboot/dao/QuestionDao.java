package com.quiz.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.quiz.springboot.entity.Question;

public interface QuestionDao extends CrudRepository<Question, Integer> {

}
