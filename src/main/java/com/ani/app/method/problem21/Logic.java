package com.ani.app.method.problem21;

public class Logic {
    public int findSecondLargest(int[] arr) {
        int first = arr[0];
        int second = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        return second;
    }
}