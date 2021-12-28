package org.ravi.codingprac.serviceimpl.hackerrank.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesByMatchImplTest {

    int noOfSocks;
    String socksColors;

    @Test
    void testZeroNoOfSocks() {
        this.noOfSocks = 0;
        this.socksColors = "";
        assertEquals(0, new SalesByMatchImpl().sockMerchant(this.noOfSocks, this.socksColors));
    }

    @Test
    void testSocksColorsNull() {
        this.noOfSocks = 7;
//        this.socksColors = null;
        assertEquals(-2, new SalesByMatchImpl().sockMerchant(this.noOfSocks, null));
    }

    @Test
    void testSocksColors() {
        this.noOfSocks = 7;
        this.socksColors = "1212132";
        assertEquals(2, new SalesByMatchImpl().sockMerchant(this.noOfSocks, this.socksColors));
    }

    @Test
    void testSocksColorsAlphaNumSpl() {
        //11112233444445aaabccccgeee@$$###
        this.noOfSocks = 32;
        this.socksColors = "11112233444445aaabccccgeee@$$###";
        assertEquals(12, new SalesByMatchImpl().sockMerchant(this.noOfSocks, this.socksColors));
    }
}