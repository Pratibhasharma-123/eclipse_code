package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       int num1=10, num2=23;

		System.out.println("Welcome to the Simple Calculator!")	;	  
		System.out.println("Enter First number :")	;
       
        int result = 0;
        int valid;
        
        switch (result) {
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
//                valid = false;
            }
            break;
        default:
            System.out.println("Error: Invalid operator.");
//            valid = false;
            break;
    }
	}

}
