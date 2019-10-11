package com.setandmap.csdn;


import java.util.ArrayList;
import java.util.List;


public class Testlistnew {

    public List<String> getNewList(List<String> li){
        List<String> list = new ArrayList<String>();
        for(int i=0; i<li.size(); i++){
            String str = li.get(i);
            if(!list.contains(str)){
                list.add(str);
            }
        }
        return list;
    }
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("aaa");
        arr.add("bbb");
        arr.add("ccc");
        arr.add("aaa");


    }
}
