import java.util.*;
public class Deck {
    ArrayList<Card> cards;
    int size;

    public Deck(String[] suit, String[] rank, int[] value) {
        cards = new ArrayList<Card>();
        size = cards.size();

        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                cards.add(new Card(value[i], suit[j], rank[i]));
            }
        }
    }

    // shuffle
    public void shuffle(){
        for (int i = 51; i >0; i--) {
            int r = (int) (Math.random() * 51);
            Card temp1 = cards.get(r);
            Card temp2 = cards.get(i);
            cards.set(r, temp2);
            cards.set(i, temp1);
        }

        // print shuffled deck
        for (int i = 0; i < 51; i++) {
            System.out.println(cards.get(i));
        }
    }






    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        if(cards.size()==0){
            return true;
        } else {
            return false;
        }
    }

    public Card deal() {
        size = size - 1;
        if (size > 0) {
            Card a = cards.get(size);
            return a;
        } else {
            return null;
        }
    }

}


