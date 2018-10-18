package com.av;

public class InterestCalculator extends SimpleCalculator {
	public double simpleInterest(double a, double b, double c) {
		z=((a*b*c)/100)+a;
		return z;
	}
    public double compoundInterest(double a, double b, double c) {
    	double base = 1+(b/100);
    	double power=Math.pow(base, c);
    	z=a*power;
    	return z;
    }

}
