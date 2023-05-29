import java.util.Scanner;

public class SmallestLargest {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number:");
		int number1 = input.nextInt();
		
		System.out.print("Enter the second number:");
		int number2 = input.nextInt();
		
		System.out.print("Enter the third number:");
		int number3 = input.nextInt();
		
		int sum = number1 + number2 + number3;
		int average = sum / 3;
		int product = number1 * number2 * number3;
		
		System.out.printf("Sum is: %d%n", sum);
		System.out.printf("Average is: %d%n", average);
		System.out.printf("Product is: %d%n", product);
		
		int largest = number1;
		int smallest = number1;
		
		if (number2 > number1) {
			largest = number2;
		}
		if (number3 > number2){
			largest = number3;
		}
		System.out.println("The largest number is: " + largest);
		
		if (number2 < number1){
			smallest = number2;
		}
			
		if (number3 < number2){
			smallest = number3;
		}
		System.out.println("the smallest number is : " + smallest);
		
	
	}

}
