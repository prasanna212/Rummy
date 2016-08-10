
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RummyHand a = new RummyHand();
		a.addCard(2, 0);
		Card joker = new Card(4,1);
		System.out.println(a.evaluateHand(joker));
	}

}
