package com.whileloop;

public class Magic{
	public static void main(String args[]) {
		int a=1,sum=0,product=1;
		for(;a<=1000;a++) {
			int b=0;
			sum=0;
			int x=a;
			
			product=1;
			while(x!=0) {
				b=x%10;
				sum=sum+b;
				product=product*b;
				x=x/10;
			}
			if(sum==product)
				System.out.println(a+" is magic number");
		}
	}

}
