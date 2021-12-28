package org.ravi.codingprac.serviceimpl.interviewquestions.expedia;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class PasswordValidatorImplTest {

    @Test
    public void testCase1() {
        String oldPassword = "ValidPwd1";
        String newPassword = "ValidPwd3";
        String[] bannedWords = {"expedia", "password"};
        int minLength = 7;
        int maxLength = 9;

        assertEquals("VALID", new PasswordValidatorImpl().validatePassword(oldPassword, newPassword, bannedWords, minLength, maxLength));
    }

    @Test
    public void testCase2() {
        String oldPassword = "ValidPwd2";
        String newPassword = "expediapass";
        String[] bannedWords = {"expedia", "password"};
        int minLength = 8;
        int maxLength = 14;

        assertEquals("INVALID 2 3 4", new PasswordValidatorImpl().validatePassword(oldPassword, newPassword, bannedWords, minLength, maxLength));
    }

    @Test
    public void testCase3() {
        String oldPassword = "Password1";
        String newPassword = "Password1";
        String[] bannedWords = {"expedia", "password"};
        int minLength = 10;
        int maxLength = 15;

        assertEquals("INVALID 1 5", new PasswordValidatorImpl().validatePassword(oldPassword, newPassword, bannedWords, minLength, maxLength));
    }
}