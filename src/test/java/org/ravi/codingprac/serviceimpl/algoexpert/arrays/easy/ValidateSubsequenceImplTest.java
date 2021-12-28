package org.ravi.codingprac.serviceimpl.algoexpert.arrays.easy;

import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class ValidateSubsequenceImplTest {

    @Test
    public void testSolution1() {
        int[] inputArray;
        int[] subSequence;
        int testCaseNumber = 0;
        boolean expectedResult;
        try {
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(new FileReader("D:\\Projects\\Intellij\\codingprac\\src\\main\\resources\\testcases\\ValidateSubsequence.json"));
            JSONArray inputData = (JSONArray) jsonObject.get("data");
            for (Object inputDataObject : inputData) {
                ++testCaseNumber;
                JSONObject testCaseData = (JSONObject) new JSONParser().parse(inputDataObject.toString());
                JSONArray inputjsonArray = (JSONArray) testCaseData.get("array");
                JSONArray subSequenceJson = (JSONArray) testCaseData.get("sequence");
                expectedResult = Boolean.parseBoolean(testCaseData.get("expected").toString());
                inputArray = new int[inputjsonArray.size()];
                subSequence = new int[subSequenceJson.size()];
                for (int i = 0; i < inputjsonArray.size(); i++) {
                    inputArray[i] = Integer.parseInt(inputjsonArray.get(i).toString());
                }
                for (int i = 0; i < subSequenceJson.size(); i++) {
                    subSequence[i] = Integer.parseInt(subSequenceJson.get(i).toString());
                }
                assertEquals(expectedResult,
                        new ValidateSubsequenceImpl().isValidSubsequence1(Arrays.stream(inputArray).boxed().collect(Collectors.toList()),
                                Arrays.stream(subSequence).boxed().collect(Collectors.toList())),
                        "Test Case: " + testCaseNumber + " failed.");
            }
        } catch (Exception exception) {
            log.error("Exception while running test case " + testCaseNumber + " for " + ValidateSubsequenceImpl.class);
            exception.printStackTrace();
        }
    }

    @Test
    public void testSolution2() {
        int[] inputArray;
        int[] subSequence;
        int testCaseNumber = 0;
        boolean expectedResult;
        try {
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(new FileReader("D:\\Projects\\Intellij\\codingprac\\src\\main\\resources\\testcases\\ValidateSubsequence.json"));
            JSONArray inputData = (JSONArray) jsonObject.get("data");
            for (Object inputDataObject : inputData) {
                ++testCaseNumber;
                JSONObject testCaseData = (JSONObject) new JSONParser().parse(inputDataObject.toString());
                JSONArray inputjsonArray = (JSONArray) testCaseData.get("array");
                JSONArray subSequenceJson = (JSONArray) testCaseData.get("sequence");
                expectedResult = Boolean.parseBoolean(testCaseData.get("expected").toString());
                inputArray = new int[inputjsonArray.size()];
                subSequence = new int[subSequenceJson.size()];
                for (int i = 0; i < inputjsonArray.size(); i++) {
                    inputArray[i] = Integer.parseInt(inputjsonArray.get(i).toString());
                }
                for (int i = 0; i < subSequenceJson.size(); i++) {
                    subSequence[i] = Integer.parseInt(subSequenceJson.get(i).toString());
                }
                assertEquals(expectedResult,
                        new ValidateSubsequenceImpl().isValidSubsequence2(Arrays.stream(inputArray).boxed().collect(Collectors.toList()),
                                Arrays.stream(subSequence).boxed().collect(Collectors.toList())),
                        "Test Case: " + testCaseNumber + " failed.");
            }
        } catch (Exception exception) {
            log.error("Exception while running test case " + testCaseNumber + " for " + ValidateSubsequenceImpl.class);
            exception.printStackTrace();
        }
    }

    @Test
    public void testSolution3() {
        int[] inputArray;
        int[] subSequence;
        int testCaseNumber = 0;
        boolean expectedResult;
        try {
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(new FileReader("D:\\Projects\\Intellij\\codingprac\\src\\main\\resources\\testcases\\ValidateSubsequence.json"));
            JSONArray inputData = (JSONArray) jsonObject.get("data");
            for (Object inputDataObject : inputData) {
                ++testCaseNumber;
                JSONObject testCaseData = (JSONObject) new JSONParser().parse(inputDataObject.toString());
                JSONArray inputjsonArray = (JSONArray) testCaseData.get("array");
                JSONArray subSequenceJson = (JSONArray) testCaseData.get("sequence");
                expectedResult = Boolean.parseBoolean(testCaseData.get("expected").toString());
                inputArray = new int[inputjsonArray.size()];
                subSequence = new int[subSequenceJson.size()];
                for (int i = 0; i < inputjsonArray.size(); i++) {
                    inputArray[i] = Integer.parseInt(inputjsonArray.get(i).toString());
                }
                for (int i = 0; i < subSequenceJson.size(); i++) {
                    subSequence[i] = Integer.parseInt(subSequenceJson.get(i).toString());
                }
                assertEquals(expectedResult,
                        new ValidateSubsequenceImpl().isValidSubsequence3(Arrays.stream(inputArray).boxed().collect(Collectors.toList()),
                                Arrays.stream(subSequence).boxed().collect(Collectors.toList())),
                        "Test Case: " + testCaseNumber + " failed.");
            }
        } catch (Exception exception) {
            log.error("Exception while running test case " + testCaseNumber + " for " + ValidateSubsequenceImpl.class);
            exception.printStackTrace();
        }
    }

    @Test
    public void testSolution4() {
        int[] inputArray;
        int[] subSequence;
        int testCaseNumber = 0;
        boolean expectedResult;
        try {
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(new FileReader("D:\\Projects\\Intellij\\codingprac\\src\\main\\resources\\testcases\\ValidateSubsequence.json"));
            JSONArray inputData = (JSONArray) jsonObject.get("data");
            for (Object inputDataObject : inputData) {
                ++testCaseNumber;
                JSONObject testCaseData = (JSONObject) new JSONParser().parse(inputDataObject.toString());
                JSONArray inputjsonArray = (JSONArray) testCaseData.get("array");
                JSONArray subSequenceJson = (JSONArray) testCaseData.get("sequence");
                expectedResult = Boolean.parseBoolean(testCaseData.get("expected").toString());
                inputArray = new int[inputjsonArray.size()];
                subSequence = new int[subSequenceJson.size()];
                for (int i = 0; i < inputjsonArray.size(); i++) {
                    inputArray[i] = Integer.parseInt(inputjsonArray.get(i).toString());
                }
                for (int i = 0; i < subSequenceJson.size(); i++) {
                    subSequence[i] = Integer.parseInt(subSequenceJson.get(i).toString());
                }
                assertEquals(expectedResult,
                        new ValidateSubsequenceImpl().isValidSubsequence4(Arrays.stream(inputArray).boxed().collect(Collectors.toList()),
                                Arrays.stream(subSequence).boxed().collect(Collectors.toList())),
                        "Test Case: " + testCaseNumber + " failed.");
            }
        } catch (Exception exception) {
            log.error("Exception while running test case " + testCaseNumber + " for " + ValidateSubsequenceImpl.class);
            exception.printStackTrace();
        }
    }

    @Test
    public void testSolution5() {
        int[] inputArray;
        int[] subSequence;
        int testCaseNumber = 0;
        boolean expectedResult;
        try {
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(new FileReader("D:\\Projects\\Intellij\\codingprac\\src\\main\\resources\\testcases\\ValidateSubsequence.json"));
            JSONArray inputData = (JSONArray) jsonObject.get("data");
            for (Object inputDataObject : inputData) {
                ++testCaseNumber;
                JSONObject testCaseData = (JSONObject) new JSONParser().parse(inputDataObject.toString());
                JSONArray inputjsonArray = (JSONArray) testCaseData.get("array");
                JSONArray subSequenceJson = (JSONArray) testCaseData.get("sequence");
                expectedResult = Boolean.parseBoolean(testCaseData.get("expected").toString());
                inputArray = new int[inputjsonArray.size()];
                subSequence = new int[subSequenceJson.size()];
                for (int i = 0; i < inputjsonArray.size(); i++) {
                    inputArray[i] = Integer.parseInt(inputjsonArray.get(i).toString());
                }
                for (int i = 0; i < subSequenceJson.size(); i++) {
                    subSequence[i] = Integer.parseInt(subSequenceJson.get(i).toString());
                }
                assertEquals(expectedResult,
                        new ValidateSubsequenceImpl().isValidSubsequence5(Arrays.stream(inputArray).boxed().collect(Collectors.toList()),
                                Arrays.stream(subSequence).boxed().collect(Collectors.toList())),
                        "Test Case: " + testCaseNumber + " failed.");
            }
        } catch (Exception exception) {
            log.error("Exception while running test case " + testCaseNumber + " for " + ValidateSubsequenceImpl.class);
            exception.printStackTrace();
        }
    }
}