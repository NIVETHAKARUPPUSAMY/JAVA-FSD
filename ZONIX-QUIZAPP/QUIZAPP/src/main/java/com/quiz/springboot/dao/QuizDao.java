package com.quiz.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.quiz.springboot.entity.Quiz;

public interface QuizDao extends CrudRepository<Quiz, Integer> {

}
