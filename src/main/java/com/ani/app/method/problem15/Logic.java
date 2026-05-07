package com.ani.app.method.problem15;

import java.util.ArrayList;

public class Logic {
    public int[] removeDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}