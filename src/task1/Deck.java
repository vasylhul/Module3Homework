package task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {
    private static final String[] suit = {"Hearts", "Spades", "Clubs", "Diamonds"};
    private static final String[] rank = {"Two", "Three", "Four", "Five", "Six",
                                            "Seven", "Eight", "Nine", "Ten", "Jack",
                                                "Queen", "King", "Ace"};

    private static List<Card> fullDeck = new ArrayList<>();

    public List<Card> createFullDeck() {
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                fullDeck.add(new Card(suit[i], rank[j]));
            }
        }
        return fullDeck;
    }

    public void displayFullDeck() {
        for (Card i : fullDeck) {
            System.out.println(i.getRank() + " " + i.getSuit());
        }
    }

    public void shuffle(){
        Collections.shuffle(fullDeck);
    }

    public void drawOneCard(){
        Card removedCard = fullDeck.remove(fullDeck.size() - 1);
        System.out.println("You picked " + removedCard.getRank() + " " + removedCard.getSuit());
    }

    public void drawOneByOne(){
        for (int i = 0; 0 < fullDeck.size(); i++) {
            System.out.print(i + 1 + ". ");
            drawOneCard();

        }
    }
}
