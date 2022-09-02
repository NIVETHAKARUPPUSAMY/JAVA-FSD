package com.quiz.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.quiz.springboot.entity.Options;

public interface OptionsDao extends CrudRepository<Options, Integer> {

}
