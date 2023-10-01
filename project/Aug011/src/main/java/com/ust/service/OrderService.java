package com.ust.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.actors.Order;
import com.ust.actors.User;
import com.ust.repository.OrderRepository;


@Service
public class OrderService {
	@Autowired
	private OrderRepository cr;
	
	public Order create(Order order) {
		return cr.save(order);
	}
	public List<Order> read() {
		return cr.findAll();
	}
	public Order read(Long id) {
		Optional<Order> temp = cr.findById(id);
		Order order=null;
		if(temp.isPresent())
		{
			order=temp.get();
		}
		return order;
	}
	public Order update(Order order) {
		Order temp = read(order.getId());
		if(temp!=null)
		{
			temp=order;
			cr.save(temp);
		}
		return temp;
	}
	public Order delete(Long id) {
		Order order=read(id);
		if(order!=null)
		{
			cr.delete(order);
		}
		return order;
	}
	
	public List<Order> findOrdersByUser(User user)
	{
		return cr.findByUser(user);
	}
	
}
