package org.ravi.codingprac.serviceimpl.algoexpert.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoNumberSumImplTest {

    //Test cases for implementation 1
    @Test
    public void testSolution_1_1() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum1(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        assertEquals(2, output.length);
        assertTrue((output[0] == -1 && output[1] == 11) || (output[0] == 11 && output[1] == -1));
    }

    @Test
    public void testSolution_1_2() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum1(new int[] {4, 6}, 10);
        assertEquals(2, output.length);
        assertTrue((output[0] == 4 && output[1] == 6) || (output[0] == 6 && output[1] == 4));
    }

    @Test
    public void testSolution_1_3() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum1(new int[] {4, 6, 1}, 5);
        assertEquals(2, output.length);
        assertTrue((output[0] == 1 && output[1] == 4) || (output[0] == 4 && output[1] == 1));
    }

    @Test
    public void testSolution_1_4() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum1(new int[] {4, 6, 1, -3}, 3);
        assertEquals(2, output.length);
        assertTrue((output[0] == -3 && output[1] == 6) || (output[0] == 6 && output[1] == -3));
    }

    @Test
    public void testSolution_1_5() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum1(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 17);
        assertEquals(2, output.length);
        assertTrue((output[0] == 9 && output[1] == 8) || (output[0] == 8 && output[1] == 9));
    }

    @Test
    public void testSolution_1_6() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum1(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 15}, 18);
        assertEquals(2, output.length);
        assertTrue((output[0] == 15 && output[1] == 3) || (output[0] == 3 && output[1] == 15));
    }

    @Test
    public void testSolution_1_7() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum1(new int[] {-7, -5, -3, -1, 0, 1, 3, 5, 7}, -5);
        assertEquals(2, output.length);
        assertTrue((output[0] == 0 && output[1] == -5) || (output[0] == -5 && output[1] == 0));
    }

    @Test
    public void testSolution_1_8() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum1(new int[] {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 163);
        assertEquals(2, output.length);
        assertTrue((output[0] == 210 && output[1] == -47) || (output[0] == -47 && output[1] == 210));
    }

    @Test
    public void testSolution_1_9() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum1(new int[] {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 164);
        assertEquals(0, output.length);
    }

    @Test
    public void testSolution_1_10() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum1(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 15);
        assertEquals(0, output.length);
    }

    @Test
    public void testSolution_1_11() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum1(new int[] {14}, 15);
        assertEquals(0, output.length);
    }

    @Test
    public void testSolution_1_12() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum1(new int[] {15}, 15);
        assertEquals(0, output.length);
    }
    
    //Test cases for implementation 2
    @Test
    public void testSolution_2_1() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum2(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        assertEquals(2, output.length);
        assertTrue((output[0] == -1 && output[1] == 11) || (output[0] == 11 && output[1] == -1));
    }

    @Test
    public void testSolution_2_2() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum2(new int[] {4, 6}, 10);
        assertEquals(2, output.length);
        assertTrue((output[0] == 4 && output[1] == 6) || (output[0] == 6 && output[1] == 4));
    }

    @Test
    public void testSolution_2_3() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum2(new int[] {4, 6, 1}, 5);
        assertEquals(2, output.length);
        assertTrue((output[0] == 1 && output[1] == 4) || (output[0] == 4 && output[1] == 1));
    }

    @Test
    public void testSolution_2_4() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum2(new int[] {4, 6, 1, -3}, 3);
        assertEquals(2, output.length);
        assertTrue((output[0] == -3 && output[1] == 6) || (output[0] == 6 && output[1] == -3));
    }

    @Test
    public void testSolution_2_5() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum2(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 17);
        assertEquals(2, output.length);
        assertTrue((output[0] == 9 && output[1] == 8) || (output[0] == 8 && output[1] == 9));
    }

    @Test
    public void testSolution_2_6() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum2(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 15}, 18);
        assertEquals(2, output.length);
        assertTrue((output[0] == 15 && output[1] == 3) || (output[0] == 3 && output[1] == 15));
    }

    @Test
    public void testSolution_2_7() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum2(new int[] {-7, -5, -3, -1, 0, 1, 3, 5, 7}, -5);
        assertEquals(2, output.length);
        assertTrue((output[0] == 0 && output[1] == -5) || (output[0] == -5 && output[1] == 0));
    }

    @Test
    public void testSolution_2_8() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum2(new int[] {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 163);
        assertEquals(2, output.length);
        assertTrue((output[0] == 210 && output[1] == -47) || (output[0] == -47 && output[1] == 210));
    }

    @Test
    public void testSolution_2_9() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum2(new int[] {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 164);
        assertEquals(0, output.length);
    }

    @Test
    public void testSolution_2_10() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum2(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 15);
        assertEquals(0, output.length);
    }

    @Test
    public void testSolution_2_11() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum2(new int[] {14}, 15);
        assertEquals(0, output.length);
    }

    @Test
    public void testSolution_2_12() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum2(new int[] {15}, 15);
        assertEquals(0, output.length);
    }

    //Test cases for implementation 3

    @Test
    public void testSolution_3_1() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum3(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        assertEquals(2, output.length);
        assertTrue((output[0] == -1 && output[1] == 11) || (output[0] == 11 && output[1] == -1));
    }

    @Test
    public void testSolution_3_2() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum3(new int[] {4, 6}, 10);
        assertEquals(2, output.length);
        assertTrue((output[0] == 4 && output[1] == 6) || (output[0] == 6 && output[1] == 4));
    }

    @Test
    public void testSolution_3_3() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum3(new int[] {4, 6, 1}, 5);
        assertEquals(2, output.length);
        assertTrue((output[0] == 1 && output[1] == 4) || (output[0] == 4 && output[1] == 1));
    }

    @Test
    public void testSolution_3_4() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum3(new int[] {4, 6, 1, -3}, 3);
        assertEquals(2, output.length);
        assertTrue((output[0] == -3 && output[1] == 6) || (output[0] == 6 && output[1] == -3));
    }

    @Test
    public void testSolution_3_5() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum3(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 17);
        assertEquals(2, output.length);
        assertTrue((output[0] == 9 && output[1] == 8) || (output[0] == 8 && output[1] == 9));
    }

    @Test
    public void testSolution_3_6() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum3(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 15}, 18);
        assertEquals(2, output.length);
        assertTrue((output[0] == 15 && output[1] == 3) || (output[0] == 3 && output[1] == 15));
    }

    @Test
    public void testSolution_3_7() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum3(new int[] {-7, -5, -3, -1, 0, 1, 3, 5, 7}, -5);
        assertEquals(2, output.length);
        assertTrue((output[0] == 0 && output[1] == -5) || (output[0] == -5 && output[1] == 0));
    }

    @Test
    public void testSolution_3_8() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum3(new int[] {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 163);
        assertEquals(2, output.length);
        assertTrue((output[0] == 210 && output[1] == -47) || (output[0] == -47 && output[1] == 210));
    }

    @Test
    public void testSolution_3_9() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum3(new int[] {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 164);
        assertEquals(0, output.length);
    }

    @Test
    public void testSolution_3_10() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum3(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 15);
        assertEquals(0, output.length);
    }

    @Test
    public void testSolution_3_11() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum3(new int[] {14}, 15);
        assertEquals(0, output.length);
    }

    @Test
    public void testSolution_3_12() {
        int[] output = new TwoNumberSumImpl().calculateTwoNumberSum3(new int[] {15}, 15);
        assertEquals(0, output.length);
    }
}