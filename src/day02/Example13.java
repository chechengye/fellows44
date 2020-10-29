package day02;

/**
 * 输出10个斐波那契（Fibonacci）数列：1 1 2 3 5 8 13 21 34 55。
 * （特点：第1,2两个数值为1，从第三个数开始，该数是其前面两个数之和）
 */
public class Example13 {
    public static void main(String[] args) {
        int i = 1 , j = 1;
        for (int n = 0 ; n < 5 ; n ++){
            System.out.print(i + " " + j + " ");
            i = i + j;
            j = i + j;
        }
    }
}
