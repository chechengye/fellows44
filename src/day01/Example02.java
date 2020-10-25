package day01;

/**
 * 2、定义一个五位整数，求各个位上的数的和。
 * 面试题：怎样将一个整型最快速的转换为一个字符串
 */
public class Example02 {

    public static void main(String[] args) {
        int z = 13678;
        int w = z / 10000;
        int q = z / 1000  % 10;
        int b = z / 100 % 10;
        int s = z / 10 % 10;
        int g = z % 10;
        /*int zz = 10 ;
        String str = zz + "";*/
        System.out.println("和为： " + (w + q + b + s + g));//字符串拼接，字符串与谁拼接都会转为字符串()优先级最高
    }
}
