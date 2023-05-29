import java.util.Scanner;

	public class CompareJenny {
	
		public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter an integer:");
			int number = input.nextInt();
			
			int number1 = 100;
			int square = number * number;
			
			if (number == number1){
				System.out.printf("The number: %d == %d%n", number, number1);
			}
			
			if (square == number1) {
				System.out.printf("The square: %d == %d%n", square, number1);
			}
			
			if (number != number1) {
				System.out.printf("The number: %d != %d%n", number, number1);
			}
			
			if (square != number1) {
				System.out.printf("The square: %d != %d%n", square, number1);
			}
			
			if (number > number1){
				System.out.printf("The number: %d > %d%n", number, number1);
			}
			
			if (square > number1) {
				System.out.printf("The square: %d > %d%n", square, number1);
			}
			
			if (number < number1) {
			System.out.printf("The number: %d < %d%n", number, number1);
			}
			
			if (square < number1) {
				System.out.printf("The square: %d < %d%n", square, number1);
			}
		
		
		
		}
	
	
	}
