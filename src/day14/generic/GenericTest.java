package day14.generic;

import day13.reflect.Dog;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 泛型测试
 */
public class GenericTest {

    public static void main(String[] args) {

        Node<Number> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(10);
        Node<String> n5 = new Node<>("abc");
        Number n3 = 10;
        Integer n4 = 10;
        n3 = n4;
       // n4 = n3;//损失精度
        //n1 = n2; // 不支持，类型不匹配
        method2(n1);
        method1(n5);
        n1.setData(20);
        System.out.println(n1.getData());

        System.out.println("--------------------------");
        method3("abc","hgd" , 10 , new Dog());
        System.out.println("-------------------------");
        String[] arr = {"tom","lucy","jack","lily"};//静态初始化
        Integer[] arr1 = {10 , 30 ,50 ,40};
        System.out.println(Arrays.toString(method4(arr1, 2, 3)));

        System.out.println("----------------------------------");
        //自定义循环嵌套
        School<Student<Integer>> s = new School<>(new Student<>(50));
        System.out.println(s.getStu().getCore());

        Map<String , String> map = new HashMap<>();
        map.put("1","张飞");
        map.put("2","刘备");
        map.put("3","关羽");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //entries.forEach(System.out::println);//Lambda表达式快捷使用
        entries.forEach(entry -> System.out.println(entry.getKey() + "->" + entry.getValue()));
    }

    /**
     * ? extends Number : 参数化类型，是其本身或者其子类即可 设置了一个上限
     * @param node
     */
    public static void method(Node<? extends Number> node){
        //node.setData(20); 不允许进行值设定操作，可以获取值
        System.out.println(node.getData());
    }

    /**
     * ? : 通配符，会接收任意参数化类型
     * @param node
     */
    public static void method1(Node<?> node){
        System.out.println(node.getData());
    }

    /**
     * Integer 及其 父类 设置了一个下限
     * @param node
     */
    public static void method2(Node<? super Integer> node){
        //node.setData(20); 不允许进行值设定操作，可以获取值
        System.out.println(node.getData());
    }

    /**
     * 可变参数泛型方法
     * @param args
     * @param <T>
     */
    public static  <T> void method3(T... args){
        for(T arg : args){
            System.out.println(arg);
        }
    }

    /**
     * 此泛型数组方法，可以达到任意类型数组中的元素位置交换
     * @param arr
     * @param i
     * @param j
     * @param <T>
     * @return
     */
    public static <T> T[] method4(T[] arr , int i , int j){//空瓶子
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

}
