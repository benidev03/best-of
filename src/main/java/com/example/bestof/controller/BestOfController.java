package com.example.bestof.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bestof.model.Movie;
import com.example.bestof.model.Song;


@RestController

@RequestMapping("/bestof")

public class BestOfController {
	
	
	
	@GetMapping("/movie")
	public Movie film() {
		
		return new Movie();

	}
	
	@GetMapping("/song")
	public Song song() {
		
		return new Song();

	}
	

}
