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
public class LowLevelCards extends Card {

    public LowLevelCards(Card card) {
        super(card);
    }

    public static final Card[] LOWLEVEL_CARDS = new Card[]{
    new Card("GB", "Goblin", 5, 2, 2),
    new Card("SM", "Slime", 3, 1, 3),
    new Card("RT", "Rat", 2, 1, 1),
    new Card("WF", "Wolf", 4, 3, 2),
    new Card("SK", "Skeleton", 5, 2, 4),
    new Card("ZB", "Zombie", 6, 1, 5),
    new Card("SP", "Spider", 3, 1, 2),
    new Card("BR", "Bear", 7, 4, 4)
    };

    public static ArrayList<Card> getLowLevelDeck() {
        ArrayList<Card> starterDeck = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            for (Card card : LOWLEVEL_CARDS) {
                starterDeck.add(new Card(card));
            }
        }
        return starterDeck;
    }
}
