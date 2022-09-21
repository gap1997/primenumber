package com.primenumber.primenumber.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.primenumber.primenumber.entities.Number;
import com.primenumber.primenumber.service.NumberService;


@RestController
public class Mycontroller {
	@Autowired
	public NumberService numberService;
	
	@GetMapping("/home")
     public String home() {
		
    	 return "welcome to prime number genrator";
    	   }
     
     
     //get the numbers
	
	@GetMapping("/numbers")
	public List<Number> getNumbers()
	{
		return this.numberService.getNumbers();
	}
	
	@GetMapping("numbers/{numberId}")
	public Number getNumber(@PathVariable String numberId)
	{
		return this.numberService.getNumber(Long.parseLong(numberId));
	}
     
     
}
