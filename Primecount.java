package com.whileloop;

public class Primecount {
	public static void main(String args[]) {
		int a=347,b=0,count=0;
		while(a!=0) {
			b=a%10;
			int n=2,c=0;
			while(n<=b/2) {
				if(b%n==0)
					c++;
			 n++;
			}
			
			if(c==0)
				count=count+1;
			a=a/10;
		}
		System.out.println(count);
		}
}