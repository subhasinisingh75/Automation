package com.java.programs;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=17; int m=0; int flag=0;
		m=num/2;
		
		if(num==0 || num==1)
		{
			System.out.println(num+"its not a prime number");
		}else{
			for(int i=2; i<=m; i++)
			{
				if(num%i == 0)
				{
					System.out.println(num+"its not a prime number");
					flag=1;
					break;
					
				}
				
			}
			if(flag==0)
			{
				System.out.println(num+"its a prime number");
			}
		}

	}

}
