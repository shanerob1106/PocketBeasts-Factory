/*
 * This file is part of PocketBeasts.
 *
 * PocketBeasts is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PocketBeasts is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <https://www.gnu.org/licenses/>.
 */
package uk.ac.tees.cis2001.pocketbeasts;

import java.util.ArrayList;

/**
 *
 * @author James Fairbairn
 * @author Steven Mead
 */
public class InPlay {
    
    private final ArrayList<Card> cards;

    public InPlay() {
        this.cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
    
    public Card getCard(int index) {
        return cards.get(index);
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public void remove(Card card) {
        this.cards.remove(card);
    }
    
    public void removeAll(ArrayList<Card> cards) {
        this.cards.removeAll(cards);
    }
    
    public int count() {
        return this.cards.size();
    }
}
