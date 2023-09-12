package com.bootcoding.junit.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySumTest {
    @Test
    public void test(){
        ArraySum arraySum = new ArraySum();
        int[] sum = {1,2,3,4,5};
        int actualSum = arraySum.getSum(sum);
        int expectedSum = 15;
        assertEquals(expectedSum,actualSum);
    }


}