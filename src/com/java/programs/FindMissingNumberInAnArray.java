package com.java.programs;

public class FindMissingNumberInAnArray {

	public static void main(String[] args) {
		int num[]={1,2,3,5,6,7,8};
		int sum=0;
		
		for(int i=0;i<num.length; i++)
		{
			sum= sum+ num[i];
		}
		int sum1=0;
		for(int j=1; j<=8; j++)
		{
			sum1= sum1+ j;
		}
		
		System.out.println("missing number="+ (sum1-sum));
	}

}
