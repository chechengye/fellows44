package day04;

import org.junit.Test;

import java.util.Arrays;

public class Program {
    /**
     * Arrays工具类
     */
    @Test
    public void testFn(){
        //引用类型默认值是null
        int[] arr = {-1 ,22, 11,-5,1,3,5,6,7};
        //返回值在数组中的索引的,必须是已经排好序的数组
        System.out.println(Arrays.binarySearch(arr, -5));
        System.out.println("------------------------");
        System.out.println(Arrays.toString(arr));//打印输出数组中的内容
        System.out.println("------------------------");
        Arrays.sort(arr);//默认使用的排序算法是快排
        System.out.println(Arrays.toString(arr));
        System.out.println("------------------------");
        arr = Arrays.copyOf(arr , arr.length * 2);//数组的扩容
        System.out.println(Arrays.toString(arr));
        System.out.println("------------------------");
        int[] arr1 = {-1,2,3};
        int[] arr2 = {1,2,3};
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println("------------------------");
        Arrays.fill(arr1 , 0 , 1 , 5);//结束索引是到为止，不包含
        System.out.println(Arrays.toString(arr1));

    }
}
