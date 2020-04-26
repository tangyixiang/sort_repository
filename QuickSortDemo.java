package com.example.demo.sort;

/**
 * 快速排序
 *
 * 选取一个基准值，一般选择第一个元素为基准值
 * 第一轮将基准值移动到数组的中间位置，然后分治，递归第一轮排序完成排序
 *
 *
 */
public class QuickSortDemo {

    public static void main(String[] args) {
        int[] a = {1, 5, 20, 4, 15, 2};
        partition(a, 0, a.length - 1);

    }
 /**
     *  i = 0,j = array.length - 1
     *  选择基准值，从右边开始比较，将right的值填到left位置，然后从左边开始比较，将比基准值大的填到right位置。
     *  一直循环，直到left的值不小于right值，跳出循环，left的值既是数组中间指针
     *
     */
    public static int partition(int[] source, int left, int right) {
        int temp = source[left];

        while (left < right) {
            //从右边往左边进行比较，如果基准值比右边的值小，则不移动，继续从右边开始比较
            while (temp < source[right] && left < right) {
                right--;
            }
            //跳出循环，说明右边的值比左边的基准值小，将右边的值填到左边
            //同时判断左指针比右指针小
            if (left < right) {
                //将右边的值填到左边，但是右边的值并未有改变，最后source[left] = temp; 才将right的位置填上temp
                source[left] = source[right];
                left++;
            }
            
            //基准值从左边开始比较，如果基准值大于等于left指针的值，left+1继续比较
            while (temp >= source[left] && left < right) {
                left++;
            }

            //如果基准值小于left指针的值，则将left填到right中
            //继续从右边开始比较
            if (left < right) {
                source[right] = source[left];
                right--;
            }
        }
        //之前
        source[left] = temp;
        return left;
    }

    public void quickSort(int[] source, int left, int right) {
        if (source == null || left >= left || source.length <= 1) {
            return;
        }

        int middle = partition(source, left, right);
        quickSort(source, left, middle);
        quickSort(source, middle + 1, right);

    }
}
