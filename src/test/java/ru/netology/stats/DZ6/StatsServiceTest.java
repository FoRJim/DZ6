package ru.netology.stats.DZ6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    @Test
    public void sumOfAllSalesPerYear() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMount = (180);
        int actual = service.sumOfAllSales(sales);

        Assertions.assertEquals(expectedMount, actual);
    }

    @Test
    public void AverageSalesPerMouth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMount = (15);
        int actual = service.aspMouth(sales);

        Assertions.assertEquals(expectedMount, actual);
    }

    @Test
    public void searchMaxSalesMouth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMount = (7);
        int actual = service.sMaxSMouth(sales);

        Assertions.assertEquals(expectedMount, actual);
    }

    @Test
    public void searchMinSalesMouth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMouth = (8);
        int actual = service.smsMouth(sales);

        Assertions.assertEquals(expectedMouth, actual);

    }

    @Test
    public void NumberOfMonthsBelowAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMount = (5);
        int actual = service.SalesMouthBelowAverage(sales);

        Assertions.assertEquals(expectedMount, actual);
    }

    @Test
    public void NumberOfMonthsAboveAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMount = (7);
        int actual = service.SalesMouthAboveAverage(sales);

        Assertions.assertEquals(expectedMount, actual);
    }
}

