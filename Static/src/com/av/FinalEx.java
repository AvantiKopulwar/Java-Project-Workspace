package com.av;

public class FinalEx {
final int a=10;
final void JBK() {
	 int i=0;
	for (i=0;i<5;i++)
		System.out.println("Value of I:"+i);
}
public static void main(String[] args) {
	FinalEx aa= new FinalEx();
	aa.JBK();
	System.out.println(aa.a);

}
}
