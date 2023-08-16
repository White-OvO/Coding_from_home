package ig;

import java.util.Scanner;

public class largestNumber {

	public static void main(String[] args) {
	// this will loop through the code until stoped
		
		while (true) {
		// take two inputs from user and  print the largest number
		System.out.println("Enter the first number");
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
		System.out.println("Enter the second number");
			Scanner sc2 = new Scanner(System.in);
				int num2 = sc.nextInt();
//			
//		int num1 = 50, num2 = 20;
		if(num1 == num2)
			System.out.println("Both numbers are equal");
		if(num1 > num2)
			System.out.println(num1  + " is the largest numeber");
		else 
			System.out.println(num2 + " is larger");

	}
	}
}
