package com.whileloop;

public class Prime {
	public static void main(String args[]) {
		int a=7,b=20;
		while(a<=b) {
			int i=2,c=0;
			while(a>i) {
				if(a%i==0) {
					c++;
				}
				i++;
			}
			
			if(c==0) {
				System.out.println(a);
			
			}
			a++;
			
		}
			
		}
}
			