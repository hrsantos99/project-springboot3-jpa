package com.nogmo.course.services.exceptions;

public class DatabaseExceptions extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DatabaseExceptions(Object id) {
		super("Cannot delete user with id " + id + " because it is associated with an order.");
	}

}