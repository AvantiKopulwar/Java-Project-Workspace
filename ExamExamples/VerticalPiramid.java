package com.ExamExamples;

import java.util.Scanner;

public class VerticalPiramid {
	public static void main(String[] args) {
		int i, j, r, k = 2;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter even no.of rows");
		r = n.nextInt();
		for (i = 1; i <= r; i++) {
			for (j = 1; j <= k; j++) {
				
				System.out.print("* ");
			}
			System.out.println();
			if (i <(r/2)) {
				
				k = (k + 2);
			} else {
				
				k = k - 2;
			}

		}
	}
}





