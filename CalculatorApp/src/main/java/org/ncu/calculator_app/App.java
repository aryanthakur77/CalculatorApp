package org.ncu.calculator_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        // step 1: initialize spring container
        ApplicationContext context = new AnnotationConfigApplicationContext(CalculatorConfig.class);
        Calculator calculator = (Calculator) context.getBean("calculator");

        calculator.compute("add", 10, 5);
        calculator.compute("subtract", 10, 5);
        calculator.compute("multiply", 10, 5);
        calculator.compute("divide", 10, 5);
        
    }
}
