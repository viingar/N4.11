package com.example.n4_11;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class N411Application {
    private final Calculator calculator;

    public N411Application(Calculator calculator) {
        this.calculator = calculator;
    }


    public static void main(String[] args) {

        SpringApplication.run(N411Application.class, args);
    }
    @Bean
    public boolean outToConsole() throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число a");
        double a = in.nextDouble();
        System.out.println("Введите число b");
        double b = in.nextDouble();
        System.out.println("Введите тип операции: " + calculator.getSupportedOperations());
        String operationType = in.next();

        calculator.calc(operationType, a, b);
        return true;
    }
}
