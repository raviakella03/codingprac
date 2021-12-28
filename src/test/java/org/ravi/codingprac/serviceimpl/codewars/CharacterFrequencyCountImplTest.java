package org.ravi.codingprac.serviceimpl.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterFrequencyCountImplTest {
    @Test
    void testCFCUnSortedAlphaNumericSplChars() {
        assertEquals("#3$21422324551@1a3b1c4e3g1", new CharacterFrequencyCountImpl().getCharacterFrequency("11112233444445aaabccccgeee@$$###"));
    }

    @Test
    void testCFCUnSortedAlphaNumeric() {
        assertEquals("1422324551a3b1c4e3g1", new CharacterFrequencyCountImpl().getCharacterFrequency("11112233444445aaabccccgeee"));
    }

    @Test
    void testCFCUnSortedNumeric() {
        assertEquals("1422324551", new CharacterFrequencyCountImpl().getCharacterFrequency("11112233444445"));
    }

    @Test
    void testCFCUnSortedAlpha() {
        assertEquals("a3b1", new CharacterFrequencyCountImpl().getCharacterFrequency("aaba"));
    }

    @Test
    void testCFCSorted() {
        assertEquals("a4b2c1d2e2", new CharacterFrequencyCountImpl().getCharacterFrequency("aaaabbcddee"));
    }

    @Test
    void testCFCNull() {
        assertNull(new CharacterFrequencyCountImpl().getCharacterFrequency(null));
    }
}