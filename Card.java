public class Card {
   
    private int myRank;
    private int mySuit;
    
    public Card (int rank, int suit) {
        // 2 - 14
        if (isLegalRank (rank)) {
          myRank = rank;
       } else {
          System.out.println ("Illegal rank: " + rank);
       }
       // 0 - 3
       if (isLegalSuit (suit)) {
          mySuit = suit;
       } else {
          System.out.println ("Illegal suit: " + suit);
       }
    }
    
    // between 2 and 14
    public boolean isLegalRank (int x) {
       return x >= 2 && x <= 14;
    }
    
    //between 0 and 3
    public boolean isLegalSuit (int x) {
        return x >= 0 && x <= 3;
    }
    
    public int rank ( ) {
       return myRank;
    }
    
    public int suit ( ) {
       return mySuit;
    }

    // what happens when the rank is the same?
    // compare the suits?
    public boolean outranks(Card other){
        if(this.myRank > other.myRank)
         return true;
      else if(this.myRank < other.myRank)
         return false;
      else {
         return this.mySuit > other.mySuit;
      }
    }
 }