package com.skbr;

public class DataTypesAndVariables {

	public static void main(String[] args) {
		
		/*
		 * 4 integer data type
		 */
		byte b;
		short s;
		int i;
		long l;
		
		/*
		 * 2 floating point 
		 */
		float f;
		double d;
		
		/*
		 * 1 boolean
		 */
		boolean bo;
		
		/*
		 * 1 character for UTF-16
		 */
		char ch;

		/*
		 * Compilation error since variable is uninitialized before use
		 */
		//System.out.println(i);

		/*
		 * Should be initialized before use
		 */
		int digit;
		digit = 1;
		System.out.println(String.format("Value of digit is %d", digit));
		
		/*
		 * Case- sensitive
		 */
		int number;
		int Number;
		
		/*
		 * Compilation error since reserved keyword is used
		 */
		//int switch;
		
		/*
		 * Can be placed anywhere in the code. By convention, place them closest to usage
		 */
		System.out.println("Learning about data type and variables");
		int countOfPrimitiveDataTypes = 8;
		System.out.println(String.format("There are total of %s primitive data types", countOfPrimitiveDataTypes));
	}
}
