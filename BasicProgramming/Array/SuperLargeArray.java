/******************************************************************************
 *  Compilation:  javac -encoding "UTF-8" HugeArray.java
 *  Execution:    java HugeArray
 *
 *  创建一个大小为 n^4 (n = 1000)的数组.
 *
 *  程序编译的时候没有出现错误。但在运行是出现如下错误： 
 *
 *      java.lang.NegativeArraySizeException
 * 
 *  因为 1000^4 已经超过一个int数据所能表示的范围.
 * 
 *	当n为200时，运行程序会出现如下错误,表示数组大小超出了内存空间限制 
 *
 *      Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
 *
 *
 ******************************************************************************/
class SuperLargeArray{
	public static void main(String[] args) { 
        int n = 200;
        int[] a = new int[n*n*n*n];
        System.out.println(a.length);
    }
}