package com.ani.app.method.problem20;

public class Logic {
    public int countWords(String str) {
        if (str.length() == 0) {
            return 0;
        }
        
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}