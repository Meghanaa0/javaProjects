package com.whileloop;

public class Factors {
	   public static void main(String args[]) {
		   int a=45,b=1,c=0;
		   while(a>=b) {
			   if(a%b==0) {
				   System.out.println(b);
				   c++;
			   }
			   
			   b++;
		   }
		   if(c>3) {
			   System.out.println("super number");
			   
		   }
		   else {
			   System.out.println("Not a super number");
		   }
	   }

}
