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
public abstract class AbstractDeck implements DeckInterface {
    
    protected final ArrayList<Card> cards;

    public AbstractDeck() {
        this.cards = new ArrayList<>();
    }
    
    public AbstractDeck(ArrayList<Card> cards){
        this.cards = cards;
    }
        
    @Override
    public ArrayList<Card> getCards(){
        return cards;
    }
    
    @Override
    public Card getCard(int index){
        return cards.get(index);
    }
    
    @Override
    public void add(Card card){
        this.cards.add(card);
    }
    
    @Override
    public void remove(Card card){
        this.cards.remove(card);
    }
    
    @Override
    public void removeAll(ArrayList<Card> cards){
        this.cards.removeAll(cards);
    }
    
    @Override
    public int count(){
        return this.cards.size();
    }   
}