package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturnRemainBeforeBoundary() {
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test

    public void shouldReturnRemainAfterBoundary() {
        int amount =1_001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test

    public void shouldNotReturnRemainBeforeBoundary() {
        int amount = 1_000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }


}
