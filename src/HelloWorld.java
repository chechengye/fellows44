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

}
