package www.douyou.shanghai.www.douyou.shanghai.array;

import java.util.Arrays;

/**
 * @author Goerage
 * @opinion 选择排序法
 */
public class SelsctSortTest {
    public static void main(String[] args){
        /**
         * 从小到大排序
         */
        int[] nums = {2, 9, 7, 5, 3};
        /**
         * 选择排序：先假设最小值min为i，然后将i之后的值和min进行比较，
         * 比min小的，则对min重新赋值；
         * 内存循环结束，最小值就找到，最后比较当初的假设是否成立
         * 若不成立，则交换位置即可。
         */
        for (int i = 0; i <nums.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j <nums.length; j++) {
                if(nums[min] > nums[j]){
                    min = j;
                }
            }
            if(min != i){
                int temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
