package day01;

import java.util.Scanner;

/**
 * 根据天数（46）计算周数和剩余的天数，天数是通过键盘输入。
 */
public class Example03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入天数：");
        int d = sc.nextInt();

        System.out.println("周数: " + d / 7 + " , 天数:" + d % 7);
    }
}
