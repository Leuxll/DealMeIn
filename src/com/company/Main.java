package com.company;
import java.util.Random;
import java.util.Scanner;
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

        int [] card  = new int[52];
        char [] suit = new char[52];
        int suitIndex = 0;
        int cardIndex = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 14; j++) {
                card[cardIndex] = j;
                cardIndex++;
            }
        }

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                switch (j) {
                    case 0:
                        suit [suitIndex] = 'D';
                        break;
                    case 1:
                        suit [suitIndex] = 'C';
                        break;
                    case 2:
                        suit [suitIndex] = 'H';
                        break;
                    case 3:
                        suit [suitIndex] = 'S';
                        break;
                }
                suitIndex++;
            }
        }

        Random random = new Random();

        for  (int i = 0; i < card.length; i++) {

            int randomIndexToStop = random.nextInt(card.length);
            int temp = card[randomIndexToStop];
            card[randomIndexToStop] = card[i];
            card[i] = temp;

        }

        for  (int i = 0; i < suit.length; i++) {

            int randomIndexToStop = random.nextInt(suit.length);
            char temp = suit[randomIndexToStop];
            suit[randomIndexToStop] = suit[i];
            suit[i] = temp;
        }

        for (int i = 0; i < 52; i++) {

            cardStack.push(new Card(suit[i], card[i]));

        }

//        System.out.println("\n Shuffled Cards:\n");
//        for (int i = 0; i < 4; i++) {
//
//            int hand = i + 1;
//
//            System.out.println("Hand" + hand + ": ");
//            for (int j = 0; j < 13; j++) {
//
//                Card dealtCard = (Card) cardStack.pop();
//                System.out.print(dealtCard.getNumber() + "" + dealtCard.getSuit() + " ");
//
//            }
//
//            System.out.println();
//
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of hands: ");
        int hands = scanner.nextInt();

        System.out.println("Enter number of cards per hand: ");
        int cards = scanner.nextInt();

        for (int i = 0; i < hands; i++) {
            System.out.println("Player " + (i + 1) + "'s hand: ");

            for (int j = 0; j < cards; j++) {
                Card dealtCard = (Card) cardStack.pop();
                System.out.println(dealtCard.getNumber() + "" + dealtCard.getSuit() + " ");
            }
            System.out.println();
        }

    }

}
