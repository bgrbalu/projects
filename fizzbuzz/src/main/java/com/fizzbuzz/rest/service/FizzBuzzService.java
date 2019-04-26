package com.fizzbuzz.rest.service;

import org.springframework.stereotype.Service;

import com.fizzbuzz.rest.contstants.FizzBuzzConstants;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author bgrbalu 
 * Service class to decide and return Fizz/Buzz
 *
 */
@Service
@Slf4j
public class FizzBuzzService {

	/**
	 * @author bgrbalu
	 */

	private int val = 0;

	/**
	 * Method to determine FIZZ/BUZZ/FIZZBUZZ for sequential increment based on the
	 * rest trigger
	 * 
	 * @return the string of FIZZ/BUZZ/FIZZBUZZ
	 */
	public String next() {

		val = val+1;
		log.info("Serving FizzBuzzService.next() for :" +val);
		if ((val % 3) == 0 && (val % 5) == 0) {
			return FizzBuzzConstants.FIZZBUZZ;
		} else if ((val % 3) == 0) {
			return FizzBuzzConstants.FIZZ;
		} else if ((val % 5) == 0) {
			return FizzBuzzConstants.BUZZ;
		} else
			return String.valueOf(val);
	}

	public String reset() {
		val = 0;
		return FizzBuzzConstants.SUCCESS;
	}
}
