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
    
    private ArrayList<Card> cards;
    private Player player;
            
    public StarterCardFactory(Player player) {
        this.cards = new ArrayList<>();
        this.player = player;
    }

    public ArrayList<Card> getCards() {
        // Creates a set of cards based on the players 'level'
        // Default Level is 1 (Overriding james to Level +10 || +20) 
        if (player.getLevel() >= 1) {
            return cards = LowLevelCards.getLowLevelDeck();
            
        } else if (player.getLevel() >= 10) {
            return cards = MediumLevelCards.getMediumLevelDeck();
            
        } else if (player.getLevel() >= 20) {
            return cards = HighLevelCards.getHighLevelDeck();
            
        } else {
            System.out.println("Error getting player levels");
            // return cards = LowLevelCards.getLowLevelDeck();
        }
        return cards = LowLevelCards.getLowLevelDeck();
    }
}
