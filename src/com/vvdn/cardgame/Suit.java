package com.vvdn.cardgame;

public enum Suit {
    CLUB('♣'),
    DIAMOND('♦'),
    HEART('♥'),
    SPADE('♠');

    private final char symbol;

    Suit(char symbol) {
        this.symbol = symbol;
    }

    public char getImage() {
        return symbol;
    }
}
