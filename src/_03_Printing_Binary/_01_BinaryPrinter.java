package _03_Printing_Binary;

public class _01_BinaryPrinter {
    /*
     * Complete the methods below so they print the passed in parameter in binary.
     * Do not use the Integer.toBinaryString method!
     * Use the main method to test your methods.
     */


    public static void printByteBinary(byte b) {
        // We first want to print the bit in the one's place
for(int i = 7; i > -1; i--) {
        // Shift b seven bits to the right
	Byte b1 = (byte) (b>>i);
        // Use the & operator to "mask" the bit in the one's place
        // This can be done by "anding" (&) it with the value of 1
    	Byte b2 = (byte) (b1 & 1);
        // Print the result using System.out.print (NOT System.out.println)
    		System.out.print(b2);

        //Use this method to print the remaining 7 bits of b
}    
System.out.println();
}
  
    public static void printShortBinary(short s) {
        // Create 2 byte variables
    	Byte x;
    	Byte y;
        // Use bit shifting and masking (&) to save the first
        // 8 bits of s in one byte, and the second 8 bits of
        // s in the other byte
    	for(int i = 7; i > -1; i--) {
    		x = (byte) (s>>i);
        	x = (byte) (x & 1);
        	System.out.print(x);
    	}
    	System.out.println();
    	for(int i = 7; i > -1; i--) {
    		y = (byte) (s<<i);
    		y = (byte)(y & 1);
        	System.out.print(y);
    	}

        // Call printByteBinary twice using the two bytes
        // Make sure they are in the correct order
    }
    public static void printIntBinary(int i) {
        // Create 2 short variables
    	Short x;
    	Short y;
        // Use bit shifting and masking (&) to save the first
        // 16 bits of i in one short, and the second 16 bits of
        // i in the other short
    	for(int e = 15; e > -1; e--) {
    		x = (short) (i>>e);
        	x = (short) (x & 1);
        	System.out.print(x);
    	}
    	System.out.println();
    	for(int e = 15; e > -1; e--) {
    		y = (short) (i<<e);
    		y = (short)(y & 1);
        	System.out.print(y);
    	}
        // Call printShortBinary twice using the two short variables
        // Make sure they are in the correct order
    }

    public void printLongBinary(long l) {
        // Use the same method as before to complete this method
    }

    public static void main(String[] args) {
        printByteBinary((byte) 295727);
        printShortBinary((short) 56);
        printIntBinary(5);
    }
}
