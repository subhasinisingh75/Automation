package com.java.programs;

public class Armstrong {

	public static void main(String[] args) {
		int n= 370; int c=0; int a,temp;
		temp=n;
		
		while(n>0)
		{
			a= n%10;
			n= n/10;
			c= c+(a*a*a);
			
		}
		if(temp==c)
		{
			System.out.println(temp+" is an armstrong number");
			
		}else{
			System.out.println(temp+" this is not an armstrong number");
		}
		

	}

}
