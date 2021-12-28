package org.ravi.codingprac.serviceimpl.hackerrank.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpingOnTheCloudsImplTest {
    int noOfJumps;
    int[] clouds;

    @Test
    void testCloudsNull() {
        this.clouds = null;
        this.noOfJumps = -1;
        assertEquals(this.noOfJumps, new JumpingOnTheCloudsImpl().countNoOfJumps(this.clouds));
    }

    @Test
    void testCloudsZeroLength() {
        this.clouds = new int[]{};
        this.noOfJumps = 0;
        assertEquals(this.noOfJumps, new JumpingOnTheCloudsImpl().countNoOfJumps(this.clouds));
    }

    @Test
    void testClouds1() {
        this.clouds = new int[]{0, 0, 1, 0, 0, 1, 0};
        this.noOfJumps = 4;
        assertEquals(this.noOfJumps, new JumpingOnTheCloudsImpl().countNoOfJumps(this.clouds));
    }

    @Test
    void testClouds2() {
        this.clouds = new int[]{0, 0, 0, 1, 0, 0};
        this.noOfJumps = 3;
        assertEquals(this.noOfJumps, new JumpingOnTheCloudsImpl().countNoOfJumps(this.clouds));
    }
}