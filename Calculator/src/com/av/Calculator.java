package com.av;

import java.util.Scanner;

public class Calculator {
	double result;
	double sum;
	double rate;
	double period;
	double first;
	double second;
	
	public void start() {
				
		System.out.println("press\n 1 for additon \n 2 for subtraction \n 3 for multiplication \n 4 for division \n 5 for SI \n 6 for CI");
		Scanner optionScanner = new Scanner(System.in);
		int option = optionScanner.nextInt();
		
		if (option==5 || option==6) {
			System.out.println("enter sum rate and period respectively and press enter after each number");
			Scanner numberScanner = new Scanner(System.in);
			sum = numberScanner.nextDouble();
			rate = numberScanner.nextDouble();
			period= numberScanner.nextDouble();
			
		}
		if(option==1 || option==2 || option==3 || option==4) {
			System.out.println("enter 2 numbers and press enter after each number");
			Scanner numberScanner = new Scanner(System.in);
			first = numberScanner.nextDouble();
			second = numberScanner.nextDouble();
		}
		else {
			System.out.println("Invalid Option");
			}
		
		SimpleCalculator simplecalculator = new SimpleCalculator();
		InterestCalculator interestCalculator = new InterestCalculator();
		
		switch (option) {
		case 1:
			result = simplecalculator.addition(first, second);
			break;
		case 2:
			result = simplecalculator.subtraction(first, second);
			break;
		case 3:
			result = simplecalculator.multiplication(first, second);
			break;
		case 4:
			result = simplecalculator.division(first, second);
			break;
		case 5:
			result = interestCalculator.simpleInterest(sum, rate, period);
			break;
		case 6:
			result = interestCalculator.compoundInterest(sum, rate, period);
			break;
		}
	}

	public void display() {
       if (result == 0) {
		System.out.println();
       }else {
    	System.out.println(+result);   
       } 
    	   
	}
}
