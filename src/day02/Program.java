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
}
