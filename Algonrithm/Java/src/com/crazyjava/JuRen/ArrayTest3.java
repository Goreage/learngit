package com.crazyjava.JuRen;

public class ArrayTest3 {
    public static void main(String[] args){
        //定义并初始化numx数组
        int[] nums = new int[]{3, 5, 20, 12};
        //定义并初始化nums数组
        int[] prices;
        //让prices数据指向nums所引用的数组
        prices = nums;
        for (int i = 0; i <prices.length ; i++) {
            System.out.println(prices[i]);
        }
        //将prices数组的第3个元素赋值为34
        prices[2] = 34;
        //访问nums数组的第三个元素，将看到输出34
        System.out.println("nums数组的第三个元素的值是：" + nums[2]);
    }
}
