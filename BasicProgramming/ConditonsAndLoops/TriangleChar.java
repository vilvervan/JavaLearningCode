/******************************************************************************
 *  Compilation:  javac TriangleChar.java
 *  Execution:    java TriangleChar n
 *  
 *  Prints out an n-by-n triangular pattern like the one below.
 *
 *  % java TriangleChar
 *  * * * * * * 
 *  . * * * * *
 *  . . * * * *
 *  . . . * * *
 *  . . . . * *
 *  . . . . . *
 *
 ******************************************************************************/

public class TriangleChar {

    public static void main(String[] args) { 
        int n = Integer.parseInt(args[0]);

        // loop n times, one for each row
        for (int i = 0; i < n; i++) {

            // print j periods
            for (int j = 0; j < i; j++)
                System.out.print(". ");

            // print n-i asterisks
            for (int j = 0; j < n-i; j++)
                System.out.print("* ");

            // print a new line
            System.out.println();
        }
    }
}