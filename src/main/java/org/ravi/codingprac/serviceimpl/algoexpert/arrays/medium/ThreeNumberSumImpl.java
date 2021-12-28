package org.ravi.codingprac.serviceimpl.algoexpert.arrays.medium;

import lombok.extern.slf4j.Slf4j;
import org.ravi.codingprac.service.algoexpert.arrays.medium.ThreeNumberSum;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Slf4j
public class ThreeNumberSumImpl implements ThreeNumberSum {
    @Override
    public List<Integer[]> calculateThreeNumberSum(int[] array, int targetSum) {
        List<Integer[]> result = new ArrayList<Integer[]>();
        Integer[] tempIntArray;
        int leftIndex;
        int rightIndex;
        Arrays.sort(array);
        for (int i = 0; i < array.length - 2; i++) {
            leftIndex = i + 1;
            rightIndex = array.length - 1;
            while (leftIndex < rightIndex ) {
                tempIntArray = new Integer[3];
                if (array[i] + array[leftIndex] + array[rightIndex] == targetSum) {
                    tempIntArray[0] = array[i];
                    tempIntArray[1] = array[leftIndex];
                    tempIntArray[2] = array[rightIndex];
                    result.add(tempIntArray);
                    ++leftIndex;
                    --rightIndex;
                } else if (array[i] + array[leftIndex] + array[rightIndex] < targetSum) {
                    ++leftIndex;
                } else if (array[i] + array[leftIndex] + array[rightIndex] > targetSum){
                    --rightIndex;
                }
            }
        }
        return result;
    }
}
