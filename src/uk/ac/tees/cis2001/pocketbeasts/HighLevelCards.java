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

    public static final Card[] STARTER_CARDS = new Card[]{
        new Card("HL", "HighLevelCard1", 30, 30, 30),
        new Card("HL", "HighLevelCard2", 31, 31, 31)
    };

//    public HighLevelCards(String id, String name, int manaCost, int attack, int health) {
//        super(id, name, manaCost, attack, health);
//    }

    public static ArrayList<Card> getHighLevelDeck() {
        ArrayList<Card> starterDeck = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            for (Card card : STARTER_CARDS) {
                starterDeck.add(new Card(card));
            }
        }

        return starterDeck;
    }

    public HighLevelCards(Card card) {
        super(card);
    }
}
