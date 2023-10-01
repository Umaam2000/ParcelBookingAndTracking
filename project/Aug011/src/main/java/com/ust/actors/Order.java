package com.ust.actors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private User user;
	@ManyToOne
	private Parcel Parcel;	
	private Short quantity;
	
	public Order() {}

	public Order(Long id, User user, Parcel Parcel, Short quantity) {
		super();
		this.id = id;
		this.user = user;
		this.Parcel = Parcel;
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Parcel getParcel() {
		return Parcel;
	}

	public void setParcel(Parcel Parcel) {
		this.Parcel = Parcel;
	}

	public Short getQuantity() {
		return quantity;
	}

	public void setQuantity(Short quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", user=" + user + ", Parcel=" + Parcel + ", quantity=" + quantity + "]";
	}
	
}
