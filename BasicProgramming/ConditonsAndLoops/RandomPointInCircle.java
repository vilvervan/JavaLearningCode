/******************************************************************************
 *  Compilation:  javac -encoding "UTF-8" RandomPointInCircle.java
 *  Execution:    java RandomPointInCircle
 *  
 *  随机找出一个点，该点位于圆心为 (0, 0) 半径为 1的圆外部，并且
 *  在中心为（0,0），边长为2的矩形内部。
 * 
 *
 *  %  java RandomPointInCircle
 *  (0.14539046532309108,0.8977797581170848)
 *
 *  % java RandomPointInCircle
 *  (-0.6333174979488703,-0.49591305165817845)
 *
 ******************************************************************************/
 
public class RandomPointInCircle {

    public static void main(String[] args) { 
        double x, y;
        do {
            // 随机产生x、y坐标，x和y都在 (-1, 1)范围内.
            x = 2.0 * Math.random() - 1.0;
            y = 2.0 * Math.random() - 1.0;
        } while (x*x + y*y > 1.0);
		//如果到圆心(0,0)的距离大于1，表示在圆外，结束循环

        // 打印 (x, y)
        System.out.println("(" + x + "," + y + ")");
    }
}