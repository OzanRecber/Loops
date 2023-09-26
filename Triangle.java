package loops;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// Create a triangle using the star symbol
		
		//     *     			1		|		 5		   | 	    1
		//    ***    			2		|		 4		   | 	    3
		//   *****   			3		|		 3		   | 	    5
		//  *******  			4		|		 2		   | 	    7
		// *********			5		|		 1		   | 	    9
		//***********			6		|		 0		   | 	    11
		//			  	number of lines	| number of spaces | number of stars
		//	 n = 6				i		|	   n - i	   |      2n - 1
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {	
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}

}
