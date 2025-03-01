package oop;
class MathOperation {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
    
    public int mul(int a, int b) {
    	return a*b;
    }
    public int mul(int a, int b,int c) {
    	return a*b*c;
    }  
    public double mul(double  a, double  b ,double  c) {
    	return a*b*c;
    }
}
public class Polymorpism {

	public static void main(String[] args) {
		MathOperation math = new MathOperation();

        System.out.println("Addition of two integers: " + math.add(5, 3)); // Calls the first add method
        System.out.println("Addition of three integers: " + math.add(5, 3, 2)); // Calls the second add method
        System.out.println("Addition of two doubles: " + math.add(5.5, 3.2)); 
        

        System.out.println("Addition of two integers: " + math.mul(5, 3)); // Calls the first add method
        System.out.println("Addition of three integers: " + math.mul(5, 3, 2)); // Calls the second add method
        System.out.println("Addition of two doubles: " + math.mul(5.5, 3.2,0)); 
	}

}
