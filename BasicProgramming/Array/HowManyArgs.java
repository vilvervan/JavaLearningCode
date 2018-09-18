/******************************************************************************
 *  Compilation:  javac -encoding "UTF-8" HowManyArgs.java
 *  Execution:    java HowMany arg1 arg2 arg3 ...
 *
 *  HowMany takes a variable number of command-line arguments
 *  and prints a message reporting how many there are.
 *
 *  % java HowMany
 *  You entered 0 command-line arguments.
 *
 *  % java HowMany Alice Bob Carol
 *  You entered 3 command-line arguments.
 *
 *  % java HowMany Alice
 *  You entered 1 command-line argument.
 *
 ******************************************************************************/

public class HowManyArgs {

    public static void main(String[] args) {

        // number of command-line arguments
        int n = args.length;

        // output message
        System.out.println("你输入了 " + n + " 个参数。");        
    }
}