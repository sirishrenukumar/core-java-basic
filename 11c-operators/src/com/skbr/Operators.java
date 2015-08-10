package com.skbr;

public class Operators {

	public static void main(String[] args) {
		
		/*
		 * Basic arithmetic operators
		 */
		int i = 1 + 3;
		int j = 2 - 1;
		int k = 1 * 2;
		int l = 2 / 1;
		
		/*
		 * Modulo operator produces the remainder
		 */
		int remainder = 11 % 10;
		
		/*
		 * Increment and decrement operators. Pre and Post forms
		 */
		int m = 7;
		int n = 7;
		int a = 2 * ++m; // now a is 16, m is 8
		int b = 2 * n++; // now b is 14, n is 8
		
		/*
		 * Relational operators
		 */
		System.out.println(" 1 == 2: " + (1==2));
		System.out.println(" 1 != 2: " + (1!=2));
		System.out.println(" 1 < 2: " + (1<2));
		System.out.println(" 1 <= 2: " + (1<=2));
		System.out.println(" 1 > 2: " + (1>2));
		System.out.println(" 1 >= 2: " + (1>=2));
		
		/*
		 * Boolean operators. Use short circuit evaluation
		 * 
		 * A && B, B is evaluated only when A is TRUE
		 * A || B, B is evaluated only when A is FALSE
		 */
		System.out.println("(1==2) && (2==1): " + ((1==2) && (2==1)));
		System.out.println("(1==2) || (2>1): " + ((1==2) || (2>1)));
		
		/*
		 * Ternary operator
		 */
		int x = 1;
		int y = 2;
		System.out.println("The smaller of x and y is: " + (x < y ? x : y));
		
		/*
		 * Bitwise operators 
		 * &, |, 
		 * left shift (equal to multiplying by 2 power N), 
		 * right shift (divide by 2 power N)
		 */
		System.out.println("Forth bit from right of 8 is: " + ((8 & 0b1000) / 0b1000));
		System.out.println(" 10 << 2 is: " + (10 <<2));
		System.out.println(" 40 >> 2 is: " + (40 >>2));
		
		/*
		 * No operator for raising a number to power. Need to use library method
		 */
		System.out.println(" 2 power 2 is: " + Math.pow(2,2));
		
		
	}

}
