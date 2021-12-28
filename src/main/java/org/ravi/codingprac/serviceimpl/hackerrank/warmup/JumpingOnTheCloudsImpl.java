package org.ravi.codingprac.serviceimpl.hackerrank.warmup;

import lombok.extern.slf4j.Slf4j;
import org.ravi.codingprac.service.hackerrank.warmup.JumpingOnTheClouds;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JumpingOnTheCloudsImpl implements JumpingOnTheClouds {
    int noOfJumps;

    public int countNoOfJumps(int[] clouds) {
        if (null == clouds) {
            this.noOfJumps = -1;
        } else if (0 == clouds.length) {
            this.noOfJumps = 0;
        } else {
            for (int i = 0; i < clouds.length - 1; ) {
                if (i != clouds.length - 2 && clouds[i + 2] == 0) {
                    ++this.noOfJumps;
                    i = i + 2;
                } else if (clouds[i + 1] == 0) {
                    ++this.noOfJumps;
                    ++i;
                }
            }
        }
        return this.noOfJumps;
    }
}
