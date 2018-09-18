/******************************************************************************
 *  Compilation:  javac AllSame.java
 *  Execution:    java AllSame a b c
 *
 *  Prints "The are the same" if a = b = c 
 *  and "The are not the same." otherwise.
 *
 *  % java AllEqual 10 10 10
 *  The are not the same.
 *
 *  % java AllEqual 10 20 10
 *  The are not the same.
 *
 ******************************************************************************/
public class AllSame { 
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a == b && a == c) {
            System.out.println("The are the same.");
        }
        else {
            System.out.println("The are not the same.");
        }

    }
}
