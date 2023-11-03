package com.keylane.lp.constants;

public final class TriangleConstants {

	private TriangleConstants() { // This prevents even the native class from instantiating this class
		throw new AssertionError(); 
	}
	public static final String WELCOME_MESSAGE = "Welcome to Triangle Trivia!";
	public static final String INPUT_MESSAGE = "Enter the lengths of three sides of the triangle:";
	public static final String CONTINUE_MESSAGE = "Do you wish to continue (Y/N): ";
	public static final String INVALID_MESSAGE = "Invalid response. Please enter Y/N";
	
	public static final String NOT_TRIANGLE = "Triangle cannot be formed using the given lengths";
	public static final String INVALID_INPUT = "Please enter positive integer numbers to determine the type of triangle";
	
	public static final String EQUILATERAL_TRIANGLE = "It's an equilateral triangle";
	public static final String ISOSCELES_TRIANGLE = "It's an isosceles triangle";
	public static final String SCALENE_TRIANGLE = "It's an scalene triangle";
	
	public static final String ERROR_TRIANGLE = "Triangle type cannot be determined";
}
