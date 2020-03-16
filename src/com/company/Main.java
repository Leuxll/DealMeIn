package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        String[] suit = "H,D,C,S".split(",");
        String[] card = "A,2,3,4,5,6,7,8,9,10,J,Q,K".split(",");

        Stack cardStack = new Stack();
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < card.length; j++) {
                cardStack.push(new Card(card[j], suit[i]));
            }
        }

        String peekStack = (String) cardStack.peek();
        System.out.println(cardStack);

    }
}
