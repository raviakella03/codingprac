package org.ravi.codingprac.serviceimpl.algoexpert.arrays.medium;

import org.ravi.codingprac.service.algoexpert.arrays.medium.FirstDuplicateValue;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateValueImpl implements FirstDuplicateValue {
    @Override
    public int getFirstDuplicateValue1(int[] array) {
        Set<Integer> tempSet = new HashSet<Integer>();
        int pointer = 0;
        while (pointer < array.length) {
            if (tempSet.contains(array[pointer])) {
                return array[pointer];
            } else {
                tempSet.add(array[pointer]);
                ++pointer;
            }
        }
        return -1;
    }
}
