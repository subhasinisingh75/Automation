package com.java.programs;

public class Ascending {

	public static void main(String[] args) {
		int arr[]={8,9,7,6,2,11,3,4,55,1,32};
		int temp;

		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)

			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}

	}

}
