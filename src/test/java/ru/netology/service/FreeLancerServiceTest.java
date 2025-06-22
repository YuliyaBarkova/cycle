package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreeLancerServiceTest {

    @Test
    public void testCalcMonth1() {
        FreeLancerService service = new FreeLancerService();
        int income = 10_000;
        int expences = 3_000;
        int threshold = 20_000;
        int actual = service.calculate(income, expences, threshold);

        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcMonth2() {
        FreeLancerService service = new FreeLancerService();
        int income = 100_000;
        int expences = 60_000;
        int threshold = 150_000;
        int actual = service.calculate(income, expences, threshold);

        int expected = 2;
        Assertions.assertEquals(expected, actual);

    }
}

