
public class Card {
	public enum Suit{ SPADES, DIAMONDS, HEARTS, CLUBS};
	public enum CardValue{ TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE};
	public Suit s;
	public CardValue c;
	public Card(Suit s, CardValue c){
		this.s=s;
		this.c=c;
	}
	public int compareTo(Card toCompare){
		return this.c.compareTo(toCompare.c);
	}
	public String toString(){
		String temp="";
		switch (s){
		case SPADES: temp="\u2660"; break;
		case DIAMONDS: temp="\u2666"; break;
		case HEARTS: temp="\u2665"; break;
		case CLUBS: temp="\u2663"; break;
		}
		return (this.c.toString()+" OF "+temp).toLowerCase();
	}
}