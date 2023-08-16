package ig;

import java.util.Scanner;

public class triagnlePatterns {

	public static void main(String[] args) {

// printing stars from the number inputed		
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int r =  sc.nextInt();
System.out.println();


for (int i =1; i < r; i++) { 
	for (int j = 1; j < i; j++) { 
	System.out.print(" * ");
		
	}
	System.out.println();
}

// multiplication of 10 x 10
for(int i = 1; i <= 10; i++) {
	for(int j = 1; j <= 10; j++)
		System.out.println((i*j)+ " ");
	System.out.println();
}



// nested loops = a loop inside of another loop


// number of rows and display rectangle for it
 

Scanner scanner = new Scanner(System.in);
int rows;
int columns;
String symbol = "";


System.out.println("Enter # of rows");
rows = scanner.nextInt();

System.out.println("Enter # of colums");
columns = scanner.nextInt();

System.out.println("Enter symbol to use: ");
symbol = scanner.next();

//outer loop is iancharge of number of rows
for(int i=1; i <= rows; i++) {
	System.out.println();
	
	// outer loop will  print the colums while colums are in charge of the charater being printed out
	for(int j = 1; j<= columns;j++) {
		System.out.print(symbol);
	}


}
}

}
