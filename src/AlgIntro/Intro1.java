package AlgIntro;

/**
 * 算法是按照一定的条件，从已经存在的数据中进行计算来得到期望的结果
 * 一般优秀的算法追求两个目标：1.花最少的时间完成需求，2.占用最少的内存空间完成需求
 * 下面举几个例子
 *
 * 计算1-100的和
 * public static void main(String[] args) {
 *
 *  }
 *
 *  第一种解法完成需求，要完成以下几个动作：
 *  1.定义两个整形变量
 *  2.执行100次加法运算
 *  3.打印结果到控制台
 *
 *
 *
 *  很明显，第二种解法完成需求需要花费的时间更少一些
 *
 *
 *
 * 第二种解法完成需求，要完成以下几个动作：
 *  *  1.定义两个整形变量
 *  *  2.执行三次运算
 *  *  3.打印结果到控制台
 */
public class Intro1 {

    public static void sum1() {
        int sum = 0;
        int n = 100;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void sum2() {
        int sum = 0;
        int n = 100;
        sum = (n + 1) * n / 2;
        System.out.println(sum);
    }
}