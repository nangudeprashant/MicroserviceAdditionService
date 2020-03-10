package com.javaLive.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionRESTController {
	@RequestMapping(value = "/add/{num1}/{num2}", method = RequestMethod.GET)
	public ResponseEntity<?> add(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
		Double result = num1 + num2;
		System.out.println("Welcome to JavaLive Micro Service Demo Application\n" + "Enterd values are " + num1 + " and " + num2 + "\n"
				+ "Arithmetic operation selected is addition.\n" + "Result is " + result);
		return new ResponseEntity<Double>(result, HttpStatus.OK);
	}
}
