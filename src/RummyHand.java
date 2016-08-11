import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class RummyHand extends Hand {

	public RummyHand(List<Card> cards) {
		// TODO Auto-generated constructor stub
		this.cards = cards;
	}

	public int evaluateHand(Card joker) {
		HashMap<Integer,Integer> faceValueFrequencies = getFaceValueFrequencies();
		int numberOfSequences;
		int numberOfTriplets = getSets(faceValueFrequencies,3);
		return 0;
	}

	private int getSets(HashMap<Integer, Integer> valueFrequency, int frequency) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int value:valueFrequency.keySet())
		{
			if(valueFrequency.get(value) == frequency)
				count++;
		}
		return count;
	}

	private HashMap<Integer, Integer> getFaceValueFrequencies() {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> faceValueFrequencies = new HashMap<Integer,Integer>();
		
		int rank;
		for(int i=0;i<cards.size();i++)
		{
			rank = cards.get(i).getFace();
			if(faceValueFrequencies.containsKey(rank))
			{
				faceValueFrequencies.put(rank, faceValueFrequencies.get(rank)+1);
			}
			else
			{
				faceValueFrequencies.put(rank, 1);
			}
		}
		return faceValueFrequencies;
	}

	public void sortedcards_suit() {
		List<Card> list = this.cards;
		Collections.sort(list, new Comparator<Card>() {

			@Override
			public int compare(Card c1, Card c2) {
				// TODO Auto-generated method stub
				return c2.getSuit() - c1.getSuit();

			}

		});
	}

	public void sortedcards_value() {
		List<Card> list = this.cards;
		Collections.sort(list, new Comparator<Card>() {

			@Override
			public int compare(Card c1, Card c2) {
				// TODO Auto-generated method stub
				return c2.getFace() - c1.getFace();

			}

		});
	}

}
