package com.av;

public class SumAvgTest {

	public static void main(String[] args) {
		SumJob sj = new SumJob();
		sj.setName("sumjob");
		sj.start();
		try {
			sj.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		AvgJob ag = new AvgJob();
		ag.start();
	}

}
