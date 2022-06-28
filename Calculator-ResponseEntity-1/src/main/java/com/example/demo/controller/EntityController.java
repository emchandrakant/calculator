package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MathOps;

@RestController
public class EntityController {
	
	@Autowired
	MathOps mathOps;
	
	@GetMapping("/acceptinput")
	public ResponseEntity<String> choices(@RequestParam(name="radChoice") String choice, @RequestParam Integer txtFnum, @RequestParam Integer txtSnum) {
		switch (choice){
		case "a":
			return ResponseEntity.ok(mathOps.addtion(txtFnum, txtSnum));
		case "s":
			return ResponseEntity.ok(mathOps.subtraction(txtFnum, txtSnum));
		case "m":
			return ResponseEntity.ok(mathOps.multiplication(txtFnum, txtSnum));
		case "d":
			if(txtSnum==0)
				return ResponseEntity.internalServerError().body(mathOps.devide(txtFnum, txtSnum));
			else
				return ResponseEntity.ok(mathOps.devide(txtFnum, txtSnum));
		default :
			return null;
		}
	}
}
