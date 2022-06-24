package com.shaquille.finance;

import org.junit.Test;
import static org.junit.Assert.*;

public class FinanceTest {
    @Test
    public void calculatePay() {
        assertEquals(110510.0, Finance.calculatePay(53.13, 0,0, 0,
                0, 40), 0.0001);
        assertEquals(131231.0, Finance.calculatePay(53.13, 0,0, 0,
                0, 45), 0.0001);
        assertEquals(151951.0, Finance.calculatePay(53.13, 0,0, 0,
                0, 50), 0.0001);


        assertEquals(138504.0, Finance.calculatePay(53.13, 2592,0, 0,
                0, 40), 0.0001);
        assertEquals(159224.0, Finance.calculatePay(53.13, 2592,0, 0,
                0, 45), 0.0001);
        assertEquals(179945.0, Finance.calculatePay(53.13, 2592,0, 0,
                0, 50), 0.0001);

        assertEquals(190254.0, Finance.calculatePay(53.13, 2592,3450, 0,
                0, 40), 0.0001);
        assertEquals(210974.0, Finance.calculatePay(53.13, 2592,3450, 0,
                0, 45), 0.0001);
        assertEquals(231695.0, Finance.calculatePay(53.13, 2592,3450, 0,
                0, 50), 0.0001);

        assertEquals(204254.0, Finance.calculatePay(53.13, 2592,3450, 14000,
                0, 40), 0.0001);
        assertEquals(224974.0, Finance.calculatePay(53.13, 2592,3450, 14000,
                0, 45), 0.0001);
        assertEquals(245695.0, Finance.calculatePay(53.13, 2592,3450, 14000,
                0, 50), 0.0001);


        assertEquals(225254.0, Finance.calculatePay(53.13, 2592,3450, 14000,
                21000, 40), 0.0001);

        assertEquals(245974.0, Finance.calculatePay(53.13, 2592,3450, 14000,
                21000, 45), 0.0001);

        assertEquals(266695.0, Finance.calculatePay(53.13, 2592,3450, 14000,
                21000, 50), 0.0001);
    }
}
