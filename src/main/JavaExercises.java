package main;

import java.util.Scanner;

import stringstuff.*;

public class JavaExercises {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String test;
		
		//Reverse String	
		System.out.print("Enter a string:");
		test = scanner.nextLine();
		ReverseString rs = new ReverseString();
		System.out.println("Reverse is: " + rs.reverseStringInPlace(test));
		
		//Detect Palindrome
	

	}

}
