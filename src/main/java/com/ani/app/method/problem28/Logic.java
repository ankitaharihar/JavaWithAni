package com.ani.app.method.problem28;

public class Logic {
    public String removeDuplicates(String str) {
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            
            
            boolean found = false;
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == current) {
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                result = result + current;
            }
        }
        
        return result;
    }
}