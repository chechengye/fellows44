package day02;

import java.util.Scanner;

/**
 * 从键盘输入一个成绩，判断该分数是否及格。
 * X ? Y : Z
 */
public class Example02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = sc.nextInt();
        //60
        System.out.println(score > 60 ? "及格" : "不及格");
    }
}
