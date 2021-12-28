package org.ravi.codingprac.serviceimpl.algoexpert.arrays.easy;

import org.ravi.codingprac.service.algoexpert.arrays.easy.SortedSquaredArray;

import java.util.Arrays;

public class SortedSquaredArrayImpl implements SortedSquaredArray {
    @Override
    public int[] squaredSortedArray1(int[] array) {
        int[] resultArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            resultArray[i] = (int) Math.pow(array[i], 2);
        }
        Arrays.sort(resultArray);
        return resultArray;
    }

    @Override
    public int[] squaredSortedArray2(int[] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int resultIndex = endIndex;
        int[] resultArray = new int[endIndex + 1];
        while (resultIndex >= 0) {
            if (Math.abs(array[startIndex]) > Math.abs(array[endIndex])) {
                resultArray[resultIndex] = (int) Math.pow(array[startIndex], 2);
                ++startIndex;
            } else {
                resultArray[resultIndex] = (int) Math.pow(array[endIndex], 2);
                --endIndex;
            }
            --resultIndex;
        }
        return resultArray;
    }
    @Override
    public int[] squaredSortedArray3(int[] array) { return new int[0]; }
}
