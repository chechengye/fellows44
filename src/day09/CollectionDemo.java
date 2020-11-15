package day09;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {

    public static void main(String[] args) {
        arrayList();
    }

    /**
     * ArrayList原理
     * 1、初始化了一个容量大小为0的数组
     * 2、再调用add方法时，扩容到了容量大小为10。
     * 3、如果超过了10，会做 之前容量 + 之前容量 >> 1 的扩容
     * 4、ArrayList线程不安全的，单线程建议使用
     * 5、初始化时可以为其设定一个初始容量，好处：防止我们多次扩容
     */
    public static void arrayList(){
        //<String> : 限制存入的类型 jdk 1.7之前
        List<String> list = new ArrayList<>(200);
        list.add("张飞");
        list.add("诸葛亮");
        list.add("周瑜");
        //list.add(200);
        //list.add(new Bird());
        for(int i = 0 ; i < list.size() ; i ++){
            /*if(list.get(i) instanceof String)
                System.out.println(((String)list.get(i)).getBytes());*/
            System.out.println(list.get(i).getBytes());
        }
    }
}
