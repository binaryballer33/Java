package com.shaquille;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MortgageCalculatorTest {
    @Test
    public void calculateMortgage() {
        MortgageCalculator myHouse = new MortgageCalculator(800_000, 3.5, 30);
        assertEquals(3592.36, myHouse.calculateMortgage(), 0.0001);
    }
}