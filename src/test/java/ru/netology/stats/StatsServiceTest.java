package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSalesAmount() {
        StatsService service = new StatsService();

        long[] sellArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.getSumSell(sellArray);

        Assertions.assertEquals(expectedSum,actualSum);
    }

    @Test
    public void shouldAverageSales() {
        StatsService service = new StatsService();
        long[] sellArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverage = 15;
        long actualAverage = service.getAverageSell(sellArray);

        Assertions.assertEquals(expectedAverage, actualAverage);

    }

    @Test
    public void shouldMaxSell() {
        StatsService service = new StatsService();
        long[] sellArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxSell = 8;
        int actualMaxSell = service.getMaxSell(sellArray);

        Assertions.assertEquals(expectedMaxSell, actualMaxSell);
    }

    @Test
    public void shouldMinSell() {
        StatsService service = new StatsService();
        long[] sellArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinSell = 9;
        int actualMinSell = service.getMinSell(sellArray);

        Assertions.assertEquals(expectedMinSell,actualMinSell);
    }

    @Test
    public void shouldNumberMonthMinAverageSell() {
        StatsService service = new StatsService();
        long[] sellArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMinAverageSell = 5;
        long actualMinAverageSell = service.getMinAverageSell(sellArray);

        Assertions.assertEquals(expectedMinAverageSell,actualMinAverageSell);
    }

    @Test
    public void shouldNumberMonthMaxAverageSell() {
        StatsService service = new StatsService();
        long[] sellArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxAverageSell = 5;
        long actualMaxAverageSell = service.getMaxAverageSell(sellArray);

        Assertions.assertEquals(expectedMaxAverageSell, actualMaxAverageSell);
    }

}