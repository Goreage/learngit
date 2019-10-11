package com.list.repace;

import java.util.*;

//list去重的几种方法
public class ListTest {
    //第一种通过循环进行删除
    public static List removeDuplicate(List list){
        for(int i = 0; i <list.size() - 1; i++){
            for(int j = list.size() - 1; j > i; j--){
                if(list.get(j).equals(list.get(i))){
                    list.remove(j);
                }
            }
        }
        return list;
    }
    //第二种：通过HashSet删除
    public static List removeDuplicateUseHashSet(List list){
        HashSet set = new HashSet(list);
        list.clear();
        list.addAll(set);
        return list;
    }

    //第三种：删除重复元素，并保持顺序
    public static List removeDuplicateUseIterator(List list){
        Set set = new HashSet();
        for(Iterator<Integer> iter = list.iterator(); iter.hasNext();){
            Object ele = iter.next();
            if(set.add(ele)){
                list.add(ele);
            }
        }
        list.clear();
        list.addAll(list);
        return list;
    }

    public static List remove(List list){
        List<Integer> listTemp = new ArrayList<Integer>();
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int a=it.next();
            if(listTemp.contains(a)){
                it.remove();
            }
            else{
                listTemp.add(a);
            }
        }
        return listTemp;
    }

    //第四种：定义一个方法，调用即可
    public List<String> getNewList(List<String> list){
        List<String> lister = new ArrayList<String>();
        for(int i=0; i<list.size(); i++){
            String string = list.get(i);
            if(!list.contains(string)){
                lister.add(string);
            }
        }
        return lister;
    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(3);

        System.out.println(list);


        ArrayList<String> liststring = new ArrayList<String>();
        liststring.add("jack");
        liststring.add("jack");
        liststring.add("jack");
        liststring.add("jack");
        liststring.add("jack");
        liststring.add("jack");

        List<String> arr = new ArrayList<String>();



    }
}
