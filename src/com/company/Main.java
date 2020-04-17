package com.company;
import java.util.Stack;

public class Main {

    public static Stack cardStack = new Stack();

    public static void main(String[] args) {

        char[] suits = {'D','C','H','S'};
        String cards[] = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                cardStack.push(cards[i] + " of " + suits[j]);
            }
        }

        System.out.println(cardStack.peek());

    }

}
