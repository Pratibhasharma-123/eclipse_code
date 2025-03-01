package oop;

public class non_repeated {

	public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4}; // Example array
        System.out.println("The unique element is: " + findUniqueElement(arr));
    }

    public static int findUniqueElement(int[] arr) {
        int unique = 0;
        for (int num : arr) {
            unique ^= num;
        }
        return unique;
    }

}
