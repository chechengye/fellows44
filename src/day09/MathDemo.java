package day09;

import java.util.Random;

/**
 * Math api讲解
 */
public class MathDemo {

    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println("--------------");
        System.out.println(Math.abs(-0.23));
        System.out.println(Math.random());//double类型的范围 0.0~1.0
        System.out.println("test merge ....");
        System.out.println("test merge ....");
        System.out.println("test merge ....");
        int i = 20;
        method();
        System.out.println("---------------------");
        System.out.println(Math.round(Math.random()*100) * 1.0/ 100);
        System.out.println("--------------------------");
        System.out.println(Math.sqrt(2));
        Random r = new Random();
        System.out.println(r.nextBoolean());
        System.out.println("--------------------------");
        System.out.println(r.nextInt(100));
    }

    public static void method(){
        System.out.println("----------");

    }
}
