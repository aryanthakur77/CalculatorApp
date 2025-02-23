package org.ncu.calculator_app;

import org.springframework.stereotype.Component;

@Component
public class DivisionService implements MathService  {
	public void operate(int x, int y) {
        if (y != 0) {
            System.out.println("Division Result: " + (x / y));
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

}
