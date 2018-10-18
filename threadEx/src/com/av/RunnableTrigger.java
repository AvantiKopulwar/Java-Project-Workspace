 package com.av;

public class RunnableTrigger {
	public static void main(String[] args) {
		JobRunnable jr=new JobRunnable();
		Thread t= new Thread(jr);
		t.start();
		Thread t1= new Thread(jr);
		t1.start();
	}
}
