package com.ExamExamples;

public class MShape {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int n = 1;
			//int n2 = 5;
			for (int j = 5; j > i; j--) {
				System.out.print(n);
				n++;
			}
			for (int k = 0; k <= i * 2 - 1; k++) {
				System.out.print(" ");
			}
			n=n-1;
			for (int m = 5; m > i; m--) {
				System.out.print(n);
				/*if(i==1){
					n=n-2;
				}*/
				n=n-1;
			}
			System.out.println();
		}
	}
}
