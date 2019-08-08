package www.douyou.shanghai.www.douyou.shanghai.array;

import java.util.Arrays;

public class SelsctSortdown {
    public static void main(String[] args){
        int[] nums={2,9,7,5,3};
        /**
         * 定义一个二维数组，选择排序的基本是数组之间的比较，取最小或最大值
         * max或min只是一个比较的工具由于筛选出最大或最小并放在前一个数的末尾
         * 每次遍历只改变需要交换的最大值的位置
         */

        for (int i = 0; i <nums.length-1 ; i++) {
            int max = i;
            for (int j = i+1; j <nums.length; j++) {
                if(nums[max] < nums[j]){
                    max = j;
                }
            }
            if(max != i){
                int temp = nums[max];
                nums[max]=nums[i];
                nums[i]=temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
