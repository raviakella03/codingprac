package org.ravi.codingprac.serviceimpl.algoexpert.arrays.easy;

import lombok.extern.slf4j.Slf4j;
import org.ravi.codingprac.service.algoexpert.arrays.easy.TwoNumberSum;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Slf4j
public class TwoNumberSumImpl implements TwoNumberSum {

    @Override
    public int[] calculateTwoNumberSum1(int[] array, int targetSum) {
        if (array.length == 1) {
            return new int[0];
        } else if (array.length == 2) {
            return array[0] + array[1] == targetSum ? array : new int[0];
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++)
                    if (array[i] + array[j] == targetSum) {
                        return new int[]{array[i], array[j]};
                    }
            }
        }
        return new int[0];
    }

    @Override
    public int[] calculateTwoNumberSum2(int[] array, int targetSum) {
        Set<Integer> providedArraySet = new HashSet<Integer>();
        if (array.length == 1) {
            return new int[0];
        } else if (array.length == 2) {
            return array[0] + array[1] == targetSum ? array : new int[0];
        } else {
            for (int value : array) {
                if (providedArraySet.contains(targetSum - value)) {
                    return new int[] {targetSum-value, value};
                } else {
                    providedArraySet.add(value);
                }
            }
        }
        return new int[0];
    }

    @Override
    public int[] calculateTwoNumberSum3(int[] array, int targetSum) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        if (array.length == 1) {
            return new int[0];
        } else if (array.length == 2) {
            return array[0] + array[1] == targetSum ? array : new int[0];
        } else {
            Arrays.sort(array);
            while (leftIndex < rightIndex) {
                if (array[leftIndex] + array[rightIndex] == targetSum) {
                    return new int[]{array[leftIndex], array[rightIndex]};
                } else if (array[leftIndex] + array[rightIndex] < targetSum) {

                    ++leftIndex;
                } else if (array[leftIndex] + array[rightIndex] > targetSum) {
                    --rightIndex;
                }
            }
        }
        return new int[0];
    }
}
