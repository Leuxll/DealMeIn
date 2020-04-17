package com.company;

public class Card {

    private int number;
    private char suit;

    Card() {

        suit = ' ';
        number = 0;

    }

    Card (char suit, int number) {

        this.number = number;
        this.suit = suit;

    }

    int getNumber() {
        return this.number;
    }
    char getSuit() {
        return this.suit;
    }

}
