package com.capgemini.models.contestant;

public class Contestant {
    private int health;
    private int luck;
    private int attack;
    private int defense;

    public Gender getGENDER() {
        return GENDER;
    }

    public void setGENDER(Gender GENDER) {
        this.GENDER = GENDER;
    }

    public ParticipantType getTYPE() {
        return TYPE;
    }

    public void setTYPE(ParticipantType TYPE) {
        this.TYPE = TYPE;
    }

    private Gender GENDER;
    private ParticipantType TYPE;

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
