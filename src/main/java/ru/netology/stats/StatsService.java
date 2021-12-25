package ru.netology.stats;

public class StatsService {
    public int calcSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findTheMean(long[] sales) {
        return calcSum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int BelowAverage(long[] sales) { // Месяцы с продажами ниже среднего
        int underAverage = 0;
        for (long sale : sales) {
            if (sale < findTheMean(sales)) {
                underAverage += 1;
            }
        }
        return underAverage;


    }

    public int AboveAverage(long[] sales) { // Месяцы с продажами выше среднего
        int overAverage = 0;
        for (long sale : sales) {
            if (sale < findTheMean(sales)) {
                overAverage += 1;
            }
        }
        return overAverage;
    }
}