package oop;
import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double num1, num2;
	        char operator;

	        System.out.println("Welcome to the Simple Calculator!");
	        
	        // Input first number
	        System.out.print("Enter first number: ");
	        num1 = scanner.nextDouble();
	        
	        // Input operator
	        System.out.print("Enter an operator (+, -, *, /): ");
	        operator = scanner.next().charAt(0);
	        
	        // Input second number
	        System.out.print("Enter second number: ");
	        num2 = scanner.nextDouble();
	        
	        // Perform calculation
	        double result = 0;
	        boolean valid = true;
	        
	        switch (operator) {
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
	                    valid = false;
	                }
	                break;
	            default:
	                System.out.println("Error: Invalid operator.");
	                valid = false;
	                break;
	        }
	        
	        // Output result
	        if (valid) {
	            System.out.println("The result is: " + result);
	        }
	}
	
}
	  

