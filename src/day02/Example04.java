package day02;

/**
 * 2、写一个程序，判断某一年是否为闰年
 * （被4整除但不能被100整除或者能被400整除)是闰年否则是平年
 */
public class Example04 {
    public static void main(String[] args) {
        int y = 2001;
        if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0){
            System.out.println("是闰年!");
        }else{
            System.out.println("是平年！");
        }
    }
}
