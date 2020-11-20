package day11;

import day09.Bird;
import day09.BirdComparator;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Map集合相关
 */
public class MapDemo {

    public static void main(String[] args) {
        //linkedHashMap();
        treeMap();
    }


    /**
     * LinkedHashMap : 数据结构，哈希表（数组+链表）双向链表
     * 1、有序的，存入的顺序打印
     * 2、线程安全的，多线程下使用
     */
    public static void linkedHashMap(){
        Map<String , String> map =  new LinkedHashMap<>();
        map.put("one" , "zhangsan");
        map.put("ali" , "zhaoliu");
        map.put("two" , "lisi");
        map.put("three" , "wangwu");
        map.forEach((k,v)-> System.out.println(k + "->" + v));
    }

    /**
     * TreeMap:数据结构，平衡二叉树（红黑树）
     * 1、有序的，可以按照自然顺序排序
     * 2、通过构造器传入比较器对象
     */
    public static void treeMap(){
        Map<Integer , String> map =  new TreeMap<>();
        map.put(1 , "tom");
        map.put(5,"lucy");
        map.put(3,"lily");
        map.forEach((k,v)-> System.out.println(k+"->"+v));
        Map<Bird, String> birdStringMap =  new TreeMap<>(new BirdComparator());//通知TreeMap按照我们的比较器进行排序
        birdStringMap.put(new Bird("麻雀",3),"鸟类");
        birdStringMap.put(new Bird("黄鹂",1),"鸟类");
        birdStringMap.put(new Bird("鹦鹉",2),"鸟类");
        birdStringMap.forEach((k,v)-> System.out.println(k+"->"+v));
    }

    /**
     * Jdk1.8之后在Map中加入的比较常用的方法
     */
    @Test
    public void testMap(){
        Map<Integer , String> map =  new HashMap<>();
        map.put(1 , "tom");
        map.put(5,"lucy");
        map.put(3,"lily");
        //根据key取值，取不到返回默认值
        System.out.println(map.getOrDefault(8, "not val"));
        //若key不存在则，存入一条记录。若存在则返回其值
        map.putIfAbsent(4,"jack");
        System.out.println("-------------------------");
        map.remove(3,"lily");
        System.out.println("--------------------------");
        map.replace(1,"tom","tom35");
        System.out.println("--------------------------");
        //compute : 若key值不存在，则使用null值进行操作，并把此key值与计算后的生成新的条目
        //computeIfPresent : 若key值不存在则不进行计算
        map.computeIfPresent(5 , (k,v)->v+"test");
        System.out.println("----------------------------");
        //会将对应key值的，老值与新值进行计算，赋值给key
        map.merge(1 , "tt", (oldVal,newVal)->oldVal+newVal);
        map.forEach((k,v)-> System.out.println(k+"->"+v));
    }
}
