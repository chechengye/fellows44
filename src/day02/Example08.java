package day02;

/**
 * 2、计算10的阶乘
 *  1*2*3...*10
 */
public class Example08 {
    public static void main(String[] args) {
        int i = 1;
        int num = 1;
        while (i < 3){
            num *= i ++;
        }
        System.out.println(num);
    }
}
