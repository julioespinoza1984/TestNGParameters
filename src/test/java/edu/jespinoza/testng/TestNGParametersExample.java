package edu.jespinoza.testng;

import edu.jespinoza.testng.impl.CalculatorImpl;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersExample {

    @Parameters({ "number1", "number2", "sum" })
    @Test
    public void testAdd(int number1, int number2, int sum) {
        Calculator calculator = CalculatorImpl.getInstance();
        Assert.assertEquals(calculator.add(number1, number2), sum);
    }

    @Parameters({ "number1", "number2", "difference" })
    @Test
    public void testSubtract(int number1, int number2, int difference) {
        Calculator calculator = CalculatorImpl.getInstance();
        Assert.assertEquals(calculator.subtract(number1, number2), difference);
    }

    @Parameters({ "number1", "number2", "multiplication", "global_count" })
    @Test
    public void testMultiply(int number1, int number2, int multiplication, int global_count) {
        Calculator calculator = CalculatorImpl.getInstance();
        for (int i = 0; i < global_count; i++) {
            Assert.assertEquals(calculator.multiply(number1, number2), multiplication);
        }
    }

    @Parameters({ "number1", "number2", "division" })
    @Test
    public void testDivide(int number1, int number2, int division) {
        Calculator calculator = CalculatorImpl.getInstance();
        Assert.assertEquals(calculator.divide(number1, number2), division);
    }

    @Parameters({ "number1", "number2", "squaresum" })
    @Test
    public void testSquareSum(int number1, int number2, @Optional("925") int squaresum) {
        Calculator calculator = CalculatorImpl.getInstance();
        Assert.assertEquals(calculator.squaresum(number1, number2), squaresum);
    }

}