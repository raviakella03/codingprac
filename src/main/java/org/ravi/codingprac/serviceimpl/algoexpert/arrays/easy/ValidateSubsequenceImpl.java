package org.ravi.codingprac.serviceimpl.algoexpert.arrays.easy;

import lombok.extern.slf4j.Slf4j;
import org.ravi.codingprac.service.algoexpert.arrays.easy.ValidateSubsequence;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Slf4j
public class ValidateSubsequenceImpl implements ValidateSubsequence {
    @Override
    public boolean isValidSubsequence1(List<Integer> array, List<Integer> sequence) {

        if (array.size() < sequence.size()) {
            return false;
        } else if (1 == sequence.size()) {
            return array.contains(sequence.get(0));
        } else {
            for (Integer subSequenceEntry : sequence) {
                if (array.contains(subSequenceEntry)) {
                    if (array.indexOf(subSequenceEntry) + 1 == array.size()) {
                        array.clear();
                    } else {
                        array = array.subList(array.indexOf(subSequenceEntry) + 1, array.size());
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
    }

    @Override
    public boolean isValidSubsequence2(List<Integer> array, List<Integer> sequence) {
        int prevIndex = 0;
        int arraySize = array.size();
        int seqSize = sequence.size();
        if (arraySize < seqSize) {
            return false;
        } else if (1 == seqSize) {
            return array.contains(sequence.get(0));
        } else {
            for (Integer subSequenceEntry : sequence) {
                if (array.subList(prevIndex, arraySize).contains(subSequenceEntry)) {
                    for (int j = prevIndex; j < arraySize; j++) {
                        if (Objects.equals(subSequenceEntry, array.get(j))) {
                            prevIndex = j + 1;
                            break;
                        }
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
    }

    @Override
    public boolean isValidSubsequence3(List<Integer> array, List<Integer> sequence) {
        int prevIndex=0;
        int arraySize = array.size();
        int seqSize = sequence.size();

        if (arraySize < seqSize) {
            return false;
        } else if (1 == seqSize) {
            return array.contains(sequence.get(0));
        } else {
            for (Integer subSequenceEntry : sequence) {
//                System.out.println("subSequenceEntry: " + subSequenceEntry + " prevIndex: " + prevIndex + ", array: " + array.subList(prevIndex, arraySize));
                if (array.subList(prevIndex, arraySize).contains(subSequenceEntry)) {
                    if (prevIndex >= array.indexOf(subSequenceEntry)) {
                        ++prevIndex;
                    } else {
                        prevIndex = array.indexOf(subSequenceEntry) + 1;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
    }

    public boolean isValidSubsequence4(List<Integer> array, List<Integer> sequence) {
        int arrayIndex = 0;
        int sequenceIndex = 0;
        while (arrayIndex < array.size() && sequenceIndex < sequence.size()) {
            if (array.get(arrayIndex).equals(sequence.get(sequenceIndex))) {
                ++sequenceIndex;
            }
            ++arrayIndex;
        }
        return sequenceIndex == sequence.size();
    }

    public boolean isValidSubsequence5(List<Integer> array, List<Integer> sequence) {
        int sequenceIndex = 0;
        for (Integer arrayValue : array) {
            if (sequenceIndex == sequence.size()) {
                break;
            }
            if (sequence.get(sequenceIndex).equals(arrayValue)) {
                ++sequenceIndex;
            }
        }
        return sequenceIndex == sequence.size();
    }
}
