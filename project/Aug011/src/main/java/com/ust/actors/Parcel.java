package com.ust.actors;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Parcel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String SenderName;
	private String deliveryAddress;
	private Double price;
	private String category;
	@Column(name = "delivery_date")
	private Date delivery_date;
	
	@ManyToOne
	private User user;
	
	public Parcel() {}

	public Parcel(Long id, String name, String description, Double price, String category, Date deliveryDate) {
		super();
		this.id = id;
		this.name = name;
		this.category = description;
		this.price = price;
		this.category = category;
		this.delivery_date = deliveryDate;
	}
	
	

	public Parcel(Long id, String name, String description, Double price, String category, Date deliveryDate,
			User user) {
		super();
		this.id = id;
		this.name = name;
		this.category = description;
		this.price = price;
		this.category = category;
		this.delivery_date = deliveryDate;
		this.user = user;
	}
	
	

	public Parcel(Long id, String name, String senderName, String deliveryAddress, Double price, String category,
			Date delivery_date, User user) {
		super();
		this.id = id;
		this.name = name;
		SenderName = senderName;
		this.deliveryAddress = deliveryAddress;
		this.price = price;
		this.category = category;
		this.delivery_date = delivery_date;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSenderName() {
		return SenderName;
	}

	public void setSenderName(String senderName) {
		SenderName = senderName;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getDelivery_date() {
		return delivery_date;
	}

	public void setDelivery_date(Date delivery_date) {
		this.delivery_date = delivery_date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Parcel [id=" + id + ", name=" + name + ", SenderName=" + SenderName + ", deliveryAddress="
				+ deliveryAddress + ", price=" + price + ", category=" + category + ", delivery_date=" + delivery_date
				+ ", user=" + user + "]";
	}

	
}

