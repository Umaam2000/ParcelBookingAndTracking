package com.ust.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.actors.Parcel;
import com.ust.actors.User;
import com.ust.exception.ParcelNotFoundException;
import com.ust.repository.ParcelRepository;



@Service
public class ParcelService {
	@Autowired
	private ParcelRepository pr;
	
	public Parcel create(Parcel parcel) {
		return pr.save(parcel);
	}
	public List<Parcel> read() {
		return pr.findAll();
	}
	public Parcel read(Long id) {
		Optional<Parcel> temp = pr.findById(id);
		Parcel parcel=null;
		if(temp.isPresent())
		{
			parcel=temp.get();
		}
		return parcel;
	}
	public Parcel update(Parcel parcel) {
		Parcel temp = read(parcel.getId());
		if(temp!=null)
		{
			temp=parcel;
			pr.save(temp);
		}
		return temp;
	}
	public Parcel delete(Long id) {
		Parcel parcel=read(id);
		if(parcel!=null)
		{
			pr.delete(parcel);
		}
		return parcel;
	}
	
	public List<Parcel> findParcelsByUser(User user)
	{
		return pr.findByUser(user);
	}
	
	
//	public List<Parcel> read(Date date) {
//		// TODO Auto-generated method stub
//		List<Parcel>temp=pr.findByDate(date);
//		if(temp.isEmpty()) {
//			throw new ParcelNotFoundException("You Have No Parcel On this day");
//		}
//		return temp;
//	}
}
