package com.ust.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.actors.Parcel;
import com.ust.actors.User;
import com.ust.service.ParcelService;



@RestController
@CrossOrigin("*")
@RequestMapping("/parcel")
public class ParcelController {
	@Autowired
	private ParcelService ps;
	
	@PostMapping
	public Parcel create(@RequestBody Parcel parcel) {
		return ps.create(parcel);
	}
	
	@GetMapping
	public List<Parcel> read() {
		return ps.read();
	}
	
	@GetMapping("/{id}")
	public Parcel read(@PathVariable("id") Long id) {
		return ps.read(id);
	}
	
	@PutMapping("/{id}")
	public Parcel update(@PathVariable("id") Long id,@RequestBody Parcel parcel) {
		return ps.update(parcel);
	}
	
	@DeleteMapping("/{id}")
	public Parcel delete(@PathVariable("id") Long id) {
		return ps.delete(id);
	}
	
	@PostMapping("/user")
	public List<Parcel> findParcelsByUser(@RequestBody User user)
	{
		return ps.findParcelsByUser(user);
	}
	
//	@GetMapping
//	public List<Parcel> findParcelsByDate(@PathVariable("delivery_date") Date date){
//		return ps.read(date);
//		
//	}
}
