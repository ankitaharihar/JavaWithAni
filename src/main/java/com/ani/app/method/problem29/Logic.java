package com.ani.app.method.problem29;

public class Logic {
    public int longestUniqueSubstring(String str) {
        int maxLength = 0;
        
        for (int i = 0; i < str.length(); i++) {
            String current = "";
            
            for (int j = i; j < str.length(); j++) {
                char c = str.charAt(j);
                
                
                boolean found = false;
                for (int k = 0; k < current.length(); k++) {
                    if (current.charAt(k) == c) {
                        found = true;
                        break;
                    }
                }
                
                if (found) {
                    break;
                }
                
                current = current + c;
                if (current.length() > maxLength) {
                    maxLength = current.length();
                }
            }
        }
        
        return maxLength;
    }
}