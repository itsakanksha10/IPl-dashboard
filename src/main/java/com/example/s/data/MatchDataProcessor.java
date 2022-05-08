
package com.example.s.data;

import com.example.s.model.Match;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class MatchDataProcessor implements ItemProcessor<MatchInput, Match> {

    private static final Logger log = LoggerFactory.getLogger(MatchDataProcessor.class);

    @Override
    public Match process(final MatchInput matchInputObj) throws Exception {

        Match matchObj = new Match();

        matchObj.setId(Long.parseLong(matchInputObj.getId()));
        matchObj.setCity(matchInputObj.getCity());
        matchObj.setDate(matchInputObj.getDate());
        matchObj.setPlayerOfMatch(matchInputObj.getPlayer_of_match());
        matchObj.setVenue(matchInputObj.getVenue());
        matchObj.setTeam1(matchInputObj.getTeam1());
        matchObj.setTeam2(matchInputObj.getTeam2());
        matchObj.setMatchWinner(matchInputObj.getWinner());
        matchObj.setTossWinner(matchInputObj.getToss_winner());
        matchObj.setTossDecision(matchInputObj.getToss_decision());
        matchObj.setResult(matchInputObj.getResult());
        matchObj.setResultMargin(matchInputObj.getResult_margin());
        matchObj.setUmpire1(matchInputObj.getUmpire1());
        matchObj.setUmpire2(matchInputObj.getUmpire2());

        return matchObj;
    }

    public static Logger getLog() {
        return log;
    }

}
