package com.whileloop;

public class Evenoddsum {
	public static void main(String args[]) {
		long a=768923511,b=0,evensum=0,oddsum=0,c1=0,s1=0,d=0;
		while(a!=0) {
			b=a%10;
			if(b%2==0) {
				evensum=evensum+b;
			}
			else {
				oddsum=oddsum+b;
			}
			a=a/10;
		}
		System.out.println("evensum:"+evensum);
		System.out.println("oddsum:"+oddsum);
		long t=evensum;
		long s3=evensum;
    	while(evensum!=0) {
    		evensum/=10;
    		c1++;
    	}
    	System.out.println(c1);
    	
    	
    	while(t!=0) {
    		d=t%10;
    		int i=0,p=1;
    		while(i<c1) {
    			p=(int)(p*d);
    			i++;
    		}
    		s1=s1+p;
    		t=t/10;
    		
    	}
    	System.out.println(s1);
    	if(s1==s3) {
    		System.out.println("Armstrong");
    	}
    	else {
    		System.out.println("Not armstrong");
    		
    	}
      
    	
	}
}

