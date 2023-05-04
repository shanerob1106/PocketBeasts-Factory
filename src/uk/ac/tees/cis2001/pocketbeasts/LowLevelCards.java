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

    public static final Card[] LOWLEVEL_CARDS = new Card[]{
        new Card("LL", "LowLevel", 10, 10, 10),
        new Card("LL", "2", 10, 10, 10)
    };

    public LowLevelCards(String id, String name, int manaCost, int attack, int health) {
        super(id, name, manaCost, attack, health);
    }

    public static ArrayList<Card> getLowLevelDeck() {
        ArrayList<Card> starterDeck = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            for (Card card : LOWLEVEL_CARDS) {
                starterDeck.add(new Card(card));
            }
        }

        return starterDeck;
    }

    public LowLevelCards(Card card) {
        super(card);
    }
}
