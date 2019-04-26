package com.fizzbuzz.rest.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fizzbuzz.rest.contstants.FizzBuzzConstants;
import com.fizzbuzz.rest.service.FizzBuzzService;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author bgrbalu 
 * Controller class to determine FizzBuzz
 */
@RestController
@RequestMapping("/fizz")
public class FizzBuzzController {

	@Autowired
	FizzBuzzService fbService;
	
	@RequestMapping("/index")
	// returns the static msg to help checking the service is up
	public String welcome() {
		return FizzBuzzConstants.WELCOME;
	}

	/**
	 * Call the service to determine and return FIZZ/BUZZ/FIZZBUZZ
	 * 
	 * @return String of either Fizz / Buzz / FizzBuzz
	 */
	@RequestMapping("/next")
	public String next() {
		//log.info("FizzBuzzService.next");
		return fbService.next(); // Service call
	}
	
	@RequestMapping("/reset")
	public String reset() {
		return fbService.reset();
	}
}
