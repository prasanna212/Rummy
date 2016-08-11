import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RummyHand {
	
	private Deck deck;
	private Hand hand;
	final int NO_CARDS_RUMMY=13;
	
	RummyHand()
	{
		deck=new Deck(2,2);
		deck.shuffle();
		hand=new Hand(deck.pick(NO_CARDS_RUMMY));
		ArrayList<Card> sortedcards=new ArrayList<>();
		List<Card> list=hand.cardsInHand();
		System.out.println(list);
		sortedcards_value(list);
		System.out.println(list);
		sortedcards_suit(list);
		System.out.println(list);
	}
	
	public List<Card> sortedcards_suit(List<Card> list)
	{
	Collections.sort(list,new Comparator<Card>() {

			
			@Override
			public int compare(Card c1,Card c2) {
				// TODO Auto-generated method stub
				return c2.getSuit()-c1.getSuit();
				
			}

		});
		return list;
	}
	
	public List<Card> sortedcards_value(List<Card> list)
	{
	Collections.sort(list,new Comparator<Card>() {

			
			@Override
			public int compare(Card c1,Card c2) {
				// TODO Auto-generated method stub
				return c2.getFace()-c1.getFace();
				
			}

		});
		return list;
	}
	

}
