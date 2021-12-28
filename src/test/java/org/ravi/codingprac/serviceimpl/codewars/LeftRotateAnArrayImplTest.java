package org.ravi.codingprac.serviceimpl.codewars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LeftRotateAnArrayImplTest {

    @Test
    public void leftRotateIntArray() {
        int[] input = {1,2,3,4,5,6,7,8,9};
        int noOfRotations = 5;
        int[] expectedOutput = {6,7,8,9,1,2,3,4,5};
        assertEquals(Arrays.toString(expectedOutput), Arrays.toString(new LeftRotateAnArrayImpl().leftRotate(input,noOfRotations)));
    }
}