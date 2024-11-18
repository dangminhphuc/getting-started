package com.dangminhphuc.gs.algorithms.sorting;

import java.util.Comparator;

public class BubbleSorting {
    public static void sort(int[] arr) {
        int temp;
        boolean swapped;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                // criteria
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static <T> void sort(T[] arr, Comparator<? super T> c) {
        T temp;
        boolean swapped;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}
