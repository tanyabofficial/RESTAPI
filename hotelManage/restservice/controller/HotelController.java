package com.hotelmanage.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelmanage.restservice.entity.Hotel;
import com.hotelmanage.restservice.repository.HotelRepository;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/hotels")
public class HotelController {

    @Autowired
    private HotelRepository repository;

    @GetMapping
    public Iterable<Hotel> findAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/{hotelname}")
    public Hotel find(@PathVariable("hotelname") String hotelname) {
        return repository.findOne(hotelname);
    }

    @PostMapping(consumes = "application/json")
    public Hotel create(@RequestBody Hotel hotelname) {
        return repository.save(hotelname);
    }

    @DeleteMapping(path = "/{hotelname}")
    public void delete(@PathVariable("hotelname") String hotelname) {
        repository.delete(hotelname);
    }

    @PutMapping(path = "/{hotelname}")
    public Hotel update(@PathVariable("hotelname") String hotelname, @RequestBody Hotel hotel) throws BadHttpRequest {
        if (repository.exists(hotelname)) {
            hotel.setHotelname(hotelname);
            return repository.save(hotel);
        } else {
            throw new BadHttpRequest();
        }
    }

}
