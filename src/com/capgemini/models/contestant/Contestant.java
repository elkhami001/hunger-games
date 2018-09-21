package com.capgemini.models.contestant;

public class Contestant {
    private int health;
    private int luck;
    private int attack;
    private int defense;
    private Gender contestantGender;
    private ParticipantType contestantType;


    public Gender getContestantGender() {
        return contestantGender;
    }

    public void setContestantGender(Gender contestantGender) {
        this.contestantGender = contestantGender;
    }

    public ParticipantType getContestantType() {
        return contestantType;
    }

    public void setContestantType(ParticipantType contestantType) {
        this.contestantType = contestantType;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
