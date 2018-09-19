/******************************************************************************
 *  Compilation:  javac -encoding "UTF-8" PowersOfTwo.java
 *  Execution:    java PowersOfTwo n
 *  
 *  程序从命令行接收参数值赋给n，依次计算并输出2^0
 *  到2^n的值。
 *
 *  % java PowersOfTwo 5
 *  0 1
 *  1 2
 *  2 4
 *  3 8
 *  4 16
 *  5 32
 *
 *  % java PowersOfTwo 6
 *  0 1
 *  1 2
 *  2 4
 *  3 8
 *  4 16
 *  5 32
 *  6 64
 *
 *  注意
 *  ------------
 *  n必须满足条件： 0 <= n < 31 ，因为int数据最大值为 2^31
 *
 ******************************************************************************/
public class PowersOfTwo {
    public static void main(String[] args) {

        // 从命令行读入参数
        int n = Integer.parseInt(args[0]);

        int i = 0;                // i为指数，初始值为0，从0开始到n结束
        int powerOfTwo = 1;       // 用来存放2的幂，初始值为1

        // 循环执行，直到i等于n
        while (i <= n) {            
			System.out.println(i + " " + powerOfTwo);   // 输出2的幂
            powerOfTwo = 2 * powerOfTwo;                // 将幂乘以2，得到下一次的幂
            i = i + 1;
        }

    }
}