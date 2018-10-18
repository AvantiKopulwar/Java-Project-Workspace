package com.av;

public class SumJob extends Thread {
	static int sum = 0;

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 100; i++) {
			sum = sum + i;
		}
		System.out.println(+sum);
	}

}
