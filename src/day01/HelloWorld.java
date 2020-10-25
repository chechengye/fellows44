package day01;

import org.junit.Test;

/**
 *   注释: 注释的内容，会变为灰色，整个程序编译与运行时不关心的代码块.
 *   1、文档注释或者类注释、方法注释
 *      注释于类上面：
 *   这是一个Java入门小程序
 *   public：是一个关键字，公有的。修饰符：类、方法、属性 .可见性最大
 *   class: 关键字，修饰一个字符串为类 . 方法或函数是一定依附于类中存在的。
 *   HelloWorld: 类名的首字母是大写的，之后的所有单词首字母也要大写。（命名规范：驼峰命名法）
 *
 *   @author ： cc
 *   @createTime : 2020/10/25
 *
 */
public class HelloWorld {

    public int i = 10;//单行注释： 注释一行代码 ，1、去除掉一行没有意义的代码  2、单独解释这一行代码作用、语法 （定义了一个属性i）
    //psvm + enter:生成主函数的快捷键  绿色箭头执行
    public static String age = "20";
    /**
     * 方法注释： 作用于方法上，会默认帮我们生成此方法的所有参数
     * 主函数，程序的入口
     * @param args : 系统参数
     */
    public static void main(String[] args) {
        int max = 100;

        //sout + enter: 输出打印语句快捷方式
        System.out.println("hello,world");

       /* System.out.println("123");
        System.out.println("456");
            块注释/多行注释 ：可以注释掉我们不想使用的代码块
            System.out.println : 输出语句
        */
        System.out.println(age);
        System.out.println(max);

        System.out.println("...");
        testFnAndMax('c');

    }

    /**
     * 获取用户的方法
     * void : 返回值为空
     * 格式化Java代码 ctrl+alt+l
     * 在java代码中所有() {} 都是成对出现的。 所有符合全部是英文输入法下的。
     * {} ： 作用域/区域
     * 结构代码块不需要加;
     * 功能性代码块必须加;
     * @param id : 此用户的唯一标识，根据此id获取该用户
     */
    public String getUserById(int id) {
        System.out.println("dsds");
        System.out.println("dsds");
        System.out.println(i);
        return "";
    }
    /**
     * 变量划分：
     * 基本数据类型变量 引用数据类型变量
     * 按被声明的位置划分：
     * 局部变量  ： 定义于方法中的、或者作为方法参数的
     * 成员变量： 定义于类中的
     *
     * 标识符：
     * 1、不能以数字开头
     * 2、长度无限制
     * 3、不能是关键字与保留字 （goto、const）
     * 4、_ $ 特殊符号
     * 标识符：都是驼峰命名法
     * 方法首字母小写，类首字母大写
     */
    public static void testFnAndMax(char c){
        String 威哥 = "威哥";
        int m = 10;
        String strStrin = "abc";

        //Math math = Math.;
        int age1 = 10;
        System.out.println("hello威哥 = " + 威哥);//ASCII码 和 UTF-8编码集
    }
    int n = 20;

    /**
     * 基本数据类型
     * 1、boolean ： 取值范围 true , false    默认值： false
     * 2、byte  ：   占用 1字节    默认值  0 (所有与整数相关的类型默认值都是0)
     * 3、short :    占用 2个字节
     * 4、int  ：    ..   4个字节 （编程中最常用整数类型）
     * 5、long  ：   ..   8个字节
     * 6、float ：   ..   4个字节    单精度浮点型    默认值： 0.0F
     * 7、double :   ..   8个字节    双精度浮点型 （系统默认的浮点型 ）  默认值：0.0D
     * 8、char ：    ..   2个字节    字符型                             默认值: \u0000
     *
     * 只有成员变量才有默认值，局部变量没有
     */
    float f = 0.0F;
    double d;
    char c = 'f';
    @Test   //此注解，可以帮我们标记的方法进行单元测试
    public void testFn2(){
        int i;
        i = 20;//再赋值
        short s = 100;
        boolean b = false; // boolean类型不允许与其它数据类型进行转换

        int n = 20;
        //n = s;//短的向长的自动转换/赋值
        s = (short) n; // 有可能损失精度，强制类型转换，长的向短的赋值

        System.out.println("f = "+ f + ", d = " + d  + " , c = " + c + " ,i = " + i);
        System.out.println("----------------------");
        System.out.println(s);
    }
}
