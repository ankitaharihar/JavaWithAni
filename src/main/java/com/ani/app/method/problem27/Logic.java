package com.ani.app.method.problem27;

public class Logic {
    public void countAll(String str) {
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if (c >= '0' && c <= '9') {
                digits++;
            }
            else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                     c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowels++;
            }
            else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                consonants++;
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
    }
}
