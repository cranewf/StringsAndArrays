package ru.netology.stats;

public class StatsService {

    public long getSumSell(long[] sellArray) {
        long sum = 0;
        for (int i = 0; i < sellArray.length; i++) {
            sum = sum + sellArray[i];
        }
        return sum;

    }

    public long getAverageSell(long[] sellArray) {
        long sum = getSumSell(sellArray);
        long average = 0;
        for (int i = 0; i < sellArray.length; i++) {
            average = sum / sellArray.length;
        }
        return average;
    }

    public int getMaxSell(long[] sellArray) {
        int maxSell = 0;
        for (int i = 0; i < sellArray.length; i++) {
            if (sellArray[i] >= sellArray[maxSell]) {
                maxSell = i;
            }
        }

        return maxSell + 1;
    }

    public int getMinSell(long[] sellArray) {
        int minSell = 0;
        for (int i = 0; i < sellArray.length; i++) {
            if (sellArray[i] < sellArray[minSell]) {
                minSell = i;
            }
        }

        return minSell + 1;
    }

    public int getMinAverageSell(long[] sellArray) {
        int minAverageSell = 0;
        long average = getAverageSell(sellArray);
        for (int i = 0; i < sellArray.length; i++) {
            if (sellArray[i] < average) {
                minAverageSell++;
            }
        }
        return minAverageSell;
    }

    public int getMaxAverageSell(long[] sellArray) {
        int maxAverageSell = 0;
        long average = getAverageSell(sellArray);
        for (int i = 0; i < sellArray.length; i++) {
            if (sellArray[i] > average) {
                maxAverageSell++;
            }
        }

        return maxAverageSell;
    }

}

