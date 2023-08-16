package ig;

import java.util.Scanner;

public class AreaOfACircle {

	public static void main(String[] args) {
// fid the area of a circle
		System.out.println("Enter the number for radius of a circle");
		
		Scanner sc = new Scanner(System.in);
		
		Double radius = sc.nextDouble();
		Double area =Math.PI * radius * radius ;
		System.out.println("area = " + area);
	}

}
