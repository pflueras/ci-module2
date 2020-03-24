package org.examples.module2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private AdvancedCalculator calculator;

    @Before
    public void setUp() {
        calculator = new AdvancedCalculator();
    }

    @Test
    public void calculatorTest() {
        Assert.assertEquals(12, calculator.multiply(3, 4));
    }
}
