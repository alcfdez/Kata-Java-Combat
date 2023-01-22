package com.factoriaf5.kata;

public class Character {
    int initHealth = 1000;
    int initLevel = 1;
    boolean alive = true;
}

public Character(){
    this.initHealth = initHealth;
    this.initLevel = initLevel;
    this.alive = alive;
}

public int getInitHealth() {
    return initHealth;
}

public int getInitLevel() {
    return initLevel;
}

public boolean isAlive() {
    return alive;
}
    

