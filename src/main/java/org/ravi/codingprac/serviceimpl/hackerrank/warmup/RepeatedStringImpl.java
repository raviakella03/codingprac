package org.ravi.codingprac.serviceimpl.hackerrank.warmup;

import lombok.extern.slf4j.Slf4j;
import org.ravi.codingprac.service.hackerrank.warmup.RepeatedString;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Slf4j
public class RepeatedStringImpl implements RepeatedString {

    public long getNoOfAInString(String s, long n) throws ArithmeticException {
        long noOfRepetitions=0;
        int stringLength = s.length();
        int noOfRepsInActStr;
        char[] inputCharArray;
        String finalInputString;
        long quotient = n / stringLength;
        long remainder = n % stringLength;

        if (stringLength == 0 || n == 0 || !s.contains("a")) {
            noOfRepetitions = 0;
        } else if(stringLength == 1 && s.equals("a")) {
            noOfRepetitions = n;
        } else if (stringLength > 1 && s.contains("a")){
            if (stringLength > n) {
                inputCharArray = s.substring(0, (int) remainder).toCharArray();
                Arrays.sort(inputCharArray);
                finalInputString = String.valueOf(inputCharArray);
                noOfRepetitions = finalInputString.lastIndexOf('a') - finalInputString.indexOf('a') + 1;
            } else {
                inputCharArray = s.toCharArray();
                Arrays.sort(inputCharArray);
                s = String.valueOf(inputCharArray);
                noOfRepsInActStr = s.lastIndexOf('a') - s.indexOf('a') + 1;
                noOfRepetitions = noOfRepsInActStr * quotient;
                if(remainder != 0) {
                    inputCharArray = s.substring(0, (int) remainder).toCharArray();
                    Arrays.sort(inputCharArray);
                    finalInputString = String.valueOf(inputCharArray);
                    noOfRepetitions = noOfRepetitions + finalInputString.lastIndexOf('a') - finalInputString.indexOf('a') + 1;
                }
            }
        }
        return noOfRepetitions;
    }

    public long getNoOfAInStringAlt(String s, long n) {
        long quotient = n / s.length();
        long remainder = n % s.length();
        if(!s.contains("a")) return 0;
        return s.length() > n ? characterCounter(s, remainder) : quotient * characterCounter(s, s.length()) + characterCounter(s, remainder);
    }

    private static long characterCounter(String s, long end) {
        int a=0;
        for (int i = 0; i < end; i++) {
            if (s.charAt(i) == 'a')
                a++;
        }
        return a;
    }
}
