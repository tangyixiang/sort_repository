package com.example.demo.sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSortDemo {

    public static void main(String[] args) {
        int[] a = {1,5,20,4,15,2};

        /*
         *  默认从第二个元素开始排序,先保证部分有序，然后循环从后面加一个元素加入排序部分中
      */
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            for (int j = i-1; j >= 0 ; j--) {
                if(a[j+1] > a[j]){
                    a[j+1] = a[j];
                    a[j] = temp;
                }else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }


}
