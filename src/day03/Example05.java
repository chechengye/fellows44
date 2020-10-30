package day03;

import java.util.Scanner;

/**
 * 1、猜数游戏：从键盘中任意输入一个数据，判断数列中是否包含此数
 */
public class Example05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("猜数: ");
        int num = sc.nextInt();
        int[] arr = {12,34,55,67,88,99};
        boolean b = findNum(num, arr);
        if(b) System.out.println("猜对了！");
        else System.out.println("猜错了！");

        findNum(arr , num);
    }

    /**
     * 使用return来操作
     * @param num
     * @param arr
     * @return
     */
    public static boolean findNum(int num , int[] arr){
        for(int x : arr){
            if(x == num)
               return true;
        }
        return false;
    }
    /**
     * 第二种方式 可以使用标志位来操作
     */
    public static void findNum(int[] arr , int num){
        boolean flag = false;
        for(int x : arr){
            if(x == num) {
                flag = true;
                break;
            }
        }
        if(flag) System.out.println("猜对了!");
        else System.out.println("猜错了");
    }
}
