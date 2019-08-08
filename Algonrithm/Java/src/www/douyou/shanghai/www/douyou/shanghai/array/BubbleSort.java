package www.douyou.shanghai.www.douyou.shanghai.array;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] nums = {2,9,5,3,7};
        /**
         * 定义数组，冒泡排序的的中的是比较前后两个数字的大小
         * 每一次将最大或最小的数找到冒出到顶部或底部
         * 每次遍历数组内的元素变动
         */
        for (int i = 0; i <nums.length-1; i++) {
            for (int j = 0; j <nums.length-i-1; j++) {
                if(nums[j]<nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
