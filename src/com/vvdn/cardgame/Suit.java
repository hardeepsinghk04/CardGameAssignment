package com.vvdn.cardgame;

public enum Suit {
    CLUB, DIAMOND, HEART, SPADE;

    public char getImage() {
        switch (this) {
            case CLUB: return '\u2663';    // ♣
            case DIAMOND: return '\u2666'; // ♦
            case HEART: return '\u2665';   // ♥
            case SPADE: return '\u2660';   // ♠
            default: return '?';
        }
    }
}
