package day03;

import org.junit.Test;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        int menuCount = getMenu();
        System.out.println("菜数量为: " + menuCount);
        getMenu();
    }

    /**
     * public：访问权限修饰符、private、protected（继承概念）
     * static : 其它修饰符，静态的
     * void : 空返回值类型 、基本数据类型（8种） 、引用数据类型,String、自定义的类、jar包中的类
     * getMenu : 方法名称，遵循驼峰命名法，（有含义在、尽量使用英文）
     * 参数： 实参 与 形参 . 写在方法（）里面的即是形参
     *        实参要求：可以传同级/比它小的
     * 方法中的return 不管你写了多少个，只有一个会被执行到
     */
    public static int getMenu(){
        System.out.println("1、麻婆豆腐");
        System.out.println("2、鱼香切条");
        System.out.println("3、水煮鱼");
        return 3;
    }

    @Test
    public void testFn(){
        //long s = 2;
        System.out.println(getOrder(3));
        System.out.println(getOrder(2 , "zhangsan"));
        getOrder("lisi" , 1);
        move();
    }


    public void move(){
        if(true)
            return;//终结程序继续执行的作用
        System.out.println("移动....");
    }

    public String getOrder(int num , String name){

        if(null == name)
            return "";
        String str = "";
        switch (num){
            case 1:
                str += "1、麻婆豆腐";
               return str;
            case 2:
                str += "2、鱼香切条";
                return str;
            case 3:
                str += "3、水煮鱼";
                break;
        }
        return name + str;//return 会终结之后代码块继续执行
    }

    /**
     * 方法重载
     * 1、方法名称必须相同
     * 2、参数类型不同或者参数数量不同 可以决定互相成为重载
     * 3、返回值类型不同不能作为重载的依据
     */
    public String getOrder(int num){
        String str = "";
        switch (num){
            case 1:
                str += "1、麻婆豆腐";
                return str;
            case 2:
                str += "2、鱼香切条";
                return str;
            case 3:
                str += "3、水煮鱼";
                break;
        }
        return str;
    }

    public void getOrder(String name , int num){

    }

    /**
     * 数组
     * 问题：一个班里有50名同学，如何在程序中输出所有同学的学号？
     * 1、初始化方式
     *   (1)、动态初始化数组 ,50 : 代表容量
     *   (2)、先定义后分配内存
     *   (3)、静态初始化
     * 2、数组的下标是从0 开始的
     *
     */
    @Test
    public void testFn1(){
        String stu1 = "202000001";
        String stu2 = "202000002";
        String stu3 = "202000003";
        String stu4 = "202000004";
        //动态初始化方式
        String[] students = new String[50];
        for(int i = 0 ; i < 50 ; i ++){
            students[i] = "20200000" + (i+1);
        }
        String[] students1;
        students1 = new String[30];
        //静态初始化
        String[] students2 = new String[]{"20201" , "20202" , "20203"};
        //最常用的静态初始化方式
        String[] students3 = {"20201xx" , "20202yy" , "20203z"};
        //数组.length : 可以获取该数组的长度
        int len = students2.length;
        System.out.println("------------------------");
        for(int i = 0 ; i < students3.length ; i++){
            System.out.print(students3[i] + " ");
        }
        int[] score = {88 , 66};
        System.out.println("------------------------");
        System.out.println(score[score.length - 1]);//0 1 2
        System.out.println("------------------------");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println("------------------------");

    }

    /**
     * foreach 增强for循环
     * 1、它只能获取到数组中元素的值，并不能获取到下标/索引
     *
     */
    @Test
    public void testFn2(){
        int[] arr = {1,32,45,6,7};
        for(int x : arr){
            System.out.print(x + " ");
        }
    }

    /**
     * 可变参数
     * 自动将可变参数转换成为一个数组
     * 可变参数的位置放置于参数的最后一个
     */
    @Test
    public void testFn3(){
        sortArray("1" , 2, 3, 4);
    }

    public void sortArray(String b , int... a){
        for(int x : a){
            System.out.print(x + " ");
        }
    }
    /**
     * 空指针异常（NullPointerException）
     * 数组越界异常（ArrayIndexOutOfBoundsException ）
     */
    @Test
    public void testFn4(){
        int[] arr = {11,23,44};
        //System.out.println(arr[6]);
        System.out.println("----------");
        //数据库中查询/从文件中获取
        arr = getArr();
        System.out.println(arr[0]);
    }
    public int[] getArr(){

        return null;
    }
}
