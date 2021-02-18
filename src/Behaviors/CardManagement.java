package Behaviors;

import Entities.Card;

import java.util.ArrayList;

public class CardManagement {
    ArrayList<Card> cards = new ArrayList<Card>();

    public void addCard(Card c){
        cards.add(c);
    }

    public void showListCard(){
        for (Card c: cards) {
            System.out.println(c.toString());
        }
    }
}
