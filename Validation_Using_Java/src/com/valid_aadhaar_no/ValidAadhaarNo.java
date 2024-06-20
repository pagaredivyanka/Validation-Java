package com.valid_aadhaar_no;

import java.util.regex.*;
import java.util.Scanner;

public class ValidAadhaarNo {
	
	public static boolean isValidAadhaarNumber(String str) {
		
		String regex = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$"; // This gives use valid Pan no 
		
//		Compile the ReGex
		Pattern p = Pattern.compile(regex);
		
		
//		string is empty -> return false
		if (str == null) {
			return false;
		}
		
//		Pattern class -> we use matcher() method  
//		to find if the regular expression and string is same or not
		Matcher m = p.matcher(str);
		
		return m.matches();
		
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Aadhaar Number : ");
		String input = sc.nextLine();
		
//		isValid check is entered no and is satisfy all the conditions or not if satisfied then print "yes" else "no"
		boolean isValid = isValidAadhaarNumber(input);
		System.out.println("Is the entered Aadhaar number valid? ");
		
		if( isValid == true) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
		
		sc.close();
		
		

	}

}
