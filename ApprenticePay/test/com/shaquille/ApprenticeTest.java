package com.shaquille;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApprenticeTest {
    Apprentice apprentice2;
    Apprentice apprentice1;

    @Before
    public void setUp() {
        apprentice1 = new Apprentice();
        apprentice2 = new Apprentice("Apprentice", 53.13, 40, 0, 0, 0, 0);
    }

    @Test
    public void setName() {
        assertNotNull(apprentice2.getName());
        assertEquals("Apprentice", apprentice2.getName());
        assertEquals("Apprenti", apprentice1.getName());
    }

    @Test
    public void setPayRate() {
        assertEquals(53.13, apprentice1.getPayRate(), .01);
        assertFalse(apprentice1.getPayRate() < 0);
    }

    @Test
    public void setHoursWorkedInAWeek() {
        assertEquals(40, apprentice1.getHoursWorkedInAWeek());
        assertFalse(apprentice1.getHoursWorkedInAWeek() < 40);
    }

    @Test
    public void setGiBillHousingRate() {
        assertTrue(apprentice1.getGiBillHousingRate() >= 0);
    }

    @Test
    public void setVaDisabilityPay() {
        assertTrue(apprentice1.getVaDisabilityPay() >= 0);
    }

    @Test
    public void setSignOnBonusTotal() {
        assertTrue(apprentice1.getSignOnBonusTotal() >= 0);

    }

    @Test
    public void setStocksVestingAmount() {
        assertTrue(apprentice1.getStocksVestingAmount() >= 0);

    }
}