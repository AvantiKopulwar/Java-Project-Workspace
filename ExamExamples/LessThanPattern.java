package com.ExamExamples;

public class LessThanPattern {
	public static void main(String[] args) {
		int i, j, k = 6;
		for (i = 1; i <= 10; i++) {
			if (i < 6) {
				k = k - 1;
			} else if (i == 5 || i == 6) {
				k = 1;
			} else {
				k = k + 1;
			}

			for (j = 1; j <= k; j++) {

				System.out.print("* ");

			}
			System.out.println();

		}

	}
}
