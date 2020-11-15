package day09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * 在实际开发中，如果选择集合呢？
 * List
 * 1、ArrayList ： 单线程下操作增加和查询较多
 * 2、LinkedList ： 单线程下操作插入与删除较多建议使用
 * 3、Vector ： 多线程下操作添加与查询较多建议使用
 */
public class CollectionDemo {

    public static void main(String[] args) {
        //arrayList();
        //vector();
        linkedList();
    }

    /**
     * LinkedList:数据结构为双端链表
     *  1、添加时，可以双端插入，头插法与尾插法
     *  2、默认从后往前插入
     *  3、线程不安全的
     *  4、适合频繁操作插入与删除
     */
    public static void linkedList(){
        List<String> list = new LinkedList<>();
        list.add("tom");
        list.add("jack");
        list.add("lucy");
        list.add(null);
        list.forEach(s-> System.out.println(s));
    }

    /**
     * ArrayList原理 ： 数据结构，动态数组
     * 1、初始化了一个容量大小为0的数组
     * 2、再调用add方法时，扩容到了容量大小为10。
     * 3、如果超过了10，会做 之前容量 + 之前容量 >> 1 的扩容
     * 4、ArrayList线程不安全的，单线程建议使用
     * 5、初始化时可以为其设定一个初始容量，好处：防止我们多次扩容
     * 6、查询与添加操作快，不删除 插入与删除操作
     */
    public static void arrayList(){
        //<String> : 限制存入的类型 jdk 1.7之前
        List<String> list = new ArrayList<>(200);
        list.add("张飞");
        list.add("诸葛亮");
        list.add("周瑜");
        list.add("周瑜");
        list.add(null);
        list.add(null);
        list.remove(2);
        list.set(1,"赵云");

        //list.add(200);
        //list.add(new Bird());
        for(int i = 0 ; i < list.size() ; i ++){
            /*if(list.get(i) instanceof String)
                System.out.println(((String)list.get(i)).getBytes());*/
            System.out.println(list.get(i));
        }
    }

    /**
     * Vector : 数据结构，动态数组
     * 1、当调用无参构造方法初始化vector时，默认数组的容量为10，增量为0
     * 2、当调用添加方法超过默认容量时，当增量为0时，扩容为原来的2倍
     * 3、线程的安全的，多线程下建议使用,它在它的操作方法上加上了synchronized同步锁
     * 4、查询与添加操作快，不删除 插入与删除操作
     *
     */
    public static void vector(){
        List<String> list = new Vector<>(20 , 5);
        list.add("张飞");
        list.add("诸葛亮");
        list.add("周瑜");

        //foreach配合lambda操作遍历集合
        list.forEach((s)-> System.out.println(s));

    }
}
