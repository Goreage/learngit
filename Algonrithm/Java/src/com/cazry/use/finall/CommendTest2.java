package com.cazry.use.finall;

import java.util.Arrays;

interface IntArrayProductorand
{
    //接口里定义的product方法用于封装“处理行为”
    int product();
}
public class CommendTest2 {
    //定义一个方法，该方法生成指定长度的数组
    //但每个数组元素有cmd负责产生
    public int[] processed(IntArrayProductorand cmd, int length)
    {
        int[] result = new int[length];
        for (int i = 0; i <length ; i++) {
            result[i] = cmd.product();
        }
        return result;
    }
    public static void main(String[] args){
        CommendTest2 ct = new CommendTest2();
        final int seed = 5;
        class IntArrayProductorImpl implements IntArrayProductorand
        {
            @Override
            public int product() {
                return (int)Math.round(Math.random() * seed);
            }
        }
        //生成数组，具体生成方式取决于IntArrayProductor接口的匿名实现类
        int[] result = ct.processed(new IntArrayProductorImpl(),6);
        System.out.println(Arrays.toString(result));
    }
}
