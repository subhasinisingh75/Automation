package com.java.programs;

public class SwappingNumber {

	public static void main(String[] args) {
		int m=8; int n=4; int temp;
		
		temp=m;
		m=n;
		n=temp;
		
		System.out.println("value of m="+m);
		System.out.println("value of n="+n);
		
//		without temp variable
		
		int a=5; int b=10;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("value of a="+a);
		System.out.println("value of b="+b);
	}
	


}
