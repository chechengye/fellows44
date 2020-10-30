package day03;

/**
 * 1x1 = 1
 * 1x2 = 2  2x2 = 4
 * ..
 * ..
 */
public class Example02 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 9 ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j + "x" + i + "=" + (j*i) + "\t");
            }
            System.out.println();
        }
    }
}
