package com.setandmap.csdn;

import java.util.ArrayList;
import java.util.List;

public class Testequals {

    public static void QualsTest(String[] args){
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        System.out.println(list);
        System.out.println(list.contains("one"));
        System.out.println(list.contains("two"));
        System.out.println(list.indexOf("one"));
        System.out.println(list.indexOf("three"));
        System.out.println(list.contains(new String("three")));
        System.out.println(list.indexOf(new String("three")));
        /**因为我们传入的是new String("C")，所以一定是不同的实例。结果仍然符合预期，这是为什么呢？
        **因为List内部并不是通过==判断两个元素是否相等，而是使用equals()方法判断两个元素是否相等，
         * 例如contains()方法可以实现如下
        */
    }

    /**
     * 因此，要正确使用List的contains()、indexOf()这些方法，放入的实例必须正确覆写equals()方法，
     * 否则，放进去的实例，查找不到。我们之所以能正常放入String、Integer这些对象，
     * 是因为Java标准库定义的这些类已经正确实现了equals()方法。
     */
    public class ArrayListDemo{
        Object[] elementData;
        public boolean contains(Object o){
            int size = 12;
            for(int i = 0; i < size ; i++){
                if(o.equals(elementData[i])){
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args){
        List<Person> list = new ArrayList<>();
        list.add(new Person("Jack"));
        list.add(new Person("Tom"));
        list.add(new Person("Bob"));
        System.out.println(list.size());
        System.out.println(list.contains(new Person("Bob")));
    }
}

class Person{
    String name;
    public Person(String name){
        this.name = name;
    }
}