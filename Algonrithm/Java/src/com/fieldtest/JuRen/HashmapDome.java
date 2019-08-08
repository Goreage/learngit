package com.fieldtest.JuRen;

import java.util.HashMap;

/*
    HashMap
    数组：查找非常快
    链表：增加删除快，查找慢
    红黑树：确保最坏的查找效率（jdk1.8）
        怎么看HashMap中的Hash算法:
        keyhashCode() ^ (key.hashCode() >>> 16)
        hashCode int多个字节 4 * 8 = 32
        算出数组的下标
         x % n - 1
         hash & n-1 比 hash % n 效率高0
     */
public class HashmapDome {
    public static void main(String[] args){
        HashMap map = new HashMap();
    }
}
