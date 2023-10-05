package com.bootcoding.junit.array;

public class ArrayMax {
    public int getMax(int number[]) {
        int i;
        int max = number[0];
        for (i = 1; i < number.length; i++)
            if (number[i] > max)
                max = number[i];
        return max;
    }
}
