package org.ravi.codingprac.serviceimpl.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JadeCasingStringsImplTest {
    @Test
    public void testJadenCase() {
        assertEquals("Most Trees Are Blue", new JadeCasingStringsImpl().toJadenCase("most trees are blue"));
    }

    @Test
    public void testJadenCaseNullArg() {
        assertNull(null, new JadeCasingStringsImpl().toJadenCase(null));
    }

    @Test
    public void testJadenCaseEmptyArg() {
        assertNull(null, new JadeCasingStringsImpl().toJadenCase(""));
    }

    @Test
    void testJadenCaseApache() {
        assertEquals("Most Trees Are Blue", new JadeCasingStringsImpl().toJadenCaseApache("most trees are blue"));
    }

    @Test
    public void testJadenCaseNullApache() {
        assertNull(null, new JadeCasingStringsImpl().toJadenCaseApache(null));
    }

    @Test
    public void testJadenCaseEmptyArgApache() {
        assertNull(null, new JadeCasingStringsImpl().toJadenCaseApache(""));
    }
}