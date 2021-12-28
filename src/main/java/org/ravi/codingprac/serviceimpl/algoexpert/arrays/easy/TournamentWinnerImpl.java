package org.ravi.codingprac.serviceimpl.algoexpert.arrays.easy;

import org.ravi.codingprac.service.algoexpert.arrays.easy.TournamentWinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinnerImpl implements TournamentWinner {
    @Override
    public String winnerOfTheTournament1(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        //[homeTeam, awayTeam]
        //0 - awayTeam wins
        //1 - homeTeam wins
        int winningPoints = 3;
        String tournamentWinner = null;
        Map<String, Integer> scorecard = new HashMap<String, Integer>();
        int previousHighScore = 0;
        for (int i = 0; i < results.size(); i++) {
            if (0 == results.get(i)) {
                if (scorecard.containsKey(competitions.get(i).get(1))) {
                    scorecard.put(competitions.get(i).get(1), scorecard.get(competitions.get(i).get(1)) + winningPoints);
                } else {
                    scorecard.put(competitions.get(i).get(1), winningPoints);
                }
                if (scorecard.get(competitions.get(i).get(1)) > previousHighScore) {
                    previousHighScore = scorecard.get(competitions.get(i).get(1));
                    tournamentWinner = competitions.get(i).get(1);
                }
            } else if (1 == results.get(i)) {
                if (scorecard.containsKey(competitions.get(i).get(0))) {
                    scorecard.put(competitions.get(i).get(0), scorecard.get(competitions.get(i).get(0)) + winningPoints);
                } else {
                    scorecard.put(competitions.get(i).get(0), winningPoints);
                }
                if (scorecard.get(competitions.get(i).get(0)) > previousHighScore) {
                    previousHighScore = scorecard.get(competitions.get(i).get(0));
                    tournamentWinner = competitions.get(i).get(0);
                }
            }
        }
        return tournamentWinner;
    }

    @Override
    public String winnerOfTheTournament2(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) { return null; }

    @Override
    public String winnerOfTheTournament3(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) { return null; }
}