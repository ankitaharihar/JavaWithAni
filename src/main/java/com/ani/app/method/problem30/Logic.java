package com.ani.app.method.problem30;

public class Logic {
    public String compressString(String str) {
        if (str.length() == 0) {
            return "";
        }
        
        String result = "";
        int count = 1;
        
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result = result + str.charAt(i);
                if (count > 1) {
                    result = result + count;
                }
                count = 1;
            }
        }
        
        return result;
    }
}