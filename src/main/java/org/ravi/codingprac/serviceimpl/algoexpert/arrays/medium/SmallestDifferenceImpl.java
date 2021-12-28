package org.ravi.codingprac.serviceimpl.algoexpert.arrays.medium;

import lombok.extern.slf4j.Slf4j;
import org.ravi.codingprac.service.algoexpert.arrays.medium.SmallestDifference;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Slf4j
public class SmallestDifferenceImpl implements SmallestDifference {

    @Override
    public int[] calculateSmallestDifference1(int[] arrayOne, int[] arrayTwo) {
        int firstPointer = 0;
        int secondPointer = 0;
        int difference;
//       "arrayOne": [-1, 5, 10, 20, 28, 3],
//       "arrayTwo": [26, 134, 135, 15, 17]

        difference = Math.abs(arrayOne[firstPointer] - arrayTwo[secondPointer]);
//        difference = 16
        for (int i = 0; i < arrayOne.length; ) {
            for (int j = 0; j < arrayTwo.length; ) {
                if (difference > Math.abs(arrayOne[i] - arrayTwo[j])) {
                    difference = Math.abs(arrayOne[i] - arrayTwo[j]);
                    firstPointer = i;
                    secondPointer = j;
                }
                ++j;
            }
            ++i;
        }
        return new int[]{arrayOne[firstPointer], arrayTwo[secondPointer]};
    }

    @Override
    public int[] calculateSmallestDifference2(int[] arrayOne, int[] arrayTwo) {
        int smallestDifference = Integer.MAX_VALUE;
        int currentDifference = Integer.MAX_VALUE;
        int firstPointer = 0;
        int secondPointer = 0;
        int[] smallestPair = new int[2];

        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        while (firstPointer < arrayOne.length && secondPointer < arrayTwo.length) {
            currentDifference = Math.abs(arrayTwo[secondPointer] - arrayOne[firstPointer]);

            if (smallestDifference > currentDifference) {
                smallestDifference = currentDifference;
                smallestPair = new int[]{arrayOne[firstPointer], arrayTwo[secondPointer]};
            }

            if (arrayOne[firstPointer] < arrayTwo[secondPointer]) {
                ++firstPointer;
            } else if (arrayTwo[secondPointer] < arrayOne[firstPointer]) {
                ++secondPointer;
            } else {
                return new int[] {arrayOne[firstPointer], arrayTwo[secondPointer]};
            }
        }
        return smallestPair;
    }
}