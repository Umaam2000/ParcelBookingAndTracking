package com.ust.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.actors.Order;
import com.ust.actors.Parcel;
import com.ust.actors.User;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>
{
	List<Order> findByUser(User user);
}
