package com.bootcoding.junit.array;

public class ArraySum {
    public int getSum(int number[]){
        int sum =0;
        for (int n:number){
            sum +=n;
        }
        return sum;
    }
}
