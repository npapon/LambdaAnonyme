package com.myfirsttdd.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculateurTest {

    @Test
    void testAddTwoPositiveNumber() {
        int a = 1;
        int b = 2;
        Calculator calculator = new Calculator();
        assertEquals( 3, calculator.addTWoPositiveNumber( a, b ) );
    }

    @Test
    void testMultiplyCalculator() {
        int a = 3;
        int b = 2;
        Calculator calculator = new Calculator();
        assertEquals( 6, calculator.multiplyTwoNumer( a, b ) );
    }

}
