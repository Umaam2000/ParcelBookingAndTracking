package com.ust.exception;

public class ParcelNotFoundException extends RuntimeException 
{
	public ParcelNotFoundException(String message)
	{
		super(message);
	}

}
