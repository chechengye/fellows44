package day03;

/**
 *     *
 *    **
 *   ***
 *  ****
 * *****
 */
public class Example03 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 5 ; j >= 1 ; j--){
                if(j <= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
