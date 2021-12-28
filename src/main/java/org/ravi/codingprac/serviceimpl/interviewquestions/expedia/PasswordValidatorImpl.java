package org.ravi.codingprac.serviceimpl.interviewquestions.expedia;

import lombok.extern.slf4j.Slf4j;
import org.ravi.codingprac.service.interviewquestions.expedia.PasswordValidator;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
@Slf4j
public class PasswordValidatorImpl implements PasswordValidator {
    @Override
    public String validatePassword(String oldPassword, String newPassword, String[] bannedWords, int minLength, int maxLength) {
        String invalidPassword = "INVALID";
        Pattern pattern;
        Matcher matcher;
        boolean isMatch ;
        String upperCaseRegex = "^(.*)([A-Z])(.*)$";
        String numberRegex = "^(.*)([0-9])(.*)$";

//        1       | Contains at least `minimum` characters but no more than `maximum` characters
        if (!(newPassword.length() >= minLength && newPassword.length() <= maxLength)) {
            invalidPassword = invalidPassword + " 1";
        }

//        2       | Contains at least 1 uppercase character
        pattern = Pattern.compile(upperCaseRegex);
        matcher = pattern.matcher(newPassword);
        if (!matcher.matches()) {
            invalidPassword = invalidPassword + " 2";
        }

//        3       | Contains at least one number [0-9]
        pattern = Pattern.compile(numberRegex);
        matcher = pattern.matcher(newPassword);
        if (!matcher.matches()) {
            invalidPassword = invalidPassword + " 3";
        }

//        4       | Does not include any banned words from `bw` (**case-sensitive**)
        isMatch = Arrays.stream(bannedWords).anyMatch(s -> {
            final String bannedWordsRegex = "(.*)(" + s + ")(.*)";
            return newPassword.matches(bannedWordsRegex);
        });

        if (isMatch) {
            invalidPassword = invalidPassword + " 4";
        }

//        5       | Differs from the old password  `op`
        if (newPassword.equals(oldPassword)) {
            invalidPassword = invalidPassword + " 5";
        }

        return invalidPassword.equals("INVALID") ? "VALID" : invalidPassword;
    }
}
