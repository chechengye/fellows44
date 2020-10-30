package day03;

/**
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *     A
 *    BBB
 *   CCCCC
 *  DDDDDDD
 * EEEEEEEEE
 */
public class Example04 {
    public static void main(String[] args) {
        char c = 'A';
        for(int i = 1 ; i <= 5 ; i++){//在一个作用域中，我们的变量是不允许重复定义
            for(int k = 5 ; k > i ;  k --){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= 2 * i - 1 ; j++){
                System.out.print(c); //运算的时候，会将字符转换为对应的ASCII值进行操作
            }
            //c = (char) (c+1);//强制类型转换，损失精度
            c++;//任何类型自增/自减都不会改变原有的类型
            System.out.println();
        }
    }
}
