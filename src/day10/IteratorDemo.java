package day10;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * iterator : jdk 1.5版本之前应用比较广
 * jdk1.5之后 引入了 foreach，被替代了。
 */
public class IteratorDemo {

    public static void main(String[] args) {
        //iterator();
        //enumeration();
        //foreach();
        System.out.println(function("djshdjsds", /*new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();//将字符串变为全大写
            }
        })*/ str->str.toUpperCase()));
        System.out.println("-------------------------------");
        List<Integer> integers = supplier(10, /*new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 100);//操作
            }
        }*/ ()->(int) (Math.random() * 100));
        integers.forEach(System.out::println);
    }

    public static void foreach(){
        List<String> list = new ArrayList<>();
        list.add("小飞");
        list.add("小备");
        list.add("小关");
        //1、写法 遵守Lambda表达式即可
        list.forEach(s -> System.out.println(s));
        //2、Consumer函数式接口支持System.out::println
        list.forEach(System.out::println);//不建议使用的，可读性较差，且要求的较多
    }

    /**
     * Function<T,R> : 接收一个参数，经过一系列操作，并返回此参数
     *
     */
    public static String function(String str , Function<String , String> f){
        return f.apply(str);
    }

    public static List<Integer> supplier(Integer num , Supplier<Integer> sp){
        List<Integer> list = new ArrayList<>(10);
        for(int i = 0 ; i < num ; i ++){
            list.add(sp.get());
        }
        return list;
    }
    /**
     * Vector使用
     */
    public static void enumeration(){
        Vector<String> vector = new Vector<>();
        vector.add("小飞");
        vector.add("小备");
        vector.add("小关");
        Enumeration<String> elements = vector.elements();
        while (elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }
    }
    public static void iterator(){
        List<String> list = new ArrayList<>();
        list.add("小飞");
        list.add("小备");
        list.add("小关");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){//若不调用next()方法，死循环
            System.out.println(iterator.next());
        }
        System.out.println("--------------------");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){//若不调用next()方法，死循环
            System.out.println(listIterator.next());
        }
    }
}
