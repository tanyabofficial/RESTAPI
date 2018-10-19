package com.hotelmanage.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hotelmanage.restservice.entity.User;

@RepositoryRestResource(exported = false)
public interface UserRepository extends JpaRepository<User, String> {

}