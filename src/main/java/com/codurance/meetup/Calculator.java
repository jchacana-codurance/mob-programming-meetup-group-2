package com.codurance.meetup;

public class Calculator {

    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        return Integer.parseInt(numbers);
    }
}
