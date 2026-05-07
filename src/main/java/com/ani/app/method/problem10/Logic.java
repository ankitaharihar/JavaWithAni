package com.ani.app.method.problem10;

public class Logic {
    public int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
}