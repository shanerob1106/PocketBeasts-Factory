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
    
    public ArrayList<Card> getCards(int level) {
        // Creates a set of cards based on the players 'level'
        // Default Level is 1 (Overriding james to Level +10 || +20) 
        if (level >= 1) {
            return LowLevelCards.getLowLevelDeck();
            
        } else if (level >= 10) {
            return MediumLevelCards.getMediumLevelDeck();
            
        } else if (level >= 20) {
            return HighLevelCards.getHighLevelDeck();
            
        } else {
            System.out.println("Error getting player levels");
             return LowLevelCards.getLowLevelDeck();
        }
        //return LowLevelCards.getLowLevelDeck();
    }
}

// public class StarterCardFactory {
//     private ArrayList<Card> cards;

//     public StarterCardFactory() {
//         this.cards = new ArrayList<>();
//     }

//     public ArrayList<Card> getCards(Player player) {
//         // Creates a set of cards based on the player's level
//         if (player.getLevel() >= 1) {
//             return cards = LowLevelCards.getLowLevelDeck();
//         } else if (player.getLevel() >= 10) {
//             return cards = MediumLevelCards.getMediumLevelDeck();
//         } else if (player.getLevel() >= 20) {
//             return cards = HighLevelCards.getHighLevelDeck();
//         } else {
//             System.out.println("Error getting player levels");
//         }
//         return cards = LowLevelCards.getLowLevelDeck();
//     }
// }
