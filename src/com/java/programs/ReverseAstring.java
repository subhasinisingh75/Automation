package com.java.programs;

public class ReverseAstring {

	public static void main(String[] args) {
		String s="subhasini";
		String rev= "";
		
		int leng=s.length();
		for(int i=leng-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		//By using StringBuffer
		
		StringBuffer name=new StringBuffer("Sasha");
		System.out.println("string:" + name);
		System.out.println("reverse string:" + name.reverse());
		
		

	}

}
