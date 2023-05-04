/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

import java.util.ArrayList;

/**
 *
 * @author shane
 */
public class StarterCardFactory {
    
    Player player;
    private ArrayList<Card> cards;
    
    public StarterCardFactory() {
        this.cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        
        // Creates a set of cards based on the players 'level'
        // Default Level is 1 (Overriding james to Level +10 || +20) 
        if (player.getLevel() >= 1) {
            cards = LowLevelCards.getLowLevelDeck();

        } else if (player.getLevel() >= 10) {
            cards = MediumLevelCards.getMediumLevelDeck();

        } else if (player.getLevel() >= 20) {
            cards = HighLevelCards.getHighLevelDeck();
        } else {
            System.out.println("Error getting player levels");
        }
        return null;
    }
}
