package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 操作集合的工具类
 *
 */
public class CollectionsDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(20);
        list.add("1");
        list.add("5");
        list.add("2");
        list.add("3");
        list.add("2");
        List<String> listTwo = new ArrayList<>(20);
        listTwo.add("7");
        list.forEach(System.out::println);
        System.out.println("---------排序操作---------");
        Collections.reverse(list);//翻转
        list.forEach(System.out::println);
        System.out.println("---------洗牌---------");
        Collections.shuffle(list);
        list.forEach(System.out::println);
        System.out.println("---------排序---------");
        Collections.sort(list);
        list.forEach(System.out::println);
        System.out.println("-----------交换-----------");
        for(int i = 0 ; i < list.size() ; i++){
            if(i == 2){//特殊场景情况下
                Collections.swap(list , i , list.size() - 1);
            }
        }
        list.forEach(System.out::println);
        System.out.println("-----------移位-------------");
        Collections.rotate(list , 2);
        list.forEach(System.out::println);
        System.out.println("--------------查找和替换---------------");
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list, "3"));
        System.out.println("---------返回集合中的最大元素----------");
        System.out.println(Collections.max(list));
        System.out.println("---------------填充---------------");
        //Collections.fill(list , "888");//尽量避免使用
        list.forEach(System.out::println);
        System.out.println("---------------返回指定对象出现的次数---------------");
        System.out.println(Collections.frequency(list, "2"));
        Collections.replaceAll(list , "2","888");
        list.forEach(System.out::println);
        //syncList : 上锁的list ，使用同步代码块的方式，帮我们进行上锁操作
        List<String> syncList = Collections.synchronizedList(list);
        System.out.println("-----------------设置不可变集合-----------------");
        List<Object> emptyList = Collections.emptyList();
        //emptyList.add("wangwu");//不能进行添加操作,不被支持的操作异常
        /*System.out.println(emptyList.get(2));
       */
        emptyList.forEach(s-> System.out.println(s));

        System.out.println("---------------其它--------------");
        System.out.println(Collections.disjoint(list, listTwo));
        System.out.println("---------------添加方法--------------");
        Collections.addAll(listTwo , "2","3","5");
        listTwo.forEach(System.out::println);
        System.out.println("--------------比较器翻转----------------");
        Comparator<Object> cm = Collections.reverseOrder();//2 ,3 ,5 ,7 。
        Collections.sort(listTwo , cm); // 7 , 5 ,3, 2
        listTwo.forEach(System.out::println);
    }

    public List<String> getData(){
        List<String> list = null;
        if(list == null){
            return Collections.emptyList();
        }
        return null;
    }
}
