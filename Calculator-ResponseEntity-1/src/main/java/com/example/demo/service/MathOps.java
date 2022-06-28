package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MathOps {
	
	public String addtion(Integer first, Integer second) {
		Integer result=first+second;
		return result.toString();
	}
	
	public String subtraction(Integer first, Integer second) {
		Integer result=first-second;
		return result.toString();
	}
	
	public String multiplication(Integer first, Integer second) {
		Integer result=first*second;
		return result.toString();
	}
	
	public String devide(Integer first, Integer second) {
		try {
			Integer result=first/second;
			return result.toString();
		} catch (ArithmeticException e) {
			return "invalid math operation";
		}
	}
}
