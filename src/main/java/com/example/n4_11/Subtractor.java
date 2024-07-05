package com.example.n4_11;

import org.springframework.stereotype.Component;

@Component
public class Subtractor implements Operation{
    public double getResult (double a, double b) {
        return a - b;
    }
}
