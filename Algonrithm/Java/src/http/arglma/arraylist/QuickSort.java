package http.arglma.arraylist;

import java.util.Arrays;

public class QuickSort {
    /**将指定数组的i和j索引处的元素交换
     *
     * @param data
     * @param i
     * @param j
     */
    private static void swap(DataWrap[] data, int i, int j)
    {
        DataWrap tmp;
        tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
    /**
     * 使data数组从start到end索引范围的子序列进行处理
    使之满足所有小于分界值的放在左边，所有大于分界值的放在右边
     */
    private static void subSort(DataWrap[] data, int start, int end)
    {
        //需要排序
        if( start < end)
        {
            //以第一个元素作为分界值
            DataWrap base = data[start];
            //i从左边开始搜索，搜索大于分界值的元素索引
            int i = start;
            //j从右边开始搜索，搜索小于分界值的元素的索引
            int j = end + 1;
            while(true)
            {
                //找到大于分界值的元素的索引，或i已经到了end处
                while(i < end && data[++i].compareTo(base) <= 0) {
                    ;
                }
                //找到小于分界值的元素的索引，或j已经到了start处
                while(j > start && data[--j].compareTo(base) >= 0) {
                    ;
                }
                if(i < j)
                {
                    swap(data, i ,j);
                }
                else
                {
                    break;
                }
            }
            swap(data, start , j);
            //递归左边子序列
            subSort(data, start, j);
            //递归右边子序列
            subSort(data, j+1, end);
        }
    }
    /**
     * quick Sort
    快速排序的时间效率很好，因为它每趟能确定的元素呈指数增长
    快速排序需要使用递归，而递归使用栈，因此它的空间效率为O(logn2n)
    快速排序中包含跳跃式交换，因此不稳定的排序算法
     */
    public static void quickSort(DataWrap[] data)
    {
        subSort(data, 0 , data.length-1);
    }
    public static void main(String[] args){
        DataWrap[] data = {
                new DataWrap(9,""),
                new DataWrap(-16,""),
                new DataWrap(21,"*"),
                new DataWrap(23,""),
                new DataWrap(-30,""),
                new DataWrap(-49,""),
                new DataWrap(21,""),
                new DataWrap(30,"*"),
                new DataWrap(13,"*"),
        };
        System.out.println("排序之前:\n" + Arrays.toString(data));
        quickSort(data);
        System.out.println("排序之后:\n" + Arrays.toString(data));
    }
}
