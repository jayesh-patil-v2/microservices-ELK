package com.example.demo.HotelServiceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Entity.Hotels;
import com.example.demo.HotelService.HotelService;
import com.example.demo.repository.HotelRepository;

public class HotelServiceImple implements HotelService {
	
	@Autowired
	HotelRepository hotelRepository;

	@Override
	public List<Hotels> getAllHotel() {
		return hotelRepository.findAll();
	}
	
	@Override
	public Hotels getHotelById(String hotelId) {
		return hotelRepository.findById(hotelId).get();
	}

	@Override
	public Hotels saveHotel(Hotels hotel) {
		return hotelRepository.save(hotel);
	}

}