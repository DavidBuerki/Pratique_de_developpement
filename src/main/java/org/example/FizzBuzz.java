package org.example;

public class FizzBuzz {
public String generate(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid number");
        }

        if (String.valueOf(i).contains("66")) {
            return "FizzBuzz";
        }

        if (i== 6) {
            return "6";
        }

        if (i % 5 == 0 && i % 7 == 0) {
        return "Fizzbuzz";
        }

        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }
        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Fizz";
        }

        if (i % 7 == 0) {
            return "Buzz";
        }

        if (String.valueOf(i).contains("66")) {
        return "FizzBuzz";
        }

        return String.valueOf(i);
    }

    public String generate2(int i) {

        return "Fizz";
    }



    }



