package com.whileloop;
public class IQ{
	public static void main(String args[]) {
	   int a=238898,b=0,c=0,mul1=1,mul2=1,mul3=1;
	   while(a>0) {
		   c++; 
	       b=a%10;
	       if(c==1 || c==2)
	    	  mul1=mul1*b; 
	       else if (c==3 || c==4)
	    	   mul2=mul2*b;
	       else      
	    	   mul3=mul3*b;
	       a=a/10;
	   }
	   System.out.println(mul1+mul2+mul3);
	}
}