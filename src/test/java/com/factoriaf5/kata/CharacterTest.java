package com.factoriaf5.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterTest {
    @Test
    public void character_init() {
        Character myCharacter = new Character ();
assertEquals(myCharacter.initHealth, 1000);
assertEquals(myCharacter.initLevel, 1);     
assertEquals(myCharacter.alive,true);
        
    }

    @Test
    public void character_Damage_rest_Health() {
        Character firstCharacter = new Character ();
        Character secondCharacter = new Character ();
        firstCharacter.attackCharacter(secondCharacter);
        assertEquals(), null);
        
    }


    
}
