package org.ravi.codingprac.serviceimpl.hackerrank.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedStringImplTest {
    String inputString;
    long completeStringLength;

    @Test
    void testNullinputString() {
        this.inputString = "ajuuo";
        this.completeStringLength = 0;
        assertEquals(0, new RepeatedStringImpl().getNoOfAInStringAlt(this.inputString, this.completeStringLength));
    }

    @Test
    void testEmptyInputString() {
        this.inputString = "";
        this.completeStringLength = 89;
        assertThrows(ArithmeticException.class, () -> {new RepeatedStringImpl().getNoOfAInStringAlt(this.inputString, this.completeStringLength);});
    }

//kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm
//736778906400
//51574523448

//aba
//10
//7

//a
//1000000000000
//1000000000000

//ababa
//3
//2
}