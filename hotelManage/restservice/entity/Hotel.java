package com.hotelmanage.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel {

    @Id
    private String hotelname;
    private String city;
    private String memberNumber;
    private String acFac;
    private String restaurant;
    private String stars;
    
    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber;
    }

    public String getAC() {
        return acFac;
    }

    public void setAC(String acFac) {
        this.acFac = acFac;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }


    @Override
    public String toString() {
        return "Hotel{" + "hotelname='" + hotelname + '\'' + ", city='" + city + '\'' + ", memberNumber='" + memberNumber + '\''
                + ", acFac='" + acFac + '\'' + ", restaurant='" + restaurant + '\'' + ", stars='" + stars + '\'' +'}';
    }
}
