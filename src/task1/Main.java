package task1;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.createFullDeck();

        deck.drawOneByOne();
    }
}
