package org.examples.module2;

import org.examples.module1.Calculator;

public class AdvancedCalculator extends Calculator {
    /**
     * Simple subtraction operation.
     *
     * @param a First operand
     * @param b Second operand
     * @return Subtraction of two operands
     */
    public int subtract(int a, int b) {
        return a - b;
    }
}
