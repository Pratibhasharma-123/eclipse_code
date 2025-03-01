package oop;

public class bitMasking {

	public static void main(String[] args) {
//		int num =5;
//		int mask = 2<<2;
//		boolean isBitSet=(num&mask)==0;
//		System.out.println(isBitSet);
		
		//0101  
		//2 is 0010
		//1 is 0001
//		int num = 5; // binary: 0101
//		int mask = 1 << 1; // binary: 0010, setting the 2nd bit
//
//		num |= mask;
//		System.out.println(num); // Output: 7 (binary: 0111)


		
//		int num = 5; // binary: 0101
//		int mask = ~(1 << 0); // binary: 1110, clearing the 1st bit
//
//		num &= mask;
//		System.out.println(num); // Output: 4 (binary: 0100)

		
		
		//Xor
//		int num = 5; // binary: 0101
//		int mask = 1 << 2; // binary: 0100, toggling the 3rd bit
//
//		num ^= mask;
//		System.out.println(num); // Output: 1 (binary: 0001)
		
		
		int flags = 0;

        int FLAG_ONE = 1 << 0; // binary: 0001
        int FLAG_TWO = 1 << 1; // binary: 0010
        int FLAG_THREE = 1 << 2; // binary: 0100

        // Set FLAG_ONE and FLAG_THREE
        flags |= FLAG_ONE;
        flags |= FLAG_THREE;

        // Check if FLAG_TWO is set
        boolean isFlagTwoSet = (flags & FLAG_TWO) != 0;
        System.out.println("FLAG_TWO set: " + isFlagTwoSet); // Output: false

        // Clear FLAG_ONE
        flags &= ~FLAG_ONE;

        // Toggle FLAG_TWO
        flags ^= FLAG_TWO;

        System.out.println("Flags: " + Integer.toBinaryString(flags)); // O

	}

}
