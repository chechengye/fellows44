package day02;

/**
 * 打印输出0~200之间能被7整除但不能被4整除的所有整数；
 */
public class Example12 {

    public static void main(String[] args) {
        for(int i = 0 ; i < 201 ; i++){
            if(i % 7 == 0 && i % 4 != 0){
                System.out.print(i + " ");//28
            }
        }
    }
}

