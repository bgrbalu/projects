package com.fizzbuzz.rest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class FizzbuzzApplicationTests {

	@Test
	public void contextLoads() {
		RestTemplate restTemplate = new RestTemplate();
		
		String resetStatus = restTemplate.getForObject("http://localhost:8080/fizz/reset", String.class);
		
		for (int cnt = 1; cnt <= 100; cnt++) {
			try {
				String result = restTemplate.getForObject("http://localhost:8080/fizz/next", String.class);
			if ((cnt % 3) == 0 && (cnt % 5) == 0) {
				assertEquals("FizzBuzz", result);
			} else if ((cnt % 3) == 0) {
				assertEquals("Fizz", result);
			} else if ((cnt % 5) == 0) {
				assertEquals("Buzz", result);
			} else {
				assertEquals(String.valueOf(cnt), result);
			}
			}catch (RestClientResponseException e) {
				log.debug("Error at service response :" +e.getMessage() );
			}catch (Exception exp) {
				log.debug("Exception at test case execution : "+exp.getMessage());
			}
		}
	}

}
