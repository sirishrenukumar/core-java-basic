package com.skbr;

public class PrimitiveTypeConversion {

	public static void main(String[] args) {
		
		/*
		 * When two values are combined with a binary operator (such as n + f where n is an integer and f is a floating-point value), 
		 * both operands are converted to a common type before the operation is carried out.
		 * 
		 * • If either of the operands is of type double, the other one will be converted to a double.
		 * 
		 * • Otherwise, if either of the operands is of type float, the other one will be converted to a float.
		 * 
		 * • Otherwise, if either of the operands is of type long, the other one will be converted to a long.
		 * 
		 * • Otherwise, both operands will be converted to an int.
		 */
		
		byte b = 1;
		short s = 2;
		int i = 3;
		int l = 4;
		float f = 5;
		double d = 6;
		
		/*
		 * No loss of precision and automatically supported
		 */
		s = b;
		i = s;
		l = i;
		
		d= f;
		
		/*
		 * Need explicit cast to support conversion with loss of precision
		 */
		b = (byte) s;
		s = (short) i;
		i = (int) l;
		f = (float) d;
		
		/*
		 * No conversion supported from boolean to numeric type
		 */
		boolean bo = true;
		//int i = (int)bo;
		
		
	}

}
