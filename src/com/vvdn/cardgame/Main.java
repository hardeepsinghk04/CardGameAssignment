package com.vvdn.cardgame;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Card> deck = DeckGenerator.getStandardDeck();

        System.out.println("🔸 Original Deck:");
        DeckGenerator.printDeck(deck);

        System.out.println("\n🔸 Shuffled Deck:");
        DeckGenerator.shuffleDeck(deck);
        DeckGenerator.printDeck(deck);

        System.out.println("\n🔸 Sorted by Rank:");
        DeckGenerator.sortDeckByRank(deck);
        DeckGenerator.printDeck(deck);

        System.out.println("\n🔸 Draw Top 5 Cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Drawn Card: " + deck.remove(0));
        }

        System.out.println("\n🔸 Remaining cards in deck: " + deck.size());
    }
}
