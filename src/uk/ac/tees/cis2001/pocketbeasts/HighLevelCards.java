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
class HighLevelCards extends Card {

    public HighLevelCards(Card card) {
        super(card);
    }

    public static final Card[] HIGHLEVEL_CARDS = new Card[]{
        new Card("GA", "Goblin Archer", 7, 2, 3),
        new Card("AS", "Acidic Slime", 6, 3, 6),
        new Card("PR", "Pack Rat", 4, 3, 1),
        new Card("DW", "Dire Wolf", 8, 6, 3),
        new Card("SW", "Skeleton Warrior", 7, 4, 5),
        new Card("ZH", "Zombie Horde", 10, 1, 8),
        new Card("TS", "Trapdoor Spider", 5, 2, 4),
        new Card("PB", "Polar Bear", 11, 6, 6)
    };

    public static ArrayList<Card> getHighLevelDeck() {
        ArrayList<Card> starterDeck = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            for (Card card : HIGHLEVEL_CARDS) {
                starterDeck.add(new Card(card));
            }
        }
        return starterDeck;
    }
}
