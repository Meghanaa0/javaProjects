package com.whileloop;

public class commonfactor {
	public static void main(String args[]) {
		int num1=44,num2=88,num3=98,x=1,var=0;
		int high=(num1>num2)?((num1>num3)?num1:num2):(num2>num3)?num2:num3;
		int small=(num1<num2)?num1:num2;
		System.out.println("small"+high);
		while(x<=high/2) {
			if(num1%x==0 && num2%x==0) {
				var=x;
				System.out.println(var);
			}
			x++;
		}
		System.out.println("highest common factor:"+var);
		int var1=0;
		while(small>=2) {
			if(num1%small==0 && num2%small==0) {
				var1=small;
				
			}
			small--;
		}
	System.out.println("smallest common factor:"+var1);
		int a=25;
		
		
		
		
	}
}