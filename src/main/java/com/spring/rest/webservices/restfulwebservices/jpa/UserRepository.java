package com.spring.rest.webservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.webservices.restfulwebservices.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
