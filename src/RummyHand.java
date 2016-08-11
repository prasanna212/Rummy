import java.util.ArrayList;
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
		HashMap<Integer, Integer> faceValueFrequencies = getFaceValueFrequencies();
		int numberOfSequences;
		List<Integer> tripletFaceValues = getSets(faceValueFrequencies, 3);
		List<Integer> quadrapletFaceValues = getSets(faceValueFrequencies, 4);
		this.sortedCards_Value();
		this.sortedCards_Suit();
		List<Card> seq_list = this.Sequence_List();
		System.out.println(seq_list);
		return 0;
	}

	private List<Card> Sequence_List() {
		List<Card> list = this.cards;
		List<Card> list_seq = new ArrayList<>();

		Card current = list.get(0);
		for (int i = 1; i < list.size(); i++) {

			if (current.getSuit() == list.get(i).getSuit() && current.getFace() == (list.get(i).getFace() + 1)) {
				if (!list_seq.contains(current))
					list_seq.add(current);
				list_seq.add(list.get(i));
			}
			current = list.get(i);

		}

		return list_seq;

	}

	private List<Integer> getSets(HashMap<Integer, Integer> valueFrequency, int frequency) {
		// TODO Auto-generated method stub
		List<Integer> setFaceValues = new ArrayList<Integer>();
		for (int value : valueFrequency.keySet()) {
			if (valueFrequency.get(value) == frequency)
				setFaceValues.add(value);
		}
		return setFaceValues;
	}

	private HashMap<Integer, Integer> getFaceValueFrequencies() {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> faceValueFrequencies = new HashMap<Integer, Integer>();

		int rank;
		for (int i = 0; i < cards.size(); i++) {
			rank = cards.get(i).getFace();
			if (faceValueFrequencies.containsKey(rank)) {
				faceValueFrequencies.put(rank, faceValueFrequencies.get(rank) + 1);
			} else {
				faceValueFrequencies.put(rank, 1);
			}
		}
		return faceValueFrequencies;
	}

	public void sortedCards_Suit() {
		List<Card> list = this.cards;
		Collections.sort(list, new Comparator<Card>() {

			@Override
			public int compare(Card c1, Card c2) {
				// TODO Auto-generated method stub
				return c2.getSuit() - c1.getSuit();

			}

		});
	}

	public void sortedCards_Value() {
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