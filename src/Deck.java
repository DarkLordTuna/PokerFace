import java.util.LinkedList;
import java.util.Random;
public class Deck {
	public LinkedList<Card> notDealt;
	public Card[] cards;
	public Deck(){
		notDealt=new LinkedList<Card>();
		cards=new Card[52];
		for(int i=0; i<Card.Suit.values().length; i++){
			for(int j=0; j<Card.CardValue.values().length; j++){
				Card c=new Card(Card.Suit.values()[i], Card.CardValue.values()[j]);
				notDealt.add(c);
				cards[i*13+j]=c;
			}
		}
	}
	public int size(){
		return notDealt.size();
	}
	public String toString(){
		String toPrint="";
		for(Card c : notDealt){
			toPrint+=(c+"\n");
		}
		return toPrint;
	}
	public void shuffle(){
		LinkedList<Card> temp=new LinkedList<Card>();
		Random seedGen=new Random();
		while(!notDealt.isEmpty()){
			int seed=seedGen.nextInt(notDealt.size());
			Card copy=notDealt.remove(seed);
			temp.add(copy);
		}
		notDealt=temp;
	}
	public Card deal(){
		return notDealt.poll();
	}
	public Card[] dealHand(int handSize){
		Card[] hand=new Card[handSize];
		for(int i=0; i<handSize; i++){
			hand[i]=deal();
		}
		return hand;
	}
}