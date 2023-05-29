import java.util.Scanner;

public class ArithmeticJenny{

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer:");
		int number1 = input.nextInt();
		
		System.out.print("Enter second integer:");
		int number2 = input.nextInt();
		
		int square1 = number1 * number1;
		int square2 = number2 * number2;
		
		int sum = square1 + square2;
		int difference = square1 - square2;
		
		System.out.printf("Square of first integer is: %d%n", square1);
		System.out.printf("Square of second integer is: %d%n", square2);
		System.out.printf("Sum of both squares is: %d%n", sum);
		System.out.printf("Difference between both squares is: %d%n", difference);
	
	
	}

}
