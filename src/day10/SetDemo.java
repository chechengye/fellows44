package day10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set集合讲解
 * HashSet 、TreeSet 、 LinkedHashSet
 * TreeSet ： 需要做排序的时候，选择使用
 * LinkedHashSet : 有序的
 */
public class SetDemo {

    public static void main(String[] args) {
        //hashSet();
        //treeSet();
        linkedHashSet();
    }

    /**
     * linkedHashSet 结构：采用 哈希表（数组+链表 双向链表）
     * 1、若有需求按照顺序输出
     */
    public static void linkedHashSet(){
        Set<Integer> sets = new LinkedHashSet<>();
        sets.add(50);
        sets.add(80);
        sets.add(30);
        sets.add(100);
        sets.add(120);
        sets.forEach(i -> System.out.println(i));
    }
    /**
     * TreeSet : 采用二叉树的数据结构 基于TreeMap实现
     * 1、它可以按照自然顺序进行排序 。 树形结构可以进行排序
     * 2、不存储相同元素值
     * 3、如果为自定义的对象，必须给定比较规则 若对象直接按照我们的规则返回0时，默认为相同元素了。
     */
    public static void treeSet(){
        Set<Integer> sets = new TreeSet<>();
        sets.add(60);
        sets.add(30);
        sets.add(30);
        sets.add(100);
        sets.forEach(i -> System.out.println(i));

        Set<Dog> dogs = new TreeSet<>(new DogComparator());
        dogs.add(new Dog(1 , "小黄"));
        dogs.add(new Dog(5 , "小黑"));
        dogs.add(new Dog(2 , "小白"));
        dogs.add(new Dog(5 , "小灰"));
        dogs.forEach(d -> System.out.println(d));
    }
    /**
     * HashSet数据结构，哈希表（散列队列 : 数组+链表） 基于HashMap实现
     * 1、不存储相同元素的 (条件：
     *        首先1）会先判断对象之间的 hashcode值是否相同，若不同则认为两个对象不相同。
     *          2）若相同会判断对象直接的equals方法是否相同，若相同则认为两个对象相同，否则则不同)
     * 2、无序的，但它并不保证恒久不变(HashMap底层实现原理时，若涉及到扩容之后，涉及到一个重排的概念)
     * 3、存值情况：Map<key , value> ， 将存储的元素当成HashMap的一个key ，而HashMap的值，使用了一个Object对象进行站位
     * 4、线程不安全的，单线程使用
     */
    public static void hashSet(){
        Set<String> sets = new HashSet<>();
        sets.add("tom");
        sets.add("ali");
        sets.add("jack");
        sets.add("lily");
        sets.add("lucy");
        sets.add(null);
        sets.add(null);
        for(String s : sets){
            System.out.println(s);
        }
        System.out.println(sets.size());
        System.out.println("-------------------------");
        Set<Dog> dogs = new HashSet<>();
        dogs.add(new Dog(1 , "小黄"));
        dogs.add(new Dog(5 , "小黑"));
        dogs.add(new Dog(5 , "小黑"));
        System.out.println(dogs.size());
        for(Dog dog : dogs){
            System.out.println(dog.hashCode());
            System.out.println(dog);
        }
    }
}
