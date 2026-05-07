package com.ani.app.method.problem06;

public class Logic {
    public boolean isPalindrome(int n) {
        int original = n;
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return original == rev;
    }
}