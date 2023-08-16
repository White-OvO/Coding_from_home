package ig;

import java.util.Scanner;

public class EvenOrOddQuestion {

	public static void main(String[] args) {
		// write aprogram to print whether e a number is even or odd, also take the input of the user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numner to determine if it either even or odd ");
		//int num = next.Scanner.in;
		int num  = sc.nextInt();
		
		if (num % 2 == 0 )
			System.out.println(num + " Is an even number" );
		else 
			System.out.println(num + " Is an odd numner");
		
	}

}
