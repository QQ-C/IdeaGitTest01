package test09.demo;

import java.util.*;

/**
 * 一、集合框架的概述
 * 1、集合、数组都是对多个数据进行存储操作的结构，简称Java容器
 * 说明：此时的存储，主要指的是内存层面的存储，不涉及到持久化的存储（.txt，.jpg等）
 *
 * 2.1 数组在存储多个数据方面的特点
 *      一旦初始化以后，长度就确定了
 *      数组一旦定义好，其元素类型也就确定了，只能操作指定类型的数据
 *  2.2缺点
 *      一旦初始化以后，长度不可修改
 *      数组提供的方法有限，增删查操作不方便，效率不高
 *      获取数组中实际元素的个数，没有现成的属性或方法
 *      数组存储数据的特点：有序，可重复；对于无序、不可重复的需求，不能满足
 */
public class CollectionTest {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(16);
        list.add(28);
//        list.add("s");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        for(Integer score:list){
            System.out.println(score);
        }
        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()){
            int stuScore=iterator.next();
            System.out.println(stuScore);
        }
        Map<String,Integer> map=new HashMap<>();
        map.put("Tom",23);
        map.put("Mary",25);
        Set<Map.Entry<String,Integer>> entries=map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entries.iterator();
        while(iterator1.hasNext()){
            Map.Entry<String,Integer> next = iterator1.next();
            String key=next.getKey();
            Integer value= next.getValue();
            System.out.println(key+"---"+value);
        }
    }
}
