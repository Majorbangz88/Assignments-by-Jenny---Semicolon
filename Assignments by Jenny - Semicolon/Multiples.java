import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		int number2 = input.nextInt();
		
		int product = number1 * number1 * number1;
		int sum = number2 + number2;
		
		if (product % sum == 0) {
			System.out.printf("First number trippled is a multiple of: %d%n", sum);
		}
		
		if (product % sum != 0) {
			System.out.printf("First number trippled is not a multiple of: %d%n", sum);
		}
	
	
	
	}




}
