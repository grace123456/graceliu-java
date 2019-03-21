public class Card {
        public int pointValue;
        public String suit;
        public String rank;

        public Card (int pointValue, String suit, String rank){
            this.pointValue = pointValue;
            this.suit = suit;
            this.rank = rank;
        }

        public int getPointValue(){
            return pointValue;
        }

        public String getSuit(){
            return suit;
        }

        public String getRank(){
            return rank;
        }

        public boolean compare(Card otherCard){
            return this.pointValue == otherCard.getPointValue() &&
                        this.suit.equals(otherCard.getSuit()) &&
                        this.rank.equals(otherCard.getRank());

        }

        public String toString(){
            return rank + "of" + suit + "(" + pointValue + ")";
        }

    }

