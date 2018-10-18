package com.av;

public class Demo {
	final int max_val;
	Demo(){
		max_val=100;
	}
	Demo(int i){
		max_val=89;
	}
	
void method() {

	System.out.println(max_val);
	
}
public static void main(String[] args) {
	Demo x= new Demo(1);
	x.method();
	
}
}
