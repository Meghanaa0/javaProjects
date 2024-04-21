package com.whileloop;

public class Palindrome {
	      public static void main(String args[]) {
	    	  int a=727,b=0,sum=0,c=0,d=a;
	    		while(a!=0) {
	    			b=a%10;
	    			sum=sum*10+b;
	    			a=a/10;
	    			c=c+1;
	    			
	    			
	    		}
	    		System.out.println(sum);
	    		if(d==sum) {
	    			System.out.println("palindrome");
	    		}
	    		else {
	    			System.out.println("not palindrome");
	    		}
	          }
	      }
	    	  
	      


