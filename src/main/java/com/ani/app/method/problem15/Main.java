package com.ani.app.method.problem15;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Logic logic = new Logic();
        int[] arr = {3, 7, 2, 7, 5, 3};
        System.out.println(Arrays.toString(logic.removeDuplicates(arr)));
    }
}