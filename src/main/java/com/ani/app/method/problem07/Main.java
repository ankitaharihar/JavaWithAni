package com.ani.app.method.problem07;

public class Main {

    public static void main(String[] args) {

        Logic logic = new Logic();

        int num = 72;

        if (logic.isPrime(num)) {

            System.out.println(num + " is Prime");

        } else {

            System.out.println(num + " is Not Prime");

        }

    }
}