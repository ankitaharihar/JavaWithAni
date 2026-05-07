package com.ani.app.method.problem26;

public class Logic {
    public char firstNonRepeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            boolean isRepeating = false;
            
            for (int j = 0; j < str.length(); j++) {
                if (i != j && current == str.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }
            
            if (!isRepeating) {
                return current;
            }
        }
        
        return '\0';
    }
}