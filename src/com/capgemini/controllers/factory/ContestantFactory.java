package com.capgemini.controllers.factory;

import com.capgemini.models.contestant.*;

public class ContestantFactory {

    public Contestant makeContestant(ParticipantType participantType, Gender gender){
        if(participantType==ParticipantType.CONTESTANT){
            Contestant contestant = new Contestant();
            System.out.println("CONTESTANT created!");
            contestant.setContestantType(participantType);
            contestant.setContestantGender(gender);
            return contestant;
        }else
        if(participantType==ParticipantType.DISTRICT){
            District district = new District();
            System.out.println("DISTRICT contestant created!");
            district.setContestantType(participantType);
            district.setContestantGender(gender);
            return district;
            }else
        if(participantType==ParticipantType.CAREER){
            Career career = new Career();
            System.out.println("CAREER contestant created!");
            career.setContestantType(participantType);
            career.setContestantGender(gender);
            return career;
        }else{
            System.out.println("UNKNOWN contestant type!");
            return null;
        }
    }
}
