package com.ani.app.method.problem22;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Logic logic = new Logic();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] result = logic.mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}