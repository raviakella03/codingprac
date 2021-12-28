package org.ravi.codingprac.serviceimpl.hackerrank.warmup;

import lombok.extern.slf4j.Slf4j;
import org.ravi.codingprac.service.hackerrank.warmup.SalesByMatch;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Slf4j
public class SalesByMatchImpl implements SalesByMatch {

    int noOfPairs;
    char[] socksColorsArray;

    int sockMerchant(int noOfSocks, String socksColors) {
        if (0 == noOfSocks) {
            this.noOfPairs = 0;
        } else if (null == socksColors) {
            this.noOfPairs = -2;
        } else if (noOfSocks != socksColors.toCharArray().length) {
            this.noOfPairs = -1;
        } else {
            socksColorsArray = socksColors.toCharArray();
            Arrays.sort(socksColorsArray);
            socksColors = String.valueOf(socksColorsArray);
            for (int i = 0; i < noOfSocks; i++) {
                this.noOfPairs = this.noOfPairs + ((socksColors.lastIndexOf(socksColors.charAt(i)) - i + 1) / 2);
                i = socksColors.lastIndexOf(socksColors.charAt(i));
            }
        }
        return this.noOfPairs;
    }
}
