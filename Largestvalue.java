package com.whileloop;

public class Largestvalue {
	public static void main(String args[]) {
		
	
	/*int a=2346785,b=0,d=0,c=0;
	while(a>0) {
		c++;
		b=a%10;
		if(b>d) {
			d=b;
		}
		a=a/10;                                                   
	}
	System.out.println(d);	
	}

}*/
		int a=2375132,b=0,c=0,m=0;
		while(a>0) {
			
			b=a%10;
			c++;
			if(c==1) {
				m=b;
			}
			if(b>m) {
				m=b;
			}
			a=a/10;
			
		}
		System.out.println(m);
	}
}
		