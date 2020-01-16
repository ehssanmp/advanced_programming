package com.example.demo.test;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.test.User;

public interface UserRepository extends CrudRepository<User, Long> {
	public boolean findByUserName(String username);
	public boolean findByPassword(String password);
}

