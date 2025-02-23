package org.ncu.calculator_app;

import org.springframework.stereotype.Component;

@Component
public class AdditionService implements MathService {    
    public void operate(int x, int y) {
    System.out.println("Addition Result: " + (x + y));

}
}