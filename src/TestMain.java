public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NO_OF_RUMMY_CARDS = 13;
		Deck deck=new Deck(2,2);
        deck.shuffle();
        RummyHand hand=new RummyHand(deck.pick(NO_OF_RUMMY_CARDS));
        
        System.out.println(hand.cards);
		
        hand.sortedcards_value();
		System.out.println(hand.cards);
		
		hand.sortedcards_suit();
		System.out.println(hand.cards);
        
        Card joker = new Card(4,1);
		System.out.println(hand.evaluateHand(joker));
        
		/*RummyHand a = new RummyHand();
		a.addCard(2, 0);
		Card joker = new Card(4,1);
		System.out.println(a.evaluateHand(joker));
		*/
	}

}
