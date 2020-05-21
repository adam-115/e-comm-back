package com.it.dao;

import org.springframework.data.repository.CrudRepository;

import com.it.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
