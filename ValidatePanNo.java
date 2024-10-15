package com.Validate_Pan_No;

import java.util.regex.*;
import java.util.Scanner;

public class ValidatePanNo {
	
	public static boolean isValidPanNumber(String str) {
		
		String regex = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$"; // This gives use valid Pan no 
		
//		Compile the ReGex
		Pattern p = Pattern.compile(regex);
		
		if (str == null) {
			return false;
		}
		
//		to check is string and regular expression matches each other
		Matcher m = p.matcher(str);
		
		return m.matches();
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pan Number : ");
		
		String input = sc.nextLine();
		
		boolean isValid = isValidPanNumber(input);
		System.out.println("Is the entered Pan number is valid? ");
		
		if (isValid == true) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		sc.close();
	}

}
