package ru.netology.stats;


public class StatsService {
    // считаем сумму всех элементов
    public long calculateTotalSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum; // возвращаем long
    }

    // считаем среднее значение среди всех элементов
    public int calculateAverage(long[] sales) {
        long sum = calculateTotalSales(sales);
        long s = sum / sales.length;
        return (int) s;
    }

    // находим номер месяца, в котором были максимальные продажи
    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    // считаем все месяца, где продажи были меньше среднего значения
    public int countMonthsBelowAverage(long[] sales) {
        //  Получаем среднее значение, используя ранее написанный метод svg
        int average = calculateAverage(sales);
        int count = 0;

        // Проходим по всем месяцам и считаем те, где продажи ниже среднего
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }

        return count;
    }

    // считаем все месяца, где продажи были больше среднего значения
    public int countMonthsAboveAverage(long[] sales) {
        // 1. Получаем среднее значение, используя ранее написанный метод svg
        int average = calculateAverage(sales);
        int count = 0;

        // Проходим по всем месяцам и считаем те, где продажи больше среднего
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }

        return count;
    }

    // находим номер месяца, в котором были минимальные продажи
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }
}