import java.util.*;
public class Deck {
    public Deck(String[]rank, String[]suit, int[]values){
        ArrayList<Card> cardList = new ArrayList<Card>();
        for(int i = 0;i < suit.length;i++){
            for (int j = 0; j < rank.length; j ++){
                Card cardToAdd = new Card(values[j],suit[i], rank[j]);
                System.out.println(cardToAdd);
                //cardList.add(rank[j] + suit + values);
            }
        }
    }
    /*public boolean isEmpty(){
        if()
    } */
    public static void main(String[] args) {
        Deck myDeck = new Deck;
        System.out.println(myDeck);
    }
}


