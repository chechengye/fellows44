package day02;

/**
 * 打印100以内所有的奇数，偶数和3的倍数（不包括100）
 */
public class Example09 {
    public static void main(String[] args) {
        int i = 1;
        String ou = "";
        String js = "";
        String tbs = "";
        while (i < 100){
            if(i % 2 == 0){
                ou += i + " ";
            }else{
                js += i + " ";
            }
            if(i % 3 == 0){
                tbs += i + " ";
            }
            i++;
        }
        System.out.println("偶数为：" + ou);
        System.out.println("奇数为：" + js);
        System.out.println("3的倍数为：" + tbs);
    }
}
