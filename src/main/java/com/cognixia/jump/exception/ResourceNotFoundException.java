package com.cognixia.jump.exception;

/**
 * The custom exception for a resource that was not found.
 * @author Lori White
 * @version v1 (08/25/2020)
 */
public class ResourceNotFoundException extends Exception{
	private static final long serialVersionUID = 5777514695224236672L;
	/**
	 * The overloaded constructor.
	 * @author Lori White
	 * @param message the custom error message
	 */
	public ResourceNotFoundException(String message) {
		super(message);
	}
}
