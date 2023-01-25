package com.factoriaf5.kata;

public class Character {
    int initHealth = 1000;
    int initLevel = 1;
    boolean alive = true;
    int damage = 50 ;
    int capacityHealth = 100;
    

    public Character(int initHealth, int initLevel, boolean alive, int damage, int capacityHealth) {
        this.initHealth = initHealth;
        this.initLevel = initLevel;
        this.alive = alive;
        this.damage = damage;
        this.capacityHealth = capacityHealth;
    }



    public int getInitHealth() {
        return initHealth;
    }


    public void setInitHealth(int initHealth) {
        this.initHealth = initHealth;
    }


    public int getInitLevel() {
        return initLevel;
    }


    public void setInitLevel(int initLevel) {
        this.initLevel = initLevel;
    }


    public boolean isAlive() {
        return alive;
    }


    public void setAlive(boolean alive) {
        this.alive = alive;
    }


    public int getDamage() {
        return damage;
    }


    public void setDamage(int damage) {
        this.damage = damage;
    }


    public int getCapacityHealth() {
        return capacityHealth;
    }


    public void setCapacityHealth(int capacityHealth) {
        this.capacityHealth = capacityHealth;
    }

    
    public void attackCharacter(Character character) {
        if character
        
    }


}


