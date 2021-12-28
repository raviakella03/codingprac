package org.ravi.codingprac.serviceimpl.hackerrank.warmup;

import lombok.extern.slf4j.Slf4j;
import org.ravi.codingprac.service.hackerrank.warmup.CountingValleys;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CountingValleysImpl implements CountingValleys {
    int noOfValleys;
    int level;
    public int countValleys(int noOfSteps, String hikePath){

        if (0 == noOfSteps) {
            this.noOfValleys = 0;
        } else if (null == hikePath) {
            this.noOfValleys = -1;
        } else if (noOfSteps != hikePath.length()) {
            this.noOfValleys = -2;
        } else {
            for (char step : hikePath.toCharArray()) {
                if (step == 'U')
                    ++this.level;
                if (step == 'D')
                    --this.level;
                if (this.level == 0 && step == 'U')
                    ++this.noOfValleys;
            }
        }
        return this.noOfValleys;
    }
}
