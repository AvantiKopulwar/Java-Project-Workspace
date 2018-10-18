package com.ExamExamples;

public class VerticalPiramid2 {
	public static void main(String[] args) {
		int i, j, k = 0;
		for (i = 1; i <= 8; i++) {
			if (i < 4) {
				k = k + 2;
			} else if (i == 4 || i == 5) {
				k = 8;
			} else {
				k = k - 2;
			}
			for (j = 1; j <= k; j++) {
				System.out.print("* ");
			}
			System.out.println();
			/*if (i < 4) {
				k = k + 2;
			} else if (i == 4 || i == 5) {
				k = 7;
			} else {
				k = k - 2;
			}*/
		}
	}
}
