package com.ani.app.method.problem13;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Logic logic = new Logic();
        int[] arr = {3, 7, 2, 9, 5};
        logic.sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}