package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Entity.Hotels;
import com.example.demo.HotelService.HotelService;

public class HotelController {
	
	@Autowired
    HotelService hotelService;

    @PostMapping("/addhotel")
    public Hotels saveHotel(@RequestBody Hotels hotel){
        return hotelService.saveHotel(hotel);
    }

    @GetMapping
    public List<Hotels> getAllHotel(){
        return hotelService.getAllHotel();
    }

    @GetMapping("/{id}")
    public Hotels getHotelById(@PathVariable("id") String hotelId){
        return hotelService.getHotelById(hotelId);
    }
}

