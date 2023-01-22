package com.factoriaf5.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterTest {
    @Test
    public void character_have_1000_health_level_1_and_is_alive() {
        Character myCharacter = new Character ();
assertEquals(myCharacter.initHealth, 1000);
assertEquals(myCharacter.initLevel, 1);     assertEquals(myCharacter.alive,true)
        
    }

}
