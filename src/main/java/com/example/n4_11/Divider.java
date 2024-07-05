package com.example.n4_11;

import org.springframework.stereotype.Component;

@Component
public class Divider implements Operation{
    public double getResult(double a, double b){
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
