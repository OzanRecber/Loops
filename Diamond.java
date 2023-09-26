package loops;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		// Create a diamond using the star symbol
		
		//	  *				1		 |		  4			|		 1
	    //   *** 			2		 |		  3			|		 3
		//  *****			3		 |		  2			|		 5
		// *******			4		 |		  1			|		 7
		//*********			5		 |		  0			|		 9
		//   n=5	 number of lines | number of spaces	| number of stars
		//					i		 |	   	 n-i			   2i-1
			
		// *******			1		 |		  0			|		 7
		//  *****			2		 |		  1			|		 5
		//   ***			3		 |		  2			|		 3
		//    *				4		 |		  3			|		 1
		//   n-1 	 number of lines | number of spaces	| number of stars
		//			  	 i = n-1	 |		 n-i	 	|  	   2i-1
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();

	}

}
