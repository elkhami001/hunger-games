package com.capgemini.controllers;

import com.capgemini.models.contestant.*;
import com.capgemini.controllers.factory.ContestantFactory;

import java.util.ArrayList;
import java.util.List;

public class Arena {
    static final int PARTICIPANTS = 24;
    static final int CAREER_PARTICIPANTS = 4;
    static final int MALE_TO_FEMALE = 1;

    List<Contestant> contestantList = new ArrayList<>();
    List<District> districtList = new ArrayList<>();
    List<Career> careerList = new ArrayList<>();

    public Arena(){
        initialize();
        System.out.println("\nTHE FIGHT FOR SURVIVAL HAS STARTED");
        printCurrentParticipants();
    }

    public void initialize(){
        for(int i = 0; i <= PARTICIPANTS; i++){
            createPlayer();
        }
    }

    public void createPlayer(){
        Contestant contestant = null;
        Gender GENDER = genderToBeCreated();
        ParticipantType PARTICIPANT_TYPE = contestantTypeToBeCreated();

        ContestantFactory contestantFactory = new ContestantFactory();
        contestant = contestantFactory.makeContestant(PARTICIPANT_TYPE, GENDER);
        addPlayerToList(contestant);
        contestantList.add(contestant);
    }
    public void addPlayerToList(Contestant contestant){
        if(contestant.getContestantType() == ParticipantType.DISTRICT){
            districtList.add((District)contestant);
        }else if(contestant.getContestantType() == ParticipantType.CAREER){
            careerList.add((Career)contestant);
        }else {
            System.out.println("CAN NOT ADD CONTESTANT TO LIST UNKNOWN PARTICIPANT TYPE!");
        }
    }

    public ParticipantType contestantTypeToBeCreated(){
        int district = 0;
        int career = 0;
        if(contestantList.size() == 0){
            return ParticipantType.DISTRICT; //TODO RETURN RANDOM PARTICIPANTTYPE
        }else{
            for (Contestant contestant : contestantList) {
                if(contestant.getContestantType() == ParticipantType.DISTRICT){
                    district++;
                }else if(contestant.getContestantType() == ParticipantType.CAREER){
                    career++;
                }else{
                    System.out.println("PARTICIPANT TYPE UNKNOWN"); //TODO IMPLEMENT CATCH
                    return null;
                }
            }
            if(district <= career*CAREER_PARTICIPANTS){
                return ParticipantType.DISTRICT;
            }else return ParticipantType.CAREER;
        }
    }

    public Gender genderToBeCreated(){
        int male = 0;
        int female = 0;

        if(contestantList.size() == 0){
            return Gender.MALE; //TODO RETURN RANDOM GENDER
        }else{
            for (Contestant contestant : contestantList) {
                if(contestant.getContestantGender() == Gender.MALE){
                    male++;
                }else if(contestant.getContestantGender() == Gender.FEMALE){
                    female++;
                }else{
                    System.out.println("GENDER TYPE UNKNOWN"); //TODO IMPLEMENT CATCH
                    return null;
                }
            }
            if(male <= female*MALE_TO_FEMALE){
                return Gender.FEMALE;
            }else return Gender.MALE;
        }
    }

    public void printCurrentParticipants(){
        System.out.println("\nTotal contestants: " + contestantList.size()
                +"\nDistrict contestants: "  + districtList.size()
                +"\nCareer contestants: " + careerList.size());
    }

    public List<Contestant> getContestantList(){
        return contestantList;
    }
}
