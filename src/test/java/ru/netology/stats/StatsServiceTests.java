package ru.netology.stats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTests {

    private StatsService service;       // ОБЪЯВЛЯЕМ поле для тестируемого сервиса
    private long[] salesData;           // ОБЪЯВЛЯЕМ поле для тестовых данных

    // Этот метод запускается ПЕРЕД КАЖДЫМ тестом
    @BeforeEach
    public void setUp() {   // Объявление метода настройки
        service = new StatsService();     // Создаем экземпляр (объект) класса StatsService для тестирования
        salesData = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};    // тестовые данные
    }

    @Test
    public void testMaxSales() {
        long expected = 8;
        long actual = service.maxSales(salesData);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSales() {
        long expected = 9;
        long actual = service.minSales(salesData);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateAverage() {
        long expected = 15;
        long actual = service.calculateAverage(salesData);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountMonthsBelowAverage() {
        long expected = 5;
        long actual = service.countMonthsBelowAverage(salesData);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountMonthsBeMoreAverage() {
        long expected = 5;
        long actual = service.countMonthsAboveAverage(salesData);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateTotalSales() {
        long expected = 180;
        long actual = service.calculateTotalSales(salesData);
        Assertions.assertEquals(expected, actual);
    }
}
