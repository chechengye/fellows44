package day03;

/**
 * *
 * **
 * ***
 * ****
 * *****
 */
public class Example01 {
    public static void main(String[] args) {
        printCr(12);
    }

    public static void printCr(int line){
        for(int i = 1 ; i <= line ;i++){
            for(int j = 1 ; j <= i ; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
