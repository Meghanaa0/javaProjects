package com.whileloop;

public class Technologyno {
	
	      public static void main(String args[]){
	    	  int num=2025,a=num,c=0;
	    	  while(a!=0) {
	    		  a/=10;
	    		  c++;
	    	  }
	    	  int c1=c/2;
	    	  System.out.println(c);
	    	  int n1=0,n2=0,sum=0,square=0;
	    	  if(c%2==0) {
	    		  n1=(int) (num/Math.pow(10,c1));
	    		  n2=(int) (num%Math.pow(10, c1));
	    	  }
	    	  System.out.println(n1);
	    	  System.out.println(n2);
	    	  sum=n1+n2;
	    	  square=sum*sum;
	    	  if(num==square) {
	    		  System.out.println("Technology Number");
	    	  }
	    	  else {
	    		  System.out.println("Not a technology Number");
	    	  }
	      }
}
//	    	  int a,c1=0,c=0;
//	    	  for(a=1;a<=1000;a++){
//	    		 int num=a;
//	    		   c=0;
//	    		  while(num!=0) { 
//	    			  num/=10;
//	    		      c++;
//	    		  }
//	    	  
//			      
//				//System.out.println(c);
//	    	    c1=c/2;
//	    	  int num1=0,num2=0,sum=0,square=0;
//	    	      if(c%2==0) {
//	    	    	  
//	    	    	  
//					num1=(int)(a/Math.pow(10, c1));
//					num2=(int)(a%Math.pow(10, c1));
//					System.out.println(num1);
//					System.out.println(num2);
//	    	    	  sum=num1+num2;
//	    	    	  square=sum*sum;
//	    	    	  if(sum==square) {
//	    	    		  System.out.println(a);
//	    	    	  }
//	    	    	  
//	    	  }
     
     

	    	 