package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldcalculateSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(sales);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldculcAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.culcAvg(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldNumberMonthsIsBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.numberMonthsIsBelowAverage(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldNumberMonthsIsAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.numberMonthsIsBelowAverage(sales);

        assertEquals(expected, actual);
    }
}