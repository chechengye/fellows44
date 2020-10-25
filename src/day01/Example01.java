package day01;

import java.util.Scanner;

/**
 * 通过键盘输入声明初始化一个圆柱体的高和底面半径,pai值是3.14,求圆柱体的体积,
 * 并显示输出圆柱体的体积; π(r^2)h。
 */
public class Example01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入半径:");
        int r = sc.nextInt();//.var : 自动帮我们补齐，函数返回的类型
        System.out.print("请输入高:");
        int h = sc.nextInt();
        System.out.println("圆柱体体积为：" + 3.14 * r * r * h);
    }
}
