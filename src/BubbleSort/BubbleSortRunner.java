package BubbleSort;

import InsertionSort.InsertionSort;

import java.util.Arrays;

public class BubbleSortRunner {
    public static void main(String[] args) {
        int [] arr={3,1,2};
        System.out.println("Sort işlemi öncesi array :");
        System.out.println(Arrays.toString(arr));
        System.out.println("************************");
        System.out.println("BubleSort işlemi sonrası : ");
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("***************************");
    }
}
