package http.arglma.arraylist;

public class InsertSort {
    /**
     * InsertSort class
     * #auther
     * #data
     */
    public static void insertSort(DataWrap[] data)
    {
        System.out.println("开始排序:\n");
        int arrayLength = data.length;
        for (int i = 0; i < arrayLength ; i++) {
            //当整体后移时，保证data[i]的值不会丢失
            DataWrap tmp = data[i];
            /**
             * i索引处的值已经比前面的所有值都大，表明已经有序，无须插入
             * (i-1 索引之前的数据已经有序， i-1 索引处元素的值是最大值)
             */
        }
    }
}
