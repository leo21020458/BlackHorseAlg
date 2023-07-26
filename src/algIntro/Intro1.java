package algIntro;

/**
 * 算法是按照一定的条件，从已经存在的数据中进行计算来得到期望的结果
 * 一般优秀的算法追求两个目标：1.花最少的时间完成需求，2.占用最少的内存空间完成需求
 *
 *   在计算机程序编写前，一句同济方法对算法进行估算，进过总结，我们发现一个高级语言编写的程序在计算上运行所消耗的时间取决于以下因素：
 *   1. 算法才用的策略和方案
 *   2. 编译产生的代码质量
 *   3. 问题的输入规模（输入量的多少）
 *   4. 机器执行指令的速度
 *   大O表示法
 *
 *  
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
 *
 *  当输入规模为n时，第一种算法执行了1+1+(n+1)+n = 2n+3次
 *  第二次算法执行了1+1+1 = 3次
 */
public class Intro1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Intro1.sum1();
        Intro1.logN();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    /**
     * 如果忽略判断条件的执行次数和输出语句的执行次数，那么当输入规模为n时，以下算法的执行次数分别为 n+3,3,n^2+2次
     * 如果使用大O表示法标识上述每个算法的时间复杂度；以下是规则：
     * 1.用常数1取代运行时间中所有加法常数
     * 2.在修改后的运行次数中，只保留高阶项
     * 3.如果最高阶想存在，切常数因子不为1，则去除与这个项相乘的常数
     *
     * 所以上述算法用大O表示法分别为 O(n), O(1), O(n^2)
     */

    /**
     * sum1()的时间复杂度是线性阶：随着输入规模的扩大，对应计算次数呈直线增长
     */
    public static void sum1() { //n+3
        int sum = 0; //执行一次
        int n = 100000; // 执行一次
        for (int i = 0; i <= n; i++) { //执行n+1次
            sum += i; //执行n次
        }
        System.out.println(sum);
    }

    public static void sum2() { //3
        int sum = 0; // 执行一次
        int n = 100; // 执行一次
        sum = (n + 1) * n / 2; // 执行一次
        System.out.println(sum);
    }


    /**
     * 一般的双层循环的时间复杂度是 O(n^2)
     * 这段代码n = 100 也就是说，外层循环每执行一次，内层循环就执行100次，那总共程序想要从这两个循环中出来
     * 就需要执行100*100次 也就是n的平方次，所以这段代码的时间复杂度是O(n^2) 「立方阶时间复杂度就是O(n^3),也就是三层嵌套循环」
     */
    public static void sum3(){
        int sum = 0;
        int n = 100;
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= n ; j++) {
                sum += i; //执行n^2次
            }
        }
    }
    /**
     * 递归；占用内存空间大
     * @param n 你想要计算什么数的阶乘？
     * @return 返回结果
     */
    public static long fun1(long n){
        if(n==1){
            return 1;
        }
        return n*fun1(n-1);
    }

    /**
     * 占用内存空间小
     * @param n 你想要计算什么数的阶乘？
     * @return 返回结果
     */
    public static long fun2(long n){
        int result = 1;// 记录阶乘结果的变量
        for (int i = 0; i <=n; i++) {
            result*=i;
        }
        return result;

    }

    /**
     *
     * @return i = 1*2*2*... if i>=100 break;
     */
    public static void logN(){
        int i = 1;
        int n = 100;
        while(i<n){
            i = i*2;
        }
        System.out.println(i);
    }

    /**
     * 这里就会有最坏情况的出现，如果我想要找0，这个0是在数组的末尾，所以这个算法要一直执行直到最后一个数，当然也会有相对应的最好情况
     * 就是要找11的时候，也就是说找一次就能知道这个11的位置，后面的数组都不用循环了
     * 平均情况：任何数字的查找平均成本是O(n/2)
     * @param num 你想要找哪个数？
     * @return 返回数的位置，找不到返回-1
     */
    public int search(int num){
        int[] arr = {11,10,8,9,7,22,23,0};
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){
                return i;
            }
        }
        return -1;
    }
}