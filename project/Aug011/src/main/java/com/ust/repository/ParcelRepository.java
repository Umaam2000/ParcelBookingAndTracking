package com.ust.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.actors.Parcel;
import com.ust.actors.User;

@Repository
public interface ParcelRepository extends JpaRepository<Parcel, Long>
{
	List<Parcel> findByUser(User user);
//	List<Parcel> findByDate(Date date);
}
