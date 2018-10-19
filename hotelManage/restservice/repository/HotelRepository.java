package com.hotelmanage.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hotelmanage.restservice.entity.Hotel;

@RepositoryRestResource(exported = false)
public interface HotelRepository extends JpaRepository<Hotel, String> {

}
