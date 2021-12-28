package org.ravi.codingprac.serviceimpl.algoexpert.arrays.easy;

import org.ravi.codingprac.service.algoexpert.arrays.easy.NonConstructibleChange;

import java.util.Arrays;

public class NonConstructibleChangeImpl implements NonConstructibleChange {
    @Override
    public int calculateMinNonConstructible1(int[] coins) {
        int minConstructibleChange = 0;
        if (0 != coins.length) {
            Arrays.sort(coins);
            for (int i = 0; i < coins.length; i++) {
                if (minConstructibleChange + 1 < coins[i]) {
                    return minConstructibleChange + 1;
                } else {
                    minConstructibleChange += coins[i];
                }
            }
        }
        return minConstructibleChange + 1;
    }

    @Override
    public int calculateMinNonConstructible2(int[] coins) {
        return 0;
    }

    @Override
    public int calculateMinNonConstructible3(int[] coins) {
        return 0;
    }
}
