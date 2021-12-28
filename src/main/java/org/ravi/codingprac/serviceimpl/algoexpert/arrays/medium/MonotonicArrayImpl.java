package org.ravi.codingprac.serviceimpl.algoexpert.arrays.medium;

import lombok.extern.slf4j.Slf4j;
import org.ravi.codingprac.service.algoexpert.arrays.medium.MonotonicArray;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MonotonicArrayImpl implements MonotonicArray {
    @Override
    public boolean isMonotonicArray(int[] array) {
        boolean status = true;
        String trend = "";

        if (array.length < 1) {
            return status;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i+1]) {
                trend = trend + "I";
            } else if (array[i] > array[i+1]){
                trend = trend + "D";
            }
        }
        if (trend.startsWith("I")) {
            if(trend.contains("D")) {
                status = false;
            } else {
                status = true;
            }
        } else if (trend.startsWith("D")) {
            if(trend.contains("I")) {
                status = false;
            } else {
                status = true;
            }
        }
        return status;
    }
}
