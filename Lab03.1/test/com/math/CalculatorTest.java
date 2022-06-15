/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
  private final double TOLERANCE = .1;
  private Calculator calc = new Calculator();

  @Test
  public void add() {
    assertEquals(5, calc.add(1, 4));  // expected, actual
  }

  @Test
  void divide() {
    assertEquals(2.5, calc.divide(5,2), 0.001);
  }


  @Test
  void isEven() {
    assertTrue(calc.isEven(2));
  }

  @Test
  void sqrt_nonNegative() {
    Calculator calc = new Calculator();
    assertEquals(0, calc.sqrt(0), TOLERANCE);
    assertEquals(1, calc.sqrt(1), TOLERANCE);
    assertEquals(10, calc.sqrt(100), TOLERANCE);
    assertEquals(9.9, calc.sqrt(98.01), TOLERANCE);
  }

  @Test
  void sqrt_negative() {
    Calculator calc = new Calculator();
    try {
      calc.sqrt(-1);
      fail("Expected exception of type java.lang.IllegalArgumentException but no Exception was thrown.");
    } catch (IllegalArgumentException e) {
      // Do nothing: Expected exception was thrown
    } catch (AssertionError e) {
      // Do nothing: Thrown by fail()
      throw e;
    } catch ( Throwable e) {
      fail(String.format("Expected exception: java.lang.IllegalArgumentException; actual exception=%s",
              e.getClass().getName()));
    }
  }

  @Test
  void sqrt_negative() {
    assertThrows(IllegalArgumentException.class, new SqrtRunner(calc));
  }

  private static class SqrtRunner implements Executable {
    private final Calculator calc;

    private SqrtRunner(Calculator calc) {
      this.calc = calc;
    }

    @Override
    public void execute() throws Throwable {
      calc.sqrt(-1);
    }
  }
}