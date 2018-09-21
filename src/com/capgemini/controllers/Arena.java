package com.capgemini.controllers;

import com.capgemini.Main;
import com.capgemini.models.contestant.Contestant;
import com.capgemini.controllers.factory.ContestantFactory;
import com.capgemini.models.contestant.ParticipantType;

import java.util.ArrayList;
import java.util.List;

public class Arena {
    static final int PARTICIPANTS = 24;
    List<Contestant> contestantList = new ArrayList<>();

    public Arena(){
        initialize();
    }

    public void initialize(){
        boolean career = false;
        for(int i = 0; i <= PARTICIPANTS; i++){
            int careerParticipant = (i % 4);
            if(careerParticipant == 0){
                career = true;
            }
            if(career){
                createPlayer(ParticipantType.CAREER);
                career = false;
            }else { createPlayer(ParticipantType.DISTRICT); }
        }
    }

    public void createPlayer(ParticipantType PARTICIPANT_TYPE){
        Contestant contestant = null;
        ContestantFactory contestantFactory = new ContestantFactory();
        contestant = contestantFactory.makeContestant(PARTICIPANT_TYPE);
        contestantList.add(contestant);
    }

    public List<Contestant> getContestantList(){
        return contestantList;
    }
}
