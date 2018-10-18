package com.av;

public class AvgJob extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		SumJob sj = new SumJob();
		int avg = sj.sum / 10;
		System.out.println(+avg);
	}
}
