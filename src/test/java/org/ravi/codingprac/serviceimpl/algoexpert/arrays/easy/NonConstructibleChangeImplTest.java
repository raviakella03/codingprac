package org.ravi.codingprac.serviceimpl.algoexpert.arrays.easy;

import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.Test;

import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@Slf4j
class NonConstructibleChangeImplTest {

    @Test
    public void testsSolution1() {
        int testCaseNumber = 0;
        try {
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(new FileReader("D:\\Projects\\Intellij\\codingprac\\src\\main\\resources\\testcases\\NonConstructibleChange.json"));
            JSONArray inputData = (JSONArray) jsonObject.get("data");
            for (Object inputDataObject : inputData) {
                ++testCaseNumber;
                JSONObject inputDataJsonObject = (JSONObject) new JSONParser().parse(inputDataObject.toString());
                JSONArray coinsJsonArray = (JSONArray) inputDataJsonObject.get("coins");
                int[] coins = new int[coinsJsonArray.size()];
                for (int i = 0; i < coinsJsonArray.size(); i++) {
                    coins[i] = Integer.parseInt(coinsJsonArray.get(i).toString());
                }
                int expectedOutput = Integer.parseInt(inputDataJsonObject.get("expectedOutput").toString());
                assertEquals(expectedOutput, new NonConstructibleChangeImpl().calculateMinNonConstructible1(coins), "Test Case: " + testCaseNumber + " failed.");
            }
        } catch (Exception exception) {
//            log.error("Exception while running test case " + testCaseNumber + " for " + NonConstructibleChangeImpl.class);
            exception.printStackTrace();
            fail("Exception while running test case " + testCaseNumber + " for " + NonConstructibleChangeImpl.class);
        }
    }

}