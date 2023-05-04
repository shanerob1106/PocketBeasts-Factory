/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

import java.util.ArrayList;

/**
 *
 * @author shane
 */
public interface DeckInterface {
    ArrayList<Card> getCards();
    Card getCard(int index);
    void add(Card card);
    void remove(Card card);
    void removeAll(ArrayList<Card> cards);
    int count();
}
