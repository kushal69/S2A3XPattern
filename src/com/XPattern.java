package com;

public class XPattern {
	
	// Function to print X pattern
	public void printPattren(){
		int i, j;
		int underscore = 0;							//keeps the count of the underscores preceding the first "*"					
		int underscore1 = 7;						//keeps the count of the underscores between the two "*"
		for (i = 0; i < 3; i++) {					//loop to print the top half of the pattern.
			for (j = 0; j < underscore; j++) {		//loop to print the starting "_" if present	
				System.out.print("_");
			}
			underscore += 2;						//increment by 2 of underscores for each succeeding line  
			System.out.print("*");					//prints the starting "*"
			for (j = 0; j < underscore1; j++) {		//loop to print the "_" between the two "*" in each line
				System.out.print("_");
			}
			if (underscore1 > 0) {					//block to decrement the count of the underscore1 and print the second "*"
				underscore1 = underscore1 - 4;
				System.out.print("*");
			}
			System.out.println();					//ends the line
		}
		
		underscore = 2;								//reassign the variables
		underscore1 = 3;
		
		for (i = 0; i < 2; i++) {					//loop to print the bottom half of the pattern
			for (j = 0; j < underscore; j++) {		//loop to print the starting "_" if present	
				System.out.print("_");
			}
			underscore -= 2;						//decrement by 2 of underscores for each succeeding line  
			System.out.print("*");					//prints the starting "*"
			for (j = 0; j < underscore1; j++) {		//loop to print the "_" between the two "*" in each line
				System.out.print("_");
			}
			if (underscore1 > 0) {					//block to increment the count of the underscore1 and print the second "*"
				underscore1 += 4;
				System.out.print("*");
			}
			System.out.println();					//ends the line
		}
	}

	//	Main Function
	public static void main(String[] args) {
		
		XPattern xp = new XPattern();
		
		xp.printPattren();
	}
}