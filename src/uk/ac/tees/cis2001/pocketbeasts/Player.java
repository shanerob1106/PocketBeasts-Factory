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

/**
 *
 * @author James Fairbairn
 * @author Steven Mead
 */
public class Player {
    
    private final int MAX_MANA = 9;
    
    private final String name;
    
    private int manaAvailable;
    private int manaTicker;
    private int health;
    
    private final Deck deck;
    private final Hand hand;
    private final InPlay inPlay;
    private final Graveyard graveyard;

    public Player(String name, Deck deck) {
        this.name = name;
        this.manaAvailable = 0;
        this.manaTicker = 0;
        this.health = 15;
        this.deck = deck;
        this.hand = new Hand();
        this.inPlay = new InPlay();
        this.graveyard = new Graveyard();
    }

    public String getName() {
        return this.name;
    }

    public int getManaAvailable() {
        return this.manaAvailable;
    }

    public int getHealth() {
        return this.health;
    }
    
    public Deck getDeck() {
        return this.deck;
    }
    
    public Hand getHand() {
        return this.hand;
    }

    public InPlay getInPlay() {
        return this.inPlay;
    }
    
    public Graveyard getGraveyard() {
        return this.graveyard;
    }
    
    public void newGame() {
        this.deck.shuffle();
        for (int i=0; i<4; i++) {
            this.hand.add(this.deck.draw());
        }
    }
    
    public void addMana() {
        if (this.manaTicker < this.MAX_MANA) {
            this.manaTicker++;
        }
        this.manaAvailable = manaTicker;
    }
    
    public void useMana(int amount) {
        this.manaAvailable -= amount;
    }
    
    public void drawCard() {
        this.hand.add(this.deck.draw());
    }
    
    public Boolean damage(int amount) {
        this.health -= amount;
        return this.health <= 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-9s HEALTH/%-5d MANA/%d\n", this.name, this.health, this.manaAvailable));

        for (int i=0; i<this.inPlay.count()+2; i++) {
            sb.append("+-------+ ");
        }
        sb.append("\n");
        
        for (int i=0; i<2; i++) {
            sb.append("|       | ");
        }
        for (int i=0; i<this.inPlay.count(); i++) {
            sb.append(String.format("|%7d| ", this.inPlay.getCard(i).getManaCost()));
        }
        sb.append("\n");
        
        sb.append("| DECK  | ");
        sb.append("| GRAVE | ");
        for (int i=0; i<this.inPlay.count(); i++) {
            sb.append(String.format("|  %-5s| ", this.inPlay.getCard(i).getId()));
        }
        sb.append("\n");
        
        sb.append(String.format("| %-6d| ", this.deck.count()));
        sb.append(String.format("| %-6d| ", this.graveyard.count()));
        for (int i=0; i<this.inPlay.count(); i++) {
            sb.append("|       | ");
        }
        sb.append("\n");
        
        for (int i=0; i<2; i++) {
            sb.append("|       | ");
        }
        for (int i=0; i<this.inPlay.count(); i++) {
            sb.append(String.format("|%-2d %4d| ", this.inPlay.getCard(i).getAttack(), this.inPlay.getCard(i).getHealth()));
        }
        sb.append("\n");
        
        for (int i=0; i<this.inPlay.count()+2; i++) {
            sb.append("+-------+ ");
        }
        sb.append("\n");
        sb.append(String.format("%d card(s) in hand.\n", this.hand.count()));
        sb.append("\n");
        
        sb.append(this.hand.toString());
        
        return sb.toString();
    }
}
