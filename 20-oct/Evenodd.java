/*
 * Problem 1. 
Write a Java method to check whether every digit of a given integer 
is even. Return true if every digit is odd otherwise false?	
*/

package Lab.java;

import java.util.Scanner;

public class Evenodd {
	public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Input an integer:");
			int n = sc.nextInt();
			System.out.println("Check the number ,if even then true else false");
   
			if(n%2==0) {
				System.out.println(true);
			}
			else
				System.out.println(false);
		}
   }
}


