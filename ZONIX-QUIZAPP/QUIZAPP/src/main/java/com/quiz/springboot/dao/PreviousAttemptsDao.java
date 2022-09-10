package com.quiz.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.quiz.springboot.entity.PreviousAttempts;

public interface PreviousAttemptsDao extends CrudRepository<PreviousAttempts, Integer> {

}
