package day05;

import org.junit.Test;

public class Program {
    /**
     * main主函数
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(args.length);//JVM帮我们传递了空值了
        for(String str : args){
            System.out.println(str);
        }

        Horse horse = new Horse();//已经调用了构造方法
        //horse.name = "小马";
        horse.setName("小马");
        horse.setMonth(3);
        horse.setColor("棕色");
        //horse.print();//对象直接打印会默认调用Object类中toString()
        System.out.println(horse);
        Horse horse1 = new Horse("小黑",5,"黑色");
        System.out.println("------------------");
        System.out.println(horse1);
        //Math.abs()
    }



    /**
     * 测试值传递与引用传递的
     */
    @Test
    public void testFn(){
        int x = 10;
        method(x);
        System.out.println("x = " + x);
        System.out.println("--------------------");
        Horse horse = new Horse();

        method(horse);
        System.out.println(horse);
        System.out.println("--------------------");
        String str = "小黑";

        method(str);
        System.out.println(str);
    }
    public void method(String str){
        //str = "小白";
        System.out.println(str);
    }
    public void method(int x){
        x = 20;
    }

    public void method(Horse horse){
        horse.month = 20;
    }

    /**
     * static测试
     */
    @Test
    public void testFn1(){
        StaticDemo sd = new StaticDemo();
        StaticDemo sd1 = new StaticDemo();
        StaticDemo sd2 = new StaticDemo();
        //sd.eat();
        StaticDemo.eat();
        System.out.println(sd.count);

    }

    /**
     * 代码块测试
     */
    @Test
    public void testFn2(){
        CodeDemo cd = new CodeDemo();
        cd.move(30);
    }
}

/**
 * 封装
 * 1、隐藏信息
 * 2、对外提供访问/操作接口
 */
class Horse{ //针对数据库时 实体类
    private String name;//private：私有化修饰符，权限最低
    int month;
    private String color;

    /**
     * 构造方法
     * 1、方法名称与类名保持一致，所以首字母大写
     * 2、不需要写返回类型连void都不写
     */
    public Horse(){
        this.method();
        //默认的构造方法，无参构造方法 。只要写了带参数的构造方法，一定补回无参的
        System.out.println("Horse的构造方法");
    }

    /**
     * 带参数的构造方法
     * 1、当我们编写了带参数的构造方法，会默认顶替掉无参构造方法。需要我们手动补回
     * 2、带参数构造方法初始化其实是破坏了封装性的
     * 3、两个构造方法之间互相称为，构造方法重载
     * @param name
     * @param month
     * @param color
     */
    public Horse(String name , int month , String color){
        this(name , month);//构造方法互调 ，this();一定放在代码块的第一行
        this.name = name;
        this.month = month;
        this.color = color;
    }

    public Horse(String name, int month) {
        //this(name , month , "dsg"); 构造方法互调一定要有出口
        this.method();//调用普通方法时，可以放在代码块任意位置
        this.name = name;
        this.month = month;
        System.out.println("带两个参数的构造方法！");
    }

    public void method(){
        System.out.println("普通的方法");
    }

    /**
     * 对外提供的修改接口
     * @param name
     */
    public void setName(String name){//java中的就近原则
        this.name = name;//this调用者对象
    }

    /**
     * 对外提供的获取属性接口
     * @return
     */
    public String getName(){
        return name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void print(){
        System.out.println("name : " + name + ",month : " + month + ",color : " + color);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", month=" + month +
                ", color='" + color + '\'' +
                '}';
    }
}

/**
 * static关键字讲解
 * 1、可以修饰属性(只能修饰全局/成员变量)
 * 2、声明为static的方法仅能调用其它static修饰的方法
 *      由static修饰的类或者方法或属性，是在类加载的时候，初始化完成时即调用。而普通方法只有在被实例化的对象调用时才存在
 * 3、static修饰的属性所有对象共同持有
 */
class StaticDemo{
    private static int age;
    private String name;
    static int count = 0;
    public StaticDemo(){
        count ++;
    }

    public void method(){
       //static int i = 10;不允许修饰局部变量
        eat();
    }

    public static void eat(){

        System.out.println("吃东西..." + age);
        //method();
    }
}

/**
 * 代码块讲解
 * 1、普通代码块 -- 写在普通方法中的 ,代码顺序执行
 * 2、构造代码块 -- 定义于类中
 * 3、静态代码块 -- 定义于类中 使用static修饰  (非常常用)
 * 执行顺序 ： 静态代码块 > 构造代码块 > 构造方法 > 普通代码块
 */
class CodeDemo{

    static {
        System.out.println("静态代码块");
    }

    public CodeDemo(){
        System.out.println("构造方法");
    }

    {
        System.out.println("构造代码块");
    }

    public void move(int num){
        int i = 10;
        System.out.println("move 前" + num);
        {
            int a = 20;
            System.out.println("普通代码块" + num + i);
        }
        System.out.println("move 后");
    }

}
