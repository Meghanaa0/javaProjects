package com.whileloop;

public class Shilongrange {
     public static void main(String args[]) {
    	
    	 int sum=0,product=1;
    	 for(int a=1;a<=100;a++) {
    		 int i=1;
    		 sum=0;
    		 product=1;
    		 while(i<=a/2) {
    			 if(a%i==0) {
    			 sum=sum+i;
    			 product=product*i;
    			 }
    			  
    			 i++;
    			 
    		 }
    		 if(sum==product) {
    			 System.out.println(a);
    			 
    		 }
    		 
    	 }
    	 
		   
    	 
     
    	
    	 }
}