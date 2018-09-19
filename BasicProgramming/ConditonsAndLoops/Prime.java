/******************************************************************************
 *  Compilation:  javac -encoding "UTF-8" Primes.java
 *  Execution:    java Primes n
 *  
 *  输入一个n，确定n是否是素数.
 *
 *   % java Prime 81
 *   81 不是素数
 *
 *   % java Prime 17
 *   17 是素数
 *
 *   % java Prime 30864324691489
 *   30864324691489 不是素数
 *
 *
 ******************************************************************************/
public class Prime {

    public static void main(String[] args) { 
        long n = Long.parseLong(args[0]);
        boolean isPrime = true;
        if (n <= 2) //如果n为1或2，直接判断出n为素数
			isPrime = false;
		else{
			// 从2开始的每个正整数，逐个检查其是否是n的因子
			// 根据数学理论，如果一个数是n的因子的话，这个数必定小于等于n的
			// 算数平方根，即sqrt(n)。
			// 所以，为了提高计算效率，我们只需要检查factor <= sqrt(n) 或者
			// factor*factor <= n的所有factor即可，比sqrt(n)大的数没必要检查了
			for (long factor = 2; factor*factor <= n; factor++) {
			
				// 如果某个factor能被n整除，那么n肯定不是素数，factor后面
				// 的数没必要继续检查了
				if (n % factor == 0) {
					isPrime = false;
					break;
				}
			}
		}

        // 打印输出n是否是素数
        if (isPrime) System.out.println(n + " 是素数");
        else         System.out.println(n + " 不是素数");
    }
}