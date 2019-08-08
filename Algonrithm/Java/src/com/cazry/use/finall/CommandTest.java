package com.cazry.use.finall;

import java.util.Arrays;

interface IntArrayProductor
{
    //接口里定义的product方法用于封装“处理行为”
    int product();
}
public class CommandTest {
    //定义一个方法，该方法生成指定长度的数组
    //但每个数组元素有cmd负责产生
    public int[] process(IntArrayProductor cmd, int length)
    {
        int[] result = new int[length];
        for (int i = 0; i <length ; i++) {
            result[i] = cmd.product();
        }
        return result;
    }
    public static void main(String[] args){
        CommandTest ct = new CommandTest();
        final int seed = 5;
        //生成数组，具体生成方式取决于IntArrayProductor接口的匿名实现类
        int[] result = ct.process(new IntArrayProductor() {
            @Override
            public int product()
            {
                return (int)Math.round(Math.random() * seed);
            }
        },6);
        System.out.println(Arrays.toString(result));
    }
}
