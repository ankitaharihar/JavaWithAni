package com.ani.app.method.problem23;

public class Logic {
    public int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            int newPosition = (i + k) % n;
            result[newPosition] = arr[i];
        }
        
        return result;
    }
}