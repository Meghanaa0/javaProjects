package com.whileloop;

public class Armstrongrange {
	public static void main(String args[])
	{
		for(int i=1;i<=1000;i++) {
			int n=i,a=i,c=0,b=0,sum=0;
			while(n!=0) {
				n/=10;
				c++;
			}
			while(a!=0) {
				b=a%10;
				int p=(int)(Math.pow(b, c));
				sum=sum+p;
				a/=10;
			}
			if(i==sum) {
				System.out.println(i);
			}
		}
	}
}