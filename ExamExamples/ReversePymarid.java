package com.ExamExamples;

import java.util.Scanner;

public class ReversePymarid {
	public static void main(String[] args) {
		int i, j, s, r;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter no.of rows");
		r = n.nextInt();
		for (i = 1; i <= r; i++) {
			for (s = 0; s <= (i - 1); s++) {
				System.out.print(" ");
			}
			for (j = 1; j <= ((1 + r) - i); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
