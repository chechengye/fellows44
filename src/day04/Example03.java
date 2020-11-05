package day04;

/**
 * 选择排序算法
 * 第一遍处理之后  minIndex = 3  //最小值的索引
 */
public class Example03 {
    public static void main(String[] args) {
        int[] arr = {88,4,5,2,66,11,44};
        for(int i = 0 ; i < arr.length ; i ++){
            int minIndex = i;
            for(int j = i + 1 ;  j < arr.length ; j ++){
                if(arr[minIndex] > arr[j])
                    minIndex = j;
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            for(int x : arr){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
