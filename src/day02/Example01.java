package day02;


import java.util.Scanner;

/**
 * 通过键盘输入，初始化两个数将这两个数据交换位置后，输出显示交换后的数据。
 */
public class Example01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        int a = sc.nextInt();
        System.out.println("请输入：");
        int b = sc.nextInt();
        int temp;//临时变量/空瓶子
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + " , " + b);

    }
}
