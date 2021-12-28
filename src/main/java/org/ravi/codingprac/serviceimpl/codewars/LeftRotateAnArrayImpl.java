package org.ravi.codingprac.serviceimpl.codewars;

import lombok.extern.slf4j.Slf4j;
import org.ravi.codingprac.service.codewars.LeftRotateAnArray;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Slf4j
public class LeftRotateAnArrayImpl implements LeftRotateAnArray {

    public String printArray(int[] inputArray) {
        return Arrays.toString(inputArray);
    }

    public int[] leftRotate(int[] inputArray, int noOfRotations) {
        int lengthOfInputArray = inputArray.length;
        int[] outputArray = new int[inputArray.length];
        log.debug(printArray(inputArray));
        for(int i = 0; i < lengthOfInputArray; i++) {
            if (i>=0 && i < lengthOfInputArray-noOfRotations) {
                outputArray[i] = inputArray[i+noOfRotations];
            } else if (i >= lengthOfInputArray-noOfRotations && i < lengthOfInputArray) {
                if (lengthOfInputArray-noOfRotations-i >= 0) {
                    outputArray[i] = inputArray[lengthOfInputArray-noOfRotations-i];
                } else if (lengthOfInputArray-noOfRotations-i < 0) {
                    outputArray[i] = inputArray[noOfRotations+i-lengthOfInputArray];
                }
            }
        }
        log.debug(printArray(outputArray));
        return outputArray;
    }
}
