package org.ncu.calculator_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
	@Autowired
	private MathService additionService;
	@Autowired
    private MathService subtractionService;
	@Autowired
    private MathService multiplicationService;
	@Autowired
    private MathService divisionService;
    public void setAdditionService(MathService additionService) {
        this.additionService = additionService;
    }

    public void setSubtractionService(MathService subtractionService) {
        this.subtractionService = subtractionService;
    }

    public void setMultiplicationService(MathService multiplicationService) {
        this.multiplicationService = multiplicationService;
    }

    public void setDivisionService(MathService divisionService) {
        this.divisionService = divisionService;
    }
    public void compute(String operation, int x, int y) {
        switch (operation.toLowerCase()) {
            case "add":
                additionService.operate(x, y);
                break;
            case "subtract":
                subtractionService.operate(x, y);
                break;
            case "multiply":
                multiplicationService.operate(x, y);
                break;
            case "divide":
                divisionService.operate(x, y);
                break;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }

}
