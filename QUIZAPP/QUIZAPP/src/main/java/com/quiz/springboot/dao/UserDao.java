package com.quiz.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.quiz.springboot.entity.UserDetails;

public interface UserDao extends CrudRepository<UserDetails, Integer> {

}
