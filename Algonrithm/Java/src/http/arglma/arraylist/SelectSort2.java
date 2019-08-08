package http.arglma.arraylist;

import java.util.Arrays;

public class SelectSort2 {
    public static void selectSort(DataWrap[] data)
    {
        System.out.println("开始排序");
        int arrayLength = data.length;
        //依次进行n-1趟比较，第i趟比较将第i大的值选出放在i位置上
        for (int i = 0; i < arrayLength - 1; i++) {
            //minIndex永远保留本趟比较中最小值的索引
            int minIndex = i;
            for (int j = i + 1; j < arrayLength; j++) {
                //如果minIndex位置的数据 > j位置的数据
                if(data[minIndex].compareTo(data[j]) > 0)
                {
                    //将j的值赋值给minIndex
                    minIndex = j;
                }
            }
            System.out.println(Arrays.toString(data));
        }
    }
    public static void main(String[] args){
        DataWrap[] data = {
                new DataWrap(21,""),
                new DataWrap(30,""),
                new DataWrap(49,""),
                new DataWrap(30,"*"),
                new DataWrap(16,""),
                new DataWrap(9,""),
        };
        System.out.println("排序之前:\n" + Arrays.toString(data));
        selectSort(data);
        System.out.println("排序之后：\n" + Arrays.toString(data));
    }
}
