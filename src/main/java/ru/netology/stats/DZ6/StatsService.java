package ru.netology.stats.DZ6;


public class StatsService {

    public int sumOfAllSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int aspMouth(int[] sales) { //aspMouth = Average Sales Per Mouth
        int sum = sumOfAllSales(sales);
        return sum / sales.length;
    }

    public int sMaxSMouth(int[] sales) { // sMaxSMouth = search Max SalesMouth
        int maxMouth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMouth]) {
                maxMouth = i;
            }
        }
        return maxMouth;
    }

    public int smsMouth(int[] sales) { // smsMouth = searchMinSalesMouth
        int minMouth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMouth]) {
                minMouth = i;
            }
        }
        return minMouth;
    }

    public int SalesMouthBelowAverage(int[] sales) {
        int amount = aspMouth(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < amount) {
                count++;
            }
        }
        return count;
    }

    public int SalesMouthAboveAverage(int[] sales) {
        int amount = aspMouth(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= amount) {
                count++;
            }
        }
        return count;
    }

}








