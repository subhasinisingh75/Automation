package com.java.programs;

public class Factorial {

	public static void main(String[] args) {
	int n=9; int fact=1;
	
	for(int i=1; i<=n; i++)
	{
		fact= fact*i;
	}

	System.out.println("factorial of "+ n + " is: " + fact);
	}

}
