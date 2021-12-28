package org.ravi.codingprac.serviceimpl.codewars;

import lombok.extern.slf4j.Slf4j;
import org.ravi.codingprac.service.codewars.CharacterFrequencyCount;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Slf4j
public class CharacterFrequencyCountImpl implements CharacterFrequencyCount {
    
    public String getCharacterFrequency(String input) {

        String output;
        char[] myCharArray;

        if (null == input) {
            output = null;
        } else {
            myCharArray = input.toCharArray();
            output = "";
            Arrays.sort(myCharArray);
            String inputSorted = String.valueOf(myCharArray);
            for (int i = 0; i < myCharArray.length; i++) {
                char currentChar = myCharArray[i];
                int currentCharCount = 0;
                currentCharCount = inputSorted.lastIndexOf(currentChar) - i + 1;
                i = inputSorted.lastIndexOf(currentChar);
                output = output + currentChar + currentCharCount;
            }
        }
        return output;
    }
}
