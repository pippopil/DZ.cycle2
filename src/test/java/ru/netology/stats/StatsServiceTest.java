package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalcSum() {
        StatsService service = new StatsService();
        long[] generalSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calcSum(generalSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindTheMean() {
        StatsService service = new StatsService();
        long[] generalSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.findTheMean(generalSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSalesMonth() {
        StatsService service = new StatsService();
        long[] generalSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(generalSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinSalesMonth() {
        StatsService service = new StatsService();
        long[] generalSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(generalSales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldBelowAverage() {
        StatsService service = new StatsService();
        long[] generalSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.BelowAverage(generalSales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldAboveAverage() {
        StatsService service = new StatsService();
        long[] generalSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.AboveAverage(generalSales);
        assertEquals(expected, actual);
    }
}