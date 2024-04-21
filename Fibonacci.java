package com.whileloop;

public class Fibonacci {
	public static void main(String args[]) {
		int f=0,s=1,t=0,a=8,b=1;
		while(a>=b) {
			t=f+s;
			f=s;
			s=t;
			System.out.print("\t"+t);
			b++;
			
		}
	}
	

}