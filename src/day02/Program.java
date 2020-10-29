package day02;

import org.junit.Test;

public class Program {
    /**
     * 三元运算符/三目运算符
     */
    @Test
    public void testFn(){
        int num = 88;
        //System.out.println(num > 88 ? (--num > 100) ? num : 20 : 0); 不建议这么干，不符合逻辑
        System.out.println(num > 99 ? num : num > 50 ? num : 0 );//多数情况下，三目运算符1层或2层判断

    }

    /**
     * 运算符优先级
     */
    @Test
    public void testFn1(){
        boolean b = false;
        System.out.println(!(!b));
        int i = 10;
        System.out.println(i++);
        int a = 20;
        System.out.println( i / a++ );
    }

    /**
     * 分支语句
     * 1、if  else
     * 2、if else if..  else
     */
    @Test
    public void testFn2(){
        int i = 8;
        if( i > 5 | i ++ < 7){
            System.out.println(--i);
        }else{
            System.out.println(i);
        }
        if( i != 3 && i > 10){
            System.out.println(i++);
        }
        System.out.println(i);
        i = 10;
        if(i > 12){
            System.out.println(--i);
        }else if(i > 8){
            System.out.println(++i);
        }else if(i>5){

        }else{
            System.out.println(i);
        }
    }

    /**
     * switch case语句
     * 1、switch(表达式) ： 确定的值 ，类型也是int short ... String
     *    (1)case 的值 是常量（不可变的量） (2) 多个case里面的值不允许重复
     *    (3)多个case写在一起，之间没有使用break，可以理解为|的关系
     * 2、default可以省略 .
     * 3、break关键字来结束switch代码块的执行
     * 4、case的{}可以省略
     * 5、应用场景。code : 200 ， 201 ，203
     */
    @Test
    public void testFn3(){
        final int a = 4;//由final修饰的常量

        switch (a){
            case 2:
            case 1:
                System.out.println("2222");
                break;
            case 4:
                System.out.println("4444");
            default:
                System.out.println("55555");
                break;
        }
        int c = 10 , b = 20;//同类型的变量，可以放在一起定义，以逗号分隔
        switch ("+"){
            case "+":
                System.out.println(b+c);
                break;
        }
    }

    /**
     * for循环
     * 1、标准写法为 for(int i = 1 ; i < 10 ; i++)
     * 2、表达式1可以省略 ,初始化操作放到外部声明
     * 3、表达式2可以省略,永真循环(死循环)
     * 4、表达式3可以省略，可以在循环体内部编写
     * 5、所有的表达式都可以同时省略，（;;）不可以省略
     *
     */
    @Test
    public void testFn4(){
        int i = 1;
        for (;;){
            i++;
            if(i == 4) //if 语法，一行代码时，{}可以省略不写
                break;//终结代码块继续执行
            System.out.println(i);
        }
    }
}
