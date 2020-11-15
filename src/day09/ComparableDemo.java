package day09;

import java.util.Arrays;

public class ComparableDemo {

    public static void main(String[] args) {
        int[] arr = {2,4,1,8,6,12};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------");
        String[] array = {"tom","lucy","lily","ace"};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));//字母的自然顺序
        System.out.println("---------------------");
        Bird[] birds = {new Bird("麻雀",3),new Bird("黄鹂",2),new Bird("鹦鹉",10)};
        Arrays.sort(birds , new BirdComparator());//如何调用比较器
        System.out.println(Arrays.toString(birds));
    }
}
