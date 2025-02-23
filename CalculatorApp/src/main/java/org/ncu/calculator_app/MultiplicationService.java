package org.ncu.calculator_app;

import org.springframework.stereotype.Component;

@Component
public class MultiplicationService implements MathService {
	 public void operate(int x, int y) {
	        System.out.println("Multiplication Result: " + (x * y));
	    }

}
