package com.ExamExamples;

public class SimplePiramid {
	public static void main(String[] args) {
	/*	 int i, j, k;
		 for(i=5;i>=1;i--)
		 {
		 for(j=5;j>i;j--)
		 {
		 System.out.print(" ");
		 }
		 for(k=1;k<(i*2);k++)
		 {
		 System.out.print("*");
		 }
		 System.out.println();
		 }
	}*/
		int i, j, s;
		for (i = 1; i <= 5; i++) {
			for (s = 0; s <= (5 - i); s++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("# ");
			}System.out.println();
		}
	}
}
