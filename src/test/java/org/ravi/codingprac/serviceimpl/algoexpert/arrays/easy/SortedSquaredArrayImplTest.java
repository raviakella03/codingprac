package org.ravi.codingprac.serviceimpl.algoexpert.arrays.easy;

import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.Test;

import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class SortedSquaredArrayImplTest {

    @Test
    public void testSolution1() {
        int testCaseNumber = 0;

        try {
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(new FileReader("D:\\Projects\\Intellij\\codingprac\\src\\main\\resources\\testcases\\SortedSquaredArray.json"));
            JSONArray inputData = (JSONArray) jsonObject.get("data");
            for (Object inputDataObject : inputData) {
                ++testCaseNumber;
                JSONObject testCaseDataObject = (JSONObject) new JSONParser().parse(inputDataObject.toString());
                JSONArray inputJSONArray = (JSONArray) testCaseDataObject.get("array");
                JSONArray expectedJSONArray = (JSONArray) testCaseDataObject.get("expectedOutput");
                int[] inputArray = new int[inputJSONArray.size()];
                int[] expectedOutput = new int[expectedJSONArray.size()];
                for (int i = 0; i < inputJSONArray.size(); i++) {
                    inputArray[i] = Integer.parseInt(inputJSONArray.get(i).toString());
                }
                for (int i = 0; i < inputJSONArray.size(); i++) {
                    expectedOutput[i] = Integer.parseInt(expectedJSONArray.get(i).toString());
                }
                int[] actualOutput = new SortedSquaredArrayImpl().squaredSortedArray1(inputArray);
                assertEquals(expectedOutput.length, actualOutput.length);
                for (int i = 0; i < actualOutput.length; i++) {
                    assertEquals(expectedOutput[i], actualOutput[i]);
                }
            }
        } catch (Exception exception) {
            log.error("Exception while running test case " + testCaseNumber + " for " + SortedSquaredArrayImpl.class);
            exception.printStackTrace();
        }
    }

    @Test
    public void testSolution2() {
        int testCaseNumber = 0;
        try {
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(new FileReader("D:\\Projects\\Intellij\\codingprac\\src\\main\\resources\\testcases\\SortedSquaredArray.json"));
            JSONArray inputData = (JSONArray) jsonObject.get("data");
            for (Object inputDataObject : inputData) {
                ++testCaseNumber;
                JSONObject testCaseDataObject = (JSONObject) new JSONParser().parse(inputDataObject.toString());
                JSONArray inputJSONArray = (JSONArray) testCaseDataObject.get("array");
                JSONArray expectedJSONArray = (JSONArray) testCaseDataObject.get("expectedOutput");
                int[] inputArray = new int[inputJSONArray.size()];
                int[] expectedOutput = new int[expectedJSONArray.size()];
                for (int i = 0; i < inputJSONArray.size(); i++) {
                    inputArray[i] = Integer.parseInt(inputJSONArray.get(i).toString());
                }
                for (int i = 0; i < inputJSONArray.size(); i++) {
                    expectedOutput[i] = Integer.parseInt(expectedJSONArray.get(i).toString());
                }
                int[] actualOutput = new SortedSquaredArrayImpl().squaredSortedArray2(inputArray);
                assertEquals(expectedOutput.length, actualOutput.length, "Test Case: " + testCaseNumber + " failed. Length doesn't match.");
                for (int i = 0; i < actualOutput.length; i++) {
                    assertEquals(expectedOutput[i], actualOutput[i], "Test Case: " + testCaseNumber + " failed. Array values doesn't match.");
                }
            }
        } catch (Exception exception) {
            log.error("Exception while running test case " + testCaseNumber + " for " + SortedSquaredArrayImpl.class);
            exception.printStackTrace();
        }
    }
}