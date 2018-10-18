package com.av;

public class Ex {
	static {
		System.out.println("in Static Block");
	}
	{
		System.out.println("in block");
	}

	Ex(){
		System.out.println("in constructor");
	}
}
