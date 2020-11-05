package day04;

/**
 * 在一个数列中找出最大的数
 */
public class Example01 {
    public static void main(String[] args) {
        int[] arr = {3,22,11,6,-7,101,88};//静态初始化
        int maxValue =  arr[0];//最终指向的是数组中的最大值
        for(int x : arr){
            if(x > maxValue)
                maxValue = x;
        }
        System.out.println("最大值为:" + maxValue);
    }
}
