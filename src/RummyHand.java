import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RummyHand extends Hand {
	
	
	
	public RummyHand(List<Card> cards) {
		// TODO Auto-generated constructor stub
		this.cards = cards;
	}
	
	public int evaluateHand(Card joker) {
		return 0;
	}

	public static List<Card> sortedcards_suit(List<Card> list)
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
	
	public static List<Card> sortedcards_value(List<Card> list)
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
