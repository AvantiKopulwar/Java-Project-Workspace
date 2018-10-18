package com.av;

public class StaticMethodDemo {

	public static void copyArg(String str1, String str2) {
		str2=str1;
		System.out.println("1st string arg is:"+str1);
		System.out.println("2nd string arg is:"+str2);
	}
	public static void main(String[] args) {
		StaticMethodDemo.copyArg("PQR","DEF");
		copyArg("ABC","XYZ");
		
	}
	

}
