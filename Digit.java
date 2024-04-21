package com.whileloop;

public class Digit {
	public static void main(String args[]) {
		int a=17546,c=0,b=0,sum=0,e;
		while(a!=0) {
			b=a%10;
			if(b%2==0) {
				b+=2;
			}
			else {
				b++;
			}
			a=a/10;
			c=c+1;
			sum=sum+b;
			System.out.print(b);
			
			
		}
		System.out.println("\t"+c);
		
	}

}