package com.ExamExamples;

public class OddNoVerPyra {
	public static void main(String[] args) {
		int i, j, k, odd = 1;
		for (i = 1; i <= 9; i++) {
			k = 0;
			for (j = 1; j <= odd; j++) {
				// k=j;

				if (j <= i) {
					k = k + 1;
				} else {
					k = k - 1;
				}

				System.out.print(k + " ");
			}
			System.out.println();
			 //odd = odd + 2;
		 if (i < 5) { odd = odd + 2; } else { odd = odd - 2; }
			 
		}
	}
}

/*
 * int odd = 1, i, j, k, s; for (i = 1; i <= 4; i++) { k = 0; for (j = 1; j
 * <=odd; j++) { if (j <= i) { k = k + 1; } else { k = k - 1; }
 * System.out.print(k); } System.out.println(); odd = odd + 2; }
 */