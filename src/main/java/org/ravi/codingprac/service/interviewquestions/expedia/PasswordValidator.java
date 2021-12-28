package org.ravi.codingprac.service.interviewquestions.expedia;

    /*
    * ## Password Validator
    * Password validation is a core part of our login pages here at Expedia. A common use case is one where a user would like to update their password.
    * Here you need to implement a basic version of our password validation mechanism. Assume the old (`op`) and new (`np`) password of a user.
    * Also, assume a list of banned words (`bw`) (words that shouldn't been part of any password), and a minimum (`minimum`) and maximum (`maximum`) length for the password.
    * Your task is to check whether each new password `np` is valid or not. A new password is valid if it meets the following rules:
    * | Rule ID | Description
    * |---------|------------------------------------------------------------------------------|
    * | 1       | Contains at least `minimum` characters but no more than `maximum` characters |
    * | 2       | Contains at least 1 uppercase character                                      |
    * | 3       | Contains at least one number [0-9]                                           |
    * | 4       | Does not include any banned words from `bw` (**case-sensitive**)             |
    * | 5       | Differs from the old password  `op`                                          |
    * |---------|------------------------------------------------------------------------------|
    * In case a password meets the above-mentioned requirements print `VALID`, else print `INVALID` followed by the ids of the rules that are not met (one-based,
    * in ascending order).
    * **Notes**
    *   - `op`, `np`, and `bw` consist of English letters (i.e. [a−zA-z])
    *   - `op` and `np` may also contain numbers (i.e. [0-9])
    *   - Please don't worry about the input/output format. You can hard-code values, pass them as arguments, etc.
    *   - Also make sure to verify the correctness of your implementation.
    *
    * Sample Input1 :
    * op = "ValidPwd1", np = "ValidPwd3", bw = ["expedia", "password"], minimum = 7, maximum = 9
    * Sample Output1: VALID
    * Explanation:
    * The new password (`ValidPwd3`) contains an uppercase letter (e.g. "V") and a number ("3").
    * Also, its length is 9, its associated old password is "ValidPwd1" and it does not contain any banned words.
    * As a result, it's a valid password.
    *
    * Sample Input2:
    * op = "ValidPwd2", np = "expediapass", bw = ["expedia", "password"], minimum = 8, maximum = 14
    * Sample Output2: INVALID 2 3 4
    * Explanation:
    * The new password (`expediapass`) does not contain any uppercase letters or numbers.
    * Its length is 11, and its associated old password is "ValidPwd2". Also, it includes the word "expedia" which is banned.
    * As a result, it does not meet requirements 2, 3, and 4.
    *
    * Sample Input3:
    * op = "Password1", np = "Password1", bw = ["expedia", "password"], minimum = 10, maximum = 15
    * Sample Output3: INVALID 1 5
    * Explanation: The new password (`Password1`) does not meet the length requirements and its associated old password is identical
    * to the new one. Note that, due to case-sensitivity, `Password1` does not contain the banned word `password`!
    * Good luck :)
    * */



public interface PasswordValidator {
    public String validatePassword(String oldPassword, String newPassword, String[] bannedWords, int minLength, int maxLength);
}
