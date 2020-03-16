package com.company;

public class Card {

    private String card;
    private String suit;

    public Card() {

        card = "-";
        suit = "-";

    }

    public Card (String card, String suit) {

        this.card = card;
        this.suit = suit;

    }

    String getCard() {
        return this.card;
    }
    String getSuit() {
        return this.suit;
    }

    void setCard(String card) {
        this.card = card;
    }

    void setSuit(String suit) {
        this.suit = suit;
    }

}
