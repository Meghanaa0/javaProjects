package com.whileloop;

public class ReverseNumber {
	public static void main(String args[]) {
		int a=543,b=0,s=0;
		while(a>0) {
			b=a%10;
			s=s*10+b;
			a=a/10;
		}
		System.out.println(s);
	}

}