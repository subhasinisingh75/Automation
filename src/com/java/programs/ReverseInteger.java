package com.java.programs;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int n=54321;
		int rev=0;
		
		while( n!=0)
		{
			rev=(rev*10)+ n%10;
			n=n/10;
		}
		System.out.println(rev);

		
		//StringBuffer
		
		long num=6789;
		
		System.out.println(new StringBuffer(String.valueOf(num)).reverse());
	}
	
	
	

}
