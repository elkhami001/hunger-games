package com.capgemini;

import com.capgemini.controllers.Arena;
import com.capgemini.models.contestant.Contestant;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Arena arena = new Arena();
        List<Contestant> contestantsList = new ArrayList<>();
        contestantsList = arena.getContestantList();

        //int i = 1;
        //for (Contestant contestant: contestantsList) {
        //       System.out.println("Contestant " + i);
        //        i++;
        //}
    }
}

