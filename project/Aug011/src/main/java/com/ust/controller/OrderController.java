package com.ust.controller;

import java.util.List;

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

import com.ust.actors.Order;
import com.ust.actors.User;
import com.ust.service.OrderService;
@RestController
@CrossOrigin("*")
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService cs;
	
	@PostMapping
	public Order create(@RequestBody Order order) {
		return cs.create(order);
	}
	
	@GetMapping
	public List<Order> read() {
		return cs.read();
	}
	
	@GetMapping("/{id}")
	public Order read(@PathVariable("id") Long id) {
		return cs.read(id);
	}
	
	@PutMapping("/{id}")
	public Order update(@PathVariable("id") Long id,@RequestBody Order order) {
		return cs.update(order);
	}
	
	@DeleteMapping("/{id}")
	public Order delete(@PathVariable("id") Long id) {
		return cs.delete(id);
	}
	
	@PostMapping("/user")
	public List<Order> findOrdersByUser(@RequestBody User user)
	{
		return cs.findOrdersByUser(user);
	}
}
