package day02;

/**
 * 1、计算1-100之间所有整数之和。5050
 *   1+2 + 3 + 4 + 5
 */
public class Example07 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i < 101){
            sum += i++;//sum = sum + (i++)
        }
        System.out.println(sum);
    }
}
