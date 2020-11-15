package day09;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class SystemDemo {

    public static void main(String[] args) {
        System.out.println("out打印语句");
        System.err.println("这是一个错误信息的打印！");//多线程

        int[] a = {1,23,4,5,6,7};
        int[] b = new int[a.length];
        //b = Arrays.copyOf(a , 5);
        System.arraycopy(a , 0 , b , 0 , 3);
        System.out.println(Arrays.toString(b));
        System.out.println("--------------------------");
        System.out.println(System.currentTimeMillis());
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);

        //System.exit(0);
        System.out.println("------exit之后------");
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("os.name"));

        System.out.println("--------Runtime-------");
        Runtime rt = Runtime.getRuntime();
        System.out.println("处理器数量：" + rt.availableProcessors()+" 个");
        System.out.println("Jvm总内存数 ："+ rt.totalMemory()+" byte");
        System.out.println("Jvm空闲内存数： "+ rt.freeMemory()+" byte");
        System.out.println("Jvm可用最大内存数： "+ rt.maxMemory()+" byte");
        try {
            rt.exec("notepad");//操作管理系统，报表，这些数据放于excel中，直接打开.
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
