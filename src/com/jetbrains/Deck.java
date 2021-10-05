package com.jetbrains;

import java.util.*;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<Card>();

        for (int p=0; p<=3; p++){
            int c = p <= 1 ? (int) 0: (int) 1;
            for (int v=0; v<=12; v++){
                cards.add(new Card (Card.palos[p],Card.colores[c],Card.valores[v]));
            }
        }
    }

    public int totalCards(){
        return cards.size();
    }

    public void Shuffle(){
        Collections.shuffle(cards);
        System.out.println("Se mezclo el Deck.");
    }

    public void Head(){
        Card cardHead = cards.remove(0);

        System.out.println(cardHead.getPalo()+","+cardHead.getColor()+","+cardHead.getValor());
        System.out.println("");
        System.out.println("Quedan "+totalCards()+" Cartas");
    }

    public void Pick(){
        Random random = new Random();

        Card cardPick = cards.remove(random.nextInt(cards.size() -1));
        System.out.println(cardPick.getPalo()+","+cardPick.getColor()+","+cardPick.getValor());
        System.out.println("");
        System.out.println("Quedan "+totalCards()+" Cartas");
    }

    public void Hand(){
        Random random = new Random();

        for (int i=0; i<=4; i++){
            Card cardHand = cards.remove(random.nextInt(cards.size() -1));
            System.out.println(cardHand.getPalo()+","+cardHand.getColor()+","+cardHand.getValor());
        }
        System.out.println("");
        System.out.println("Quedan "+totalCards()+" Cartas");
    }
}
