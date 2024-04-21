package com.whileloop;

public class Armstrong {
        public static void main(String args[]) {
        
        	int a=44,d,s=0,t,c=0,m=0;
        	d=a;
        	t=a;
        	while(t!=0) {
        		t/=10;
        		c++;
        	}
        	t=d;
        	
        	System.out.println(c);
        	int b=0;
        	while(t!=0) {
        		b=t%10;
        		int g=(int)(Math.pow(b,c));
        		 s=s+g;
        		 
        		 t=t/10;
        		//(int) Math.pow(b, c);
        		
        		
        		 
        		
        	}
        	System.out.println(s);
        	
        	
        	if(s==a) {
        		System.out.println("Armstrong");
        		
        	}
        	else {
        		System.out.println("Not a armstrong");
        	}
        }
}