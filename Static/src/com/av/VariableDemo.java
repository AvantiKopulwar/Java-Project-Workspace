package com.av;

public class VariableDemo {
	static int count=0;
	public void increment() {
		count++;
	}
	public static void main(String[] args) {
		System.out.println("obj1: count is="+VariableDemo.count);
		VariableDemo obj1= new VariableDemo();
		obj1.increment();
		System.out.println("obj1: count is="+obj1.count);
		VariableDemo obj2= new VariableDemo();
		obj2.increment();
		System.out.println("obj1: count is="+obj1.count);
		System.out.println("obj2: count is="+obj2.count);
	}
}
