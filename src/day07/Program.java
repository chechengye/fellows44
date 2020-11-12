package day07;

import org.junit.Test;

public class Program {

    /**
     * 包装类
     */
    @Test
    public void testFn(){
        int a = 10;
        Integer integer = new Integer(a);//装箱操作
        System.out.println(integer);
        Integer i1 = new Integer(888);
        int intValue = i1.intValue();//拆箱操作
        System.out.println(intValue);

        int parseInt = Integer.parseInt("4675465");//字符串转换为int
        System.out.println(parseInt);
        System.out.println(Double.parseDouble("4.23"));

        System.out.println("-----------------------");
        Integer i2 = 10;
        Integer i3 = 10;
        System.out.println(i2 == i3);//t
        Integer i4 = new Integer(128);
        Integer i5 = new Integer(128);
        System.out.println(i4 == i5);
        Integer i6 = 128;
        Integer i7 = 128;
        //享元模式： 特性，会共享1字节的内存空间
        System.out.println(i6 == i7);

    }

    /**
     * 异常测试
     * 1、非受检异常中的
     *    ArithmeticException
     *   我们事先预测到了可能会有异常的发生，可以进行捕获
     *   try{}catch(){}
     *   异常会中断代码中的程序继续执行
     *   代码流程：
     *      若有异常，会正常的走catch块中的代码，只要发现有return语句，
     *      会立即执行finally代码块，若finally代码块中有return语句，直接执行。否则返回catch块继续执行
     *      return语句。
     *   面试题： return语句与finally代码块谁先执行
     */
    @Test
    public void testFn1(){

        System.out.println(div(10, 0));
    }

    private int div(int a, int b) {
        System.out.println("1234");
        try{
            int[] arr = null;
            System.out.println(arr.length);
            System.out.println(a/b);
            System.out.println("测试....");
        }catch (ArithmeticException e){
            System.out.println("算数异常");
        }catch (NullPointerException e){//所以会默认帮我们实例化异常对象
            e.printStackTrace();
            System.out.println("空指针异常");
            return 20;
        }catch (Exception e){//只写最大的父类异常捕获 缺点： 1、没有办法准确的定位到异常信息  2、减少一些性能
            System.out.println("最终异常捕获！");
        }finally {//最终的块,不管有没有异常，都会被执行的代码块
            System.out.println("最终执行....");
            //关闭操作、置空操作等
            return 50;
        }

       // return -1;
    }

    /**
     * 测试throw与throws
     */
    @Test
    public void testFn3(){
        try{
            int i = 20;
            testFn4();
        }/*catch (Exception e){
            System.out.println("异常捕获!");
        }*/finally {
            //System.out.println(i);
            System.out.println("测试最终被执行等...");
        }

        /*try {
            testFn5();
        } */

    }
    public void testFn4(){
        int a = 20 , b = 1;
        if(b == 1){
            throw new MyException("除数为1没有意义...");
        }
        int d = a / b;
    }

    public void testFn5() throws ClassNotFoundException {//抛出一个异常给到调用者

        Class.forName("day07.Example01" , false , ClassLoader.getSystemClassLoader());
    }


}
