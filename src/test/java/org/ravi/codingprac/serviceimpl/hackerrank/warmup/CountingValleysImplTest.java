package org.ravi.codingprac.serviceimpl.hackerrank.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingValleysImplTest {

    int noOfSteps;
    String hikePath;

    @Test
    void testZeroNoOfSteps() {
        this.noOfSteps = 0;
        this.hikePath = "";
        assertEquals(0, new CountingValleysImpl().countValleys(this.noOfSteps, this.hikePath));
    }

    @Test
    void testNullHikePath() {
        this.noOfSteps = 38;
//        this.hikePath = null;
        assertEquals(-1, new CountingValleysImpl().countValleys(this.noOfSteps, null));
    }

    @Test
    void testUnequalStepsHikePath() {
        this.noOfSteps = 12;
        this.hikePath = "UDUUDDD";
        assertEquals(-2, new CountingValleysImpl().countValleys(this.noOfSteps, this.hikePath));
    }

    @Test
    void testCountValleys1() {
        this.noOfSteps = 8;
        this.hikePath = "UDDDUDUU";
        assertEquals(1, new CountingValleysImpl().countValleys(this.noOfSteps, this.hikePath));
    }

    @Test
    void testCountValleys2() {
        this.noOfSteps = 12;
        this.hikePath = "DDUUDDUDUUUD";
        assertEquals(2, new CountingValleysImpl().countValleys(this.noOfSteps, this.hikePath));
    }
}