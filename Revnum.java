package com.whileloop;

public class Revnum 
{
 public static void main(String args[])
 {
   int num=120,rem=0,input=0,count1=0,count2=0,count3=0,reverse=0;
  
    while(num>0)
   {
    rem=num%10;
    input=input*10+rem;
    num=num/10;
    count1++;
   }
   System.out.println(count1);
   reverse=input;
   System.out.println(reverse);
   int reverse1=reverse;
   while(reverse>0)
   {
   rem=reverse%10;
   input=input*10+rem;
   reverse=reverse/10;
  count2++;  
   }
   System.out.println(count2);
   count3=count1-count2;
   System.out.println(count3);
   if(count3>0)
   {
    reverse1=reverse1*10;
    count3--;
   }
   System.out.println(reverse1);
 System.out.println(reverse1+17);   
 }
 
}