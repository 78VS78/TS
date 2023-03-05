package service;

import entity.Operation;

public class Calculator {

    public Operation calculate(Operation operation) {
        switch (operation.getType()) {
            case "sum":
                double result1 = operation.getNum1() + operation.getNum2();
                operation.setResult(result1);
                return operation;

            case "sub":
                double result2 = operation.getNum1() - operation.getNum2();
                operation.setResult(result2);
                return operation;
            case "mul":
                double result3 = operation.getNum1() * operation.getNum2();
                operation.setResult(result3);
                return operation;
            case "div":
                double result4 = operation.getNum1() / operation.getNum2();
                operation.setResult(result4);
                return operation;
        }
        return operation;
    }
}
