package com.email.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin({"http://localhost:4200/","*"})
public class MyController {

	@Autowired
	private EmailServiceImpl email;
	
	@GetMapping
	public String sendEmail()
	{
		Integer otp=(int)((Math.random()*1000)+(Math.random()*1000)+(Math.random()*1000)+(Math.random()*1000));
		email.sendSimpleMessage("umaam2000@gmail.com", "Verification mail","hi arjun this is your otp"+otp);
		
		return otp.toString();
	}
}