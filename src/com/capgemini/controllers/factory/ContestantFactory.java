package com.capgemini.controllers.factory;

import com.capgemini.models.contestant.*;

public class ContestantFactory {

    public Contestant makeContestant(ParticipantType TYPE){
        if(TYPE==ParticipantType.CONTESTANT){
            Contestant contestant = new Contestant();
            System.out.println("CONTESTANT created!");
            return contestant;
        }else
        if(TYPE==ParticipantType.DISTRICT){
            District district = new District();
            System.out.println("DISTRICT contestant created!");
            return district;
            }else
        if(TYPE==ParticipantType.CAREER){
            Career career = new Career();
            System.out.println("CAREER contestant created!");
            return career;
        }else{
            System.out.println("UNKNOWN contestant type!");
            return null;
        }
    }
}
