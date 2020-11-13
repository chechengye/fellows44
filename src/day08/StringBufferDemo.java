package day08;

/**
 * StringBuffer讲解
 * 1、StringBuilder是线程不安全的，单线程使用
 * 2、StringBuffer线程安全的
 * 3、StringBuilder要单线程中比StringBuffer存储的快
 */
public class StringBufferDemo {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bcd";
        String s3 = s1 + s2 + 10;//生成几个对象？在堆中生成3个对象,栈中对象
        String s4 = "abd"+"bcd"+10; // 生成一个对象
        StringBuffer sb = new StringBuffer(s1);
        sb.append(s2).append(10);//只创建了一个对象
        System.out.println(sb);
        System.out.println("------------------");
        System.out.println(sb.delete(0, 2));
        System.out.println("------------------");
        System.out.println(sb.insert(4, "***"));
        System.out.println("------------------");
        System.out.println(sb.reverse());
        System.out.println("------------------");
        //什么方式最快判断一个数为回文数 : 正序 = 反序
        String str = "123321";
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1.equals(sb1.reverse()));//判断

        StringBuilder sb2 = new StringBuilder(s1);
        sb2.append(s2).append(30);
        System.out.println(sb2);

    }
}
