import java.util.Scanner;

	public class BigAndSmall {
	
		public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter first Integer: ");
			int n1 = input.nextInt();
			
			System.out.print("Enter second Integer: ");
			int n2 = input.nextInt();
			
			System.out.print("Enter third Integer: ");
			int n3 = input.nextInt();
			
			System.out.print("Enter fourth Integer: ");
			int n4 = input.nextInt();
			
			System.out.print("Enter fifth Integer: ");
			int n5 = input.nextInt();
			
			if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) {
				System.out.println("The largest number is: " + n1);
			}
			
			if (n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5) {
				System.out.println("The largest number is: " + n2);
			}	
			
			if (n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5) {
				System.out.println("The largest number is: " + n3);
			}
			
			if (n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5) {
				System.out.println("The largest number is: " + n4);
			}
				
			if (n5 > n1 && n5 > n2 && n5 > n3 && n5 > n4) {
				System.out.println("The largest number is: " + n5);
			}
				
			if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5) {
				System.out.println("The smallest number is: " + n1);
			}
				
			if (n2 < n1 && n2 < n3 && n2 < n4 && n2 < n5) {
				System.out.println("The smallest number is: " + n2);
			}
				
			if (n3 < n1 && n3 < n2 && n3 < n4 && n3 < n5) {
				System.out.println("The smallest number is: " + n3);
			}
			
			if (n4 < n1 && n4 < n2 && n4 < n3 && n4 < n5) {
				System.out.println("The smallest number is: " + n4);
			}
				
			if (n5 < n1 && n5 < n2 && n5 < n3 && n5 < n4) {
				System.out.println("The largest number is: " + n5);
			}
		
		}
	
	}
	
	
	
	
	
	
	
