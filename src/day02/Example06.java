package day02;

import java.util.Scanner;

/**
 * 输入一个月数，然后输出对应月份有多少天（不考虑闰年），将天数输出。
 */
public class Example06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入月份:");
        int m = sc.nextInt();
        switch (m){
            case 2:
                System.out.println("有28天！");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("有30天！");
                break;
            default:
                System.out.println("有31天！");
        }
        //if else : 分支语句中应用场景最多
        if(m > 2){
            System.out.println();
        }else if(m == 4 || m == 6 || m == 9){

        }else{
            System.out.println("有31天！");
        }
    }
}
