package org.ravi.codingprac.serviceimpl.algoexpert.arrays.medium;

import org.ravi.codingprac.service.algoexpert.arrays.medium.MoveElementToEnd;

import java.util.List;

public class MoveElementToEndImpl implements MoveElementToEnd {
    @Override
    public List<Integer> moveElementToEnd1(List<Integer> array, int toMove) {
        int firstIndex = 0;
        int secondIndex = array.size() - 1;

        while (firstIndex < secondIndex) {
            if (toMove != array.get(firstIndex)) {
                ++firstIndex;
            } else {
                if (!(array.get(firstIndex).equals(array.get(secondIndex)))) {
                    //swap the numbers
                    array.set(firstIndex, array.get(firstIndex) + array.get(secondIndex));
                    array.set(secondIndex, array.get(firstIndex) - array.get(secondIndex));
                    array.set(firstIndex, array.get(firstIndex) - array.get(secondIndex));
                    ++firstIndex;
                }
                --secondIndex;
            }
        }
        return array;
    }
}
