package com.fizzbuzz.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
/**
 * 
 * @author bgrbalu
 * Springboot starter class for FizzBuzz service
 */
@SpringBootApplication
@Slf4j
public class FizzbuzzApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzbuzzApplication.class, args);
		log.info("FizzbuzzApplication Successfully Launched!");
	}

}
