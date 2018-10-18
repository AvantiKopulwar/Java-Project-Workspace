package com.ExamExamples;

public class MShapeSir {
	public static void main(String[] args) {
		int x;
		for (int i = 0; i < 5; i++) {
			x = 1;
			for (int j = i; j < 5; j++) {
				System.out.print(x++);
			}
			for (int k = 0; k < i * 2 - 1; k++) {
				System.out.print(" ");
				// x=x-1;
			}

			for (int m = i; m < 5; m++) {

				if (x == 6) {
					x = x - 2;
					System.out.print(x);
				} else if (x == 1) {
					System.out.print(" ");
				} else {
					x = x - 1;
					System.out.print(x);
				}
			}
			System.out.println();
		}
	}
}
