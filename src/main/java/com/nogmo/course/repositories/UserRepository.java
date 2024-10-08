package com.nogmo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nogmo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
