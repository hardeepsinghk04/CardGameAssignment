package com.vvdn.cardgame;

import java.util.*;

public class DeckGenerator {

    public static List<Card> getStandardDeck() {
        List<Card> deck = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            // Add numeric cards (2 to 10)
            for (int i = 2; i <= 10; i++) {
                deck.add(Card.getNumericCard(suit, i));
            }

            // Add face cards
            deck.add(Card.getFaceCard(suit, 'J'));
            deck.add(Card.getFaceCard(suit, 'Q'));
            deck.add(Card.getFaceCard(suit, 'K'));
            deck.add(Card.getFaceCard(suit, 'A'));
        }

        return deck;
    }

    public static void printDeck(List<Card> deck) {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    public static void shuffleDeck(List<Card> deck) {
        Collections.shuffle(deck);
    }

    public static void sortDeckByRank(List<Card> deck) {
        deck.sort(Comparator.comparingInt(Card::getRank));
    }
}
