/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

/**
 *
 * @author shane
 */
public class StarterCardFactory {
    
    private Card card = null;
    private Player player;
    
    public Card getCard(){
        player = null;
        
        // Creates a set of cards based on the players 'level'
        // Default Level is 1 (Overriding james to Level +10 or +20) 
        if(player.getLevel() <= 1){
            card = new LowLevelCards();
            
        } else if (player.getLevel() >= 10) {
            card = new MediumLevelCards();
            
        } else {
            card = new HighLevelCards();
        }
        return card;
    }
}
