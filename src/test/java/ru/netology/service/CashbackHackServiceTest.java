package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

public class CashbackHackServiceTest {
    CashbackHackService  service = new CashbackHackService();

    @Test
    public void IfAmount1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void IfAmount900() {
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void IfAmountBefore1000() {
        int amount = 700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(actual, expected);
    }

    @Test
    public void IfAmount0() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void IfAmountUnder1000() {
        int amount = 1600;
        int actual = service.remain(amount);
        int expected = 400;
        assertEquals(actual, expected);
    }
}

