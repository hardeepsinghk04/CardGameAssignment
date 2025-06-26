package com.vvdn.cardgame;

public class Card {
    private final Suit suit;
    private final String face;
    private final int rank;

    public Card(Suit suit, String face, int rank) {
        this.suit = suit;
        this.face = face;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public String getFace() {
        return face;
    }

    public int getRank() {
        return rank;
    }

    public static Card getNumericCard(Suit suit, int number) {
        return new Card(suit, String.valueOf(number), number);
    }

    public static Card getFaceCard(Suit suit, char abbrev) {
        switch (abbrev) {
            case 'J': return new Card(suit, "Jack", 11);
            case 'Q': return new Card(suit, "Queen", 12);
            case 'K': return new Card(suit, "King", 13);
            case 'A': return new Card(suit, "Ace", 1);
            default: throw new IllegalArgumentException("Invalid face card: " + abbrev);
        }
    }

    @Override
    public String toString() {
        return face + " of " + suit + " (" + suit.getImage() + ", Rank: " + rank + ")";
    }
}
