import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("input an integer beetween 0 to 1000:");
int num = input.nextInt();
int firstDigit = num%10;
int remainingNumber = num/10;
int secondDigit = remainingNumber/10;
remainingNumber= remainingNumber/10;
int thirdDigit= remainingNumber%10;
int sum= thirdDigit + secondDigit + firstDigit;
System.out.println("the sum of all Digit in" +num+ "is" +sum);

	}

}
