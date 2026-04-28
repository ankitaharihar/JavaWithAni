package com.ani.app.util;

public final class Helper {
    private Helper() {
    }

    public static String reverse(String value) {
        return new StringBuilder(value).reverse().toString();
    }
}