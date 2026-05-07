package com.ani.app.method.problem23;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Logic logic = new Logic();
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = logic.rotateArray(arr, 2);
        System.out.println(Arrays.toString(result));
    }
}