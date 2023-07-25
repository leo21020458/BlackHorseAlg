public class BinarySearchBasic {
    /**
     *
     * @param a - 待查找的升序数组
     * @param target - 待查找的目标值
     * @return 找到则返回索引，找不到返回-1
     * 问题1 为什么是i<=j 而不是 i<j
     * 因为i和j两个变量可能会相等
     */
    public static int binarySearchBasic(int[] a, int target){

        // 设置两个指针和初始值
        int i = 0;
        int j = a.length-1;
        while(i <= j){ // 范围内有东西
            int midVal = (i+j)/2;
            if(target<a[midVal]){ // 目标小于中间值，也就是目标在中间值的左边
                j = midVal - 1;
            } else if(a[midVal]<target){ // 目标大于中间值，也就是目标在中间值的右边
                i = midVal + 1;
            }
        }

        return -1;
    }

}
