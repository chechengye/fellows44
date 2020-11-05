package day04;

/**
 * 冒泡排序算法
 * 第一遍   j = 44  , j - 1= 88   2会冒泡到最前面
 */
public class Example02 {
    public static void main(String[] args) {
        int[] arr = {11,4,5,2,66,88,44};
        //从后向前
        for(int i = 0 ; i < arr.length - 1 ; i++){
            for(int j = arr.length - 1 ; j > i ; j --){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
            for(int x : arr){
                System.out.print(x + " ");
            }
            System.out.println();
        }


    }
}
