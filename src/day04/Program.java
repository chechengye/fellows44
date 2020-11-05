package day04;

import org.junit.Test;

import java.util.Arrays;

public class Program {
    /**
     * Arrays工具类
     */
    @Test
    public void testFn(){
        //引用类型默认值是null
        int[] arr = {-1 ,22, 11,-5,1,3,5,6,7};
        //返回值在数组中的索引的,必须是已经排好序的数组
        System.out.println(Arrays.binarySearch(arr, -5));
        System.out.println("------------------------");
        System.out.println(Arrays.toString(arr));//打印输出数组中的内容
        System.out.println("------------------------");
        Arrays.sort(arr);//默认使用的排序算法是快排
        System.out.println(Arrays.toString(arr));
        System.out.println("------------------------");
        arr = Arrays.copyOf(arr , arr.length * 2);//数组的扩容
        System.out.println(Arrays.toString(arr));
        System.out.println("------------------------");
        int[] arr1 = {-1,2,3};
        int[] arr2 = {1,2,3};
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println("------------------------");
        Arrays.fill(arr1 , 0 , 1 , 5);//结束索引是到为止，不包含
        System.out.println(Arrays.toString(arr1));

    }

    /**
     * 1、new 关键字表示创建一个对象
     * 2、new 关键字表示实例化对象
     * 3、new 关键字表示申请内存空间
     */
    @Test
    public void testFn1(){
        Dog teddy = new Dog();//实例化完成一个对象，dog
        teddy.name = "泰迪"; //实例化后的对象可以调用此类的非私有的属性和方法
        teddy.month = 3;
        teddy.eat();
        Dog husky = null;//此时没有在堆中开辟内存空间，所以无法调用类中的属性与方法
        //husky.eat();   //异常会终端代码块继续执行
        //new Dog().eat();//匿名调用
        System.out.println("-----------------");
        Dog ss = new Dog();
        ss.name = "松狮";
        ss.month = 2;
        ss.eat();

        ss = null;//好处：让GC会立即回收此内存空间，让出内存。也可以不处理，这样GC会自动回收，（时间片轮询）
        ss = teddy; // 对象之间的赋值 , 赋值引用
        ss.name = "松狮2号";
        System.out.println(teddy.name);
        System.out.println("-------------------");
        method(teddy);
        System.out.println(teddy.name);
        Cat cat = new Cat();
        //cat = teddy;//相同的类型才可以赋值

    }

    public void method(Dog dog){//引用传递
        dog.name = "测试";
    }
}

/**
 * 自定义Dog的类，编写属性与方法
 */
class Dog{
    int month;
    String name;
    private String color;
    void eat(){
        System.out.println(month + "个月大的" + name + "在吃东西...");
    }
}
class Cat{

}

