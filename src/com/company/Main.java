package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        
        String[] suit = {"H", "D", "C", "S"};
        String[] card = {"A" , "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        Stack cardStack = new Stack();
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < card.length; j++) {
                cardStack.push(Card (card[j], suit[i]));
            }
        }

        String peekStack = (String) cardStack.peek();
        System.out.println(cardStack);

    }

    private static Object Card(String suit, String card) {

        card = "";
        suit = "";

         return (card + suit);

    }
}
