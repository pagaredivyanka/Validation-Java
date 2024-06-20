# Validation 
This repository contains Java programs that provide validation for various important fields commonly used in India, including PAN (Permanent Account Number) and Aadhaar Number. The validation is performed using regular expressions to ensure the input adheres to the correct format.

## Overview

This repository aims to provide a set of reusable Java classes that can be used to validate various types of important identification numbers used in India. Currently, it supports:
- PAN (Permanent Account Number)
- Aadhaar Number

## Features
- Validates the structure of PAN numbers.
- Validates the structure of Aadhaar numbers.
- Provides user interaction to input these numbers.
- Outputs whether the entered numbers are valid or not.
  
## Requirements
- Java Development Kit (JDK) 8 or higher.
- An IDE or text editor to write and run Java code (optional).
  
## Usage
Clone the repository:

git clone https://github.com/pagaredivyanka/Validation.git
cd Validate_Pan_No

Compile the Java program:

javac com/Validate_Pan_No/ValidatePanNo.java

Run the Java program given in src/com/

Follow the prompt to enter a PAN number. The program will output whether the entered PAN number is valid or not.

# PAN (Permanent Account Number) -
This  contains a Java program to validate PAN (Permanent Account Number) numbers using regular expressions. The PAN number is a unique identifier issued by the Income Tax Department of India.

The PAN number format is typically represented as ABCDE1234F, where:
- The first five characters are uppercase alphabets.
- The next four characters are digits.
- The last character is an uppercase alphabet.
- This program uses regular expressions to validate if the entered PAN number conforms to this format.

# Aadhaar Number -
This contains a Java program to validate Aadhaar numbers using regular expressions. The Aadhaar number is a unique 12-digit identification number issued by the Unique Identification Authority of India (UIDAI).

The Aadhaar number format is represented as a 12-digit number, where:
- The first digit is between 2 and 9.
- The next eleven digits can be any digit from 0 to 9.
- This program uses regular expressions to validate if the entered Aadhaar number conforms to this format.

## Key Components

- Regular Expressions: Used to ensure the PAN and Aadhaar numbers follow the correct format.
- PAN: ^[A-Z]{5}[0-9]{4}[A-Z]{1}$
- Aadhaar: ^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$
- Pattern and Matcher: Used to compile the regex and match it against the user input.
- Scanner: Used to read user input from the console.
- Validation Logic: Checks if the input matches the regex and outputs the result.
  
## License
This project is licensed under the MIT License. See the LICENSE file for details.

Feel free to fork this repository and contribute! If you encounter any issues or have suggestions, please open an issue or a pull request.

Happy Coding!
