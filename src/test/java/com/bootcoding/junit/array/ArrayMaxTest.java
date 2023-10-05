package com.bootcoding.junit.array;

import org.junit.Test;

import static org.junit.Assert.*;
public class ArrayMaxTest {
@Test
    public void test(){
    ArrayMax arrayMax = new ArrayMax();
        int[] num = {20,30,50,18,23};
        int actualNum = arrayMax.getMax(num);
        int expectedNum = 50;
        assertEquals(expectedNum,actualNum);
    }
}
