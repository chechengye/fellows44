package day08;

public class DebugDemo {

    public static void main(String[] args) {
        int a = 20;
        for(int i = 0 ; i < 10 ; i ++){
            if(5 == i){
                a ++;
                method(i , a);
            }
        }
    }

    private static void method(int i , int a) {
        System.out.println(a / 5);
        System.out.println(--i);
    }
}
