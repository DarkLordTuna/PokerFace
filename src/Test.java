
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Card blah=new Card(Card.Suit.SPADES, Card.CardValue.ACE);
		System.out.println(blah);
		Deck bleee=new Deck();
		bleee.shuffle();
		//System.out.println(bleee);
		blah=bleee.deal();
		blah=bleee.deal();
		System.out.println(blah+" "+bleee.size());	
	}
}
