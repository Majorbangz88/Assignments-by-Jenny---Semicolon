import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int number = input.nextInt();
		
		//int number1 = number % 3;
		
		if (number % 3 == 0) {
			System.out.println("Number is divisible by: 3");
		}
		
		if (number % 3 != 0) {
			System.out.println("Number is not divisible by: 3");
		}
	
	}

}
