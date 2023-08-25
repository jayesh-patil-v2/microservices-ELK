package com.example.demo.HotelService;

import java.util.List;

import com.example.demo.Entity.Hotels;

public interface HotelService {
	
	 public List<Hotels> getAllHotel();

	    //Get by id
	    public Hotels getHotelById(String hotelId);

	    //Create a user
	    public Hotels saveHotel(Hotels hotel);

}
