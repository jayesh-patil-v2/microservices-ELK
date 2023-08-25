package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Hotels;

public interface HotelRepository extends JpaRepository<Hotels, String> {

}

