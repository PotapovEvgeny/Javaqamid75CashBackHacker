package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashBackHackServiceTest {
    CashBackHackService service = new CashBackHackService();

    @Test
    public void shouldAmountLess1000() {
        int expected = 100;
        int actual = service.remain(900);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAmountUnder1000() {
        int expected = 999;
        int actual = service.remain(1001);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAmountIs1000() {
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }
}
