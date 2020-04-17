package com.company;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack cardStack = new Stack();

        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    cardStack.push(new Card('D', i));
                } else if (j == 1) {
                    cardStack.push(new Card('C', i));
                } else if (j == 2) {
                    cardStack.push(new Card('H', i));
                } else {
                    cardStack.push(new Card('S', i));
                }
            }
        }

        int size = cardStack.size();

//        for (int i = 0; i < size; i++) {
//
//            Card dealtCard = (Card) cardStack.pop();
//            System.out.print(dealtCard.getNumber() + "" + dealtCard.getSuit() + " ");
//
//        }
//
//    }

    for (int i = 0; i < 4; i++) {

            int hand = i + 1;

        System.out.println("Hand" + hand + ": ");
            for (int j = 0; j < 13; j++) {

                Card dealtCard = (Card) cardStack.pop();
                System.out.print(dealtCard.getNumber() + "" + dealtCard.getSuit() + " ");

            }

        System.out.println();

        }

    }

}
