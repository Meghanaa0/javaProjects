package com.whileloop;

import java.util.Arrays;

public class Practice {
	public static void main(String args[]) {
		String a[]= {"hello","all","good","morning","have","a","nice","day"};
		for(int i=0;i<a.length-1;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i].compareTo(a[j])>0) {
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
					
				}
		}
		
		for(String t:a) {
			System.out.println(t);
		}
//		String[] strings = {"Hello", "all", "good", "Morning", "Have", "a", "nice", "day"};
//
//        // Perform sorting of even-indexed elements
//        for (int i = 0; i < strings.length; i += 2) {
//            for (int j = i + 2; j < strings.length; j += 2) {
//                if (strings[i].compareTo(strings[j]) > 0) {
//                    // Swap strings
//                    String temp = strings[i];
//                    strings[i] = strings[j];
//                    strings[j] = temp;
//                }
//            }
//        }
//
//        // Print sorted array
//       for (String str : strings) {
//            System.out.println(str);
//        }
//	}
//	}
		
	
		    //public static void main(String[] args) {
//		        String s = "hello2hi3";
//		        String s1 = "";
//		        int num = 0;
//		        for (int i = 0; i < s.length(); i++) {
//		            if (Character.isDigit(s.charAt(i))) {
//		                num = num * 10 + Character.getNumericValue(s.charAt(i));
//		            } else {
//		                for (int j = 0; j < num; j++) {
//		                    s1 += s.charAt(i);
//		                }
//		                num = 0;
//		            }
//		        }
//		        System.out.println(s1);
//		    }
//		String s[]= {"hello","all","good","morning"};
//		for(int i=0;i<s.length-1;i++) {
//			int min=i;
//			for(int j=i+1;j<s.length;j++) {
//				if(s[j].compareTo(s[min])<0) {
//					min=j;
//				}
//			}
//			String temp=s[min];
//			s[min]=s[i];
//			s[i]=temp;
//		}
//		
//	
//		    for(String a:s) {
//		    	System.out.println(a);		    
//		    	}
	}
}

