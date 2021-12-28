package org.ravi.codingprac.serviceimpl.algoexpert.arrays.easy;

import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class TournamentWinnerImplTest {

    @Test
    public void testSolution1() {
        int testCaseNumber = 0;
        ArrayList<ArrayList<String>> competitions;
        ArrayList<Integer> results;
        String expectedOutput;

        try {
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(new FileReader("D:\\Projects\\Intellij\\codingprac\\src\\main\\resources\\testcases\\TournamentWinner.json"));
            JSONArray inputData = (JSONArray) jsonObject.get("data");
            for (Object inputDataObject : inputData) {
                ++testCaseNumber;
                competitions = new ArrayList<ArrayList<String>>();
                results = new ArrayList<Integer>();
                JSONObject testCaseData = (JSONObject) new JSONParser().parse(inputDataObject.toString());
                JSONArray competitionsJsonArray = (JSONArray) testCaseData.get("competitions");
                JSONArray resultsJsonArray = (JSONArray) testCaseData.get("results");
                expectedOutput = testCaseData.get("expectedOutput").toString();
                for (int i = 0; i < competitionsJsonArray.size(); i++) {
                    competitions.add((ArrayList<String>) competitionsJsonArray.get(i));
                    results.add(Integer.parseInt(resultsJsonArray.get(i).toString()));
                }
                /*log.debug("Test Case: " + testCaseNumber);
                log.debug("Competitions: " + competitions.toString() + ", results: " + results.toString() + ", expected: " + expectedOutput);*/
                assertEquals(expectedOutput, new TournamentWinnerImpl().winnerOfTheTournament1(competitions, results), "Test Case: " + testCaseNumber + " failed.");
            }
        } catch (Exception exception) {
            log.error("Exception while running test case " + testCaseNumber + " for " + TournamentWinnerImpl.class);
            exception.printStackTrace();
        }
    }
}