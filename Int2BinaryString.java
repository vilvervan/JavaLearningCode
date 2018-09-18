/******************************************************************************
 *  Compilation:  javac Int2BinaryString.java
 *  Execution:    java Int2BinaryString n
 *  
 *  Prints out n in binary.
 * 
 *  % java Int2BinaryString 5
 *  101
 *
 *  % java Int2BinaryString 106
 *  1101010
 *
 *  % java Int2BinaryString 0
 *  0
 * 
 *  % java Int2BinaryString 16
 *  10000
 *
 *  Limitations
 *  -----------
 *  Does not handle negative integers or 0.
 *
 *  Remarks
 *  -------
 *  could use Integer.toBinaryString(n) instead.
 *
 ******************************************************************************/

public class Int2BinaryString { 
    public static void main(String[] args) { 
        int n = Integer.parseInt(args[0]);

        // repeatedly divide by two, and form the remainders backwards
        String s = "";
        for (int i = n; i > 0; i /= 2) {
            s = (i % 2) + s;
        }
        System.out.println(s);
    }
}