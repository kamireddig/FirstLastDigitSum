package com.javaLearning;

public class FirstLastDigitSum {
    public static void main(String[] args){
        sumFirstAndLastDigit(252);
        sumFirstAndLastDigit(257);
        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(-10);
    }
    public static int sumFirstAndLastDigit(int number){
        if (number < 0)
            return -1;
        else {
            int lastDigit = number % 10;
            while(number >= 10){
                number /= 10;
            }
            int firstDigit = number;
            return (lastDigit + firstDigit);
        }
    }
}