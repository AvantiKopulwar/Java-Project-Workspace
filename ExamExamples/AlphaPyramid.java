package com.ExamExamples;

public class AlphaPyramid {
	public static void main(String[] args) {
		char i, j, k;
		for (i = 'A'; i <= 'E'; i++) {
			for (j = i; j <= 'E'; j++) {
				k = j;
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}
