package ig;

import java.util.Scanner;

public class Find_Simplest_Intrest {

	public static void main(String[] args) {
// write a program to input principle, time , and rate(P , T ,R) from the user and find simple intrest
		
////		
//Scanner sc = new Scanner.in;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of principle ");
		
//int principle = sc.nextScanner
		int principle = sc.nextInt();
		
		
		System.out.println("Enter rate %");
		double rate = sc.nextDouble();
		
		
		System.out.println("Enter the amount of time being barrowed : ");
		int time =sc.nextInt();
		
		System.out.println("Principle amount is " + principle + "\t" + "ratio of " + rate + "\t" + "Amount of " + time + "days" );
		
		
		 
		int si =(int)(principle * rate *  time) / 100;
	System.out.println(si);
		
		
	}

}
