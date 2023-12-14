package com.myproject.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
