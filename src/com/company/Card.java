package com.company;

public class Card {

    private String[] suit;
    private String[] card;

    public Card() {

         String[] suit = {"H", "D", "C", "S"};
         String[] card = {"A" , "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    }

    public Card (String []card, String []suit) {

        this.card = card;
        this.suit = suit;

    }

    String[] getCard() {
        return this.card;
    }

    String[] getSuit() {
        return this.suit;
    }

}
