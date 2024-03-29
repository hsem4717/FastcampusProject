package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public enum ArithmeticOperator {
    ADDICTION("+") {
        @Override
        public int arithmeticcalculate(int operand1, int operand2) {
            return operand1 + operand2;
        }

    },
    SUBTRACTION("-") {
        @Override
        public int arithmeticcalculate(int operand1, int operand2) {
            return operand1 - operand2;
        }
    }, MULTIPLICATION("*") {
        @Override
        public int arithmeticcalculate(int operand1, int operand2) {
            return operand1 * operand2;
        }
    }, DIVISION("/") {
        @Override
        public int arithmeticcalculate(int operand1, int operand2) {
            return operand1 / operand2;
        }
    };

    private final String operator;

    ArithmeticOperator(String operator) {
        this.operator = operator;
    }

    public abstract int arithmeticcalculate(final int operand1, final int operand2);

    public static int calculate(int operand1, String operator, int operand2) {
        ArithmeticOperator arithmeticOperator = Arrays.stream(values())
                .filter(v -> v.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아니에요"));

        return arithmeticOperator.arithmeticcalculate(operand1, operand2);
    };
}
