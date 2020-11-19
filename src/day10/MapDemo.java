package day10;

import java.util.*;

/**
 * Map讲解
 * HashMap、TreeMap、LinkedHashMap、HashTable
 */
public class MapDemo {


    public static void main(String[] args) {
        //hashMap();
        hashTable();
    }
    /**
     * hashMap:哈希表 （数组+链表 jdk1.8之前  。jdk1.8之后 ，引入了红黑树：平衡二叉树，节点长短一致的）
     * 1、不存在重复的key , 放入相同key的时候，进行赋值操作
     * 2、默认赋值了一个0.75f加载因子
     * 3、当第一次存值的时候，初始容量大小为16 / 1 << 4
     * 4、当链表的长度大于等于7的时候，引入了红黑树的概念（平衡二叉树），节点除了红色就是黑色
     * 5、当什么时候开始扩容 扩容大小又是多少呢？ 当容量到达75%时 ，扩容为原来的二倍
     * 6、线程不安全的，适合单线程中使用
     */
    public static void hashMap(){
        Map<Integer , String> map = new HashMap<>();
        map.put(1,"tom");
        map.put(2,"jack");
        map.put(3,"lucy");
        map.put(1,"lily");
        System.out.println(map.size());
        //遍历map 1、entrySet方式
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-------------------------");
        entrySet.forEach(e -> System.out.println(e.getKey() + "->" + e.getValue()));
        System.out.println("-------------------------");
        //2、keySet() 方式
        Set<Integer> keySet = map.keySet();
        for(Integer i : keySet){
            System.out.println(i + "->" + map.get(i));
        }
        //3、values值
        Collection<String> values = map.values();
        values.forEach(System.out::println);
        //4、直接使用foreach进行遍历
        map.forEach((k,v)-> System.out.println(k + "->" + v));
        System.out.println("------------------");
        int hashCode = 6565443;
        System.out.println(hashCode ^ 0);
        System.out.println(hashCode & 15);// % 16 不会超过16
    }
    /**
     * HashTable:
     * 1、默认初始化容量为11 ，加载因子为 0.75
     * 2、采用哈希表 （数组+链表）
     * 3、rehash的扩容方法 到达 容量*加载因子之后，进行 2倍 + 1的扩容
     * 4、线程安全的，建议多线程下使用
     * 5、k,v都不如许为null
     */
    public static void hashTable(){
        Map<String , String> map = new Hashtable<>();
        map.put("one","lucy");
        map.put("two","lily");
        map.put("three","tom");
//        map.put("four",null);

        map.forEach((k,v)-> System.out.println(k+ "->" + v));
        System.out.println("--------------------");
        Map<Cat , String> catStringMap = new Hashtable<>();
        catStringMap.put(new Cat(1 , "小猫"),"猫咪1号");
        catStringMap.put(new Cat(1 , "小猫"),"猫咪1号");
        catStringMap.forEach((k,v)-> System.out.println(k+"->"+v));
    }
}
class Cat{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
