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
class MediumLevelCards extends Card {

    public MediumLevelCards(Card card) {
        super(card);
    }

    public static final Card[] MEDIUMLEVEL_CARDS = new Card[]{
        new Card("GW", "Goblin Warrior", 6, 3, 2),
        new Card("TS", "Toxic Slime", 5, 2, 5),
        new Card("GR", "Giant Rat", 3, 2, 1),
        new Card("WW", "Werewolf", 7, 5, 3),
        new Card("SK", "Skeleton Knight", 6, 3, 5),
        new Card("ZB", "Zombie Brute", 8, 2, 7),
        new Card("VS", "Venomous Spider", 4, 2, 3),
        new Card("BB", "Grizzly Bear", 9, 5, 5)
    };

    public static ArrayList<Card> getMediumLevelDeck() {
        ArrayList<Card> starterDeck = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            for (Card card : MEDIUMLEVEL_CARDS) {
                starterDeck.add(new Card(card));
            }
        }
        return starterDeck;
    }
}
