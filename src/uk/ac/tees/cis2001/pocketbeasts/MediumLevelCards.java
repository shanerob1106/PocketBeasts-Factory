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

    public static final Card[] MEDIUMLEVEL_CARDS = new Card[]{
        new Card("ML", "MediumLevelCard1", 20, 20, 20),
        new Card("ML", "MediumLevelCard2", 21, 21, 21)
    };

    public MediumLevelCards(String id, String name, int manaCost, int attack, int health) {
        super(id, name, manaCost, attack, health);
    }

    public static ArrayList<Card> getMediumLevelDeck() {
        ArrayList<Card> starterDeck = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            for (Card card : MEDIUMLEVEL_CARDS) {
                starterDeck.add(new Card(card));
            }
        }

        return starterDeck;
    }

    public MediumLevelCards(Card card) {
        super(card);
    }
}
