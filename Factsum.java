package com.whileloop;

public class Factsum {
	public static void main(String args[]) {
		int a=5432,n=1,fact=1,b=0,sum=0;
		while(a!=0) {
			b=a%10;
			while(b>=n) {
				fact=fact*n;
				n++;
			}
			System.out.println(fact);
			sum=sum+fact;
			a=a/10;
		}
		System.out.println(sum);
		
		
	}
		
	

}
