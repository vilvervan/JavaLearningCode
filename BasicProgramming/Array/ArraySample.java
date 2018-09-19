/******************************************************************************
 *  Compilation:  javac -encoding "UTF-8" ArraySample.java
 *  Execution:    java ArraySample
 *
 *  一个典型的数组处理程序.
 *
 *  % 运行：java ArraySample 5
 *  a[]
 *  -------------------
 *  0.04851944273872377
 *  0.8311550808965679
 *  0.5288965750549762
 *  0.5053593215147596
 *  0.6162362251917868
 *
 *  a = [D@f62373
 *
 *  max = 0.8311550808965679
 *  average = 0.5060333290793628
 *
 *  b[]
 *  -------------------
 *  0.6162362251917868
 *  0.5053593215147596
 *  0.5288965750549762
 *  0.8311550808965679
 *  0.04851944273872377
 *
 *  dot product of a[] and b[] = 1.1795943990991937
 *
 ******************************************************************************/
class ArraySample {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // 将数组元素初始化为0到1之间的随机数
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = Math.random();
        }

        // 按行打印数组的元素值
        System.out.println("a[]");
        System.out.println("-------------------");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.println();
        System.out.println("a = " + a);
        System.out.println();

        // 查找数组中的最大值
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) max = a[i];
        }
        System.out.println("max = " + max);


        // 求平均数
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println("average = " + sum / n);

        // 将数组元素值拷贝到另外一个数组
        double[] b = new double[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }

        // 调换数组元素值的顺序
        for (int i = 0; i < n/2; i++) {
            double temp = b[i];
            b[i] = b[n-i-1];
            b[n-i-1] = temp;
        }

        // 按行打印数组的元素值
        System.out.println();
        System.out.println("b[]");
        System.out.println("-------------------");
        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);
        }
        System.out.println();


        // 两个数组进行点乘
        double dotProduct = 0.0;
        for (int i = 0; i < n; i++) {
            dotProduct += a[i] * b[i];
        }
        System.out.println("dot product of a[] and b[] = " + dotProduct);

    }

}