package com.java.programs;

public class Palindrome {

	public static void main(String[] args) {
	int num=797; int c=0; int a,temp;
	temp=num;
	
	while(num>0)
	{
		a=num%10;
		num=num/10;
		c= (c*10)+a;
	}
	if(temp==c)
	{
		System.out.println("it's a palindrome number");
	}else{
		System.out.println("it's not a palindrome number");
	}

	}

}
