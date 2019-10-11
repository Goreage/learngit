package com.setandmap.csdn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * List<E>接口，可以看到几个主要的接口方法:
 * 在末尾添加一个元素：void add(E e)
 * 在指定索引添加一个元素：void add(int index, E e)
 * 删除指定索引的元素：int remove(int index)
 * 删除某个元素：int remove(Object e)
 * 获取指定索引的元素：E get(int index)
 * 获取链表大小（包含元素的个数）：int size()
 *
 * 比较一下ArrayList和LinkedList：
 *              ArrayList	LinkedList
 * 获取指定元素	速度很快	需要从头开始查找元素
 * 添加元素到末尾	速度很快	速度很快
 * 在指定位置添加/删除	需要移动元素	不需要移动元素
 * 内存占用	少	较大
 */
public class Testlist {
    public static void expessionArrayList() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("null");
        list.add("pear");
        System.out.println(list.size());
        String second = list.get(1);
        System.out.println(second);
    }
    // List<String> list = List.of("2","2","2");Java9的特性
    public static void normalforArrayList(){
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("pinknear");
        list.add("banana");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }

    /**
     * ，一是代码复杂，二是因为get(int)方法只有ArrayList的实现是高效的，换成LinkedList后，索引越大，访问速度越慢。
     *
     * 所以我们要始终坚持使用迭代器Iterator来访问List。Iterator本身也是一个对象，
     * 但它是由List的实例调用*iterator()方法的时候创建的。Iterator对象知道如何遍历一个List，
     * 并且不同的List类型，返回的Iterator对象实现也是不同的，但总是具有最高的访问效率。
     * Iterator对象有两个方法：boolean hasNext()判断是否有下一个元素，E next()返回下一个元素。
     */

    public static void UseItratorArrayList(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("pear");
        list.add("pinknear");
        list.add("banana");
        for(Iterator<String> it = list.iterator(); it.hasNext();){
            //it.hasNext()指针的下一个元素还有的话逻辑为真
            String s = it.next();
            System.out.println(s);
        }
    }

    public static void UseForeachArrayList(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("pear");
        list.add("pinknear");
        list.add("banana");
        for(String s : list){
            System.out.println(s);
        }
    }

    //List和Array转换:3种方法  1.调用toArray()方法直接返回一个Object数组 这种会导致数据丢失，很少用
    public static void UsetostringchangList(String[] args){
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("pinknear");
        list.add("banana");
        Object[] array = list.toArray();
        for(Object s : array){
            System.out.println(s);
        }
    }
    //第二种是给toArray(T[])传入一个类型相同的Array, List内部自动把元素赋值传入的Array
    //注意到这个toArray(T[])方法的泛型参数<T>并不是List接口定义的泛型参数<E>，所以，我们实际上可以传入其他类型的数   //组，例如我们传入Number类型的数组，返回的仍然是Number类型：
    public static void UseT(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(56);
        Integer[] array = list.toArray(new Integer[3]);
        for(Integer n : array){
            System.out.println(n);
        }
    }

    //给定一组连续的整数，例如：10，11，12，……，20，但其中缺失一个数字，试找出缺失的数字：
    public static void mainUseArray(String[] args){
        //构造从start到end的序列
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for(int i = start; i <= end; i++){
            list.add(i);
        }
        //随机删除List中的元素
        int removed = list.remove((int)(Math.random() * list.size()));
        int found = findMissingNumberr(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number:" + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }
    static int findMissingNumbe(int start, int end, List<Integer> list){
        for(int i=start; i<=end; i++){
            if(!list.contains(i)){
                return i;
            }
        }
        return 0;
    }
    static int findMissingNumberr(int start, int end, List<Integer> list){
        int sum = 0;
        int count = 0;
        for(Integer i : list){
            sum = i + sum;
        }
        for(int i=start; i<=end; i++){
            count=count+i;
        }
        return count-sum;
    }
    static int findMissingNumberForeach(int start, int end, List<Integer> list){
        for(Integer i : list){
            if(i!=start && start<=end){
                return start;
            }
            start++;
        }
        return 0;
    }
    static int findMissingNumberIterator(int start, int end, List<Integer> list){
        for(Iterator<Integer> iter = list.iterator(); iter.hasNext(); start++){
            if(start != iter.next()){
                return start;
            }
        }
        return end;
    }

    public static void main(String[] args){
        //构造从start到end序列
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for(int i = start; i <= end; i++){
            list.add(i);
        }
        //洗牌算法suffle可以随机交换List中的元素位置
        Collections.shuffle(list);
        //随机删除List中的元素：
        int removed = list.remove((int)(Math.random() * list.size()));
        int found = findMissingNumber(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number:" + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }

    static int findMissingNumber(int start, int end, List<Integer> list){
        //先排序后在解决
        Collections.sort(list);
        for(Iterator<Integer> iter = list.iterator(); iter.hasNext(); start++){
            if(start != iter.next()){
                return start;
            }
        }
        return end;
    }
}
