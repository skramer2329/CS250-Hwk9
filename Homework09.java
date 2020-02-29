/******************************************************
 * Sabrina Kramer Homework09.java
 * 
 * Creates a deck of cards, prints deck, shuffles deck and prints the shuffled
 * deck
 */

public class Homework09 {

	public static void main(String[] args) {

		String[] deck = new String[36];
		int n = 500; // swaps cards in shuffleDeck() n number of times

		// Creates 36 cards with Value and Suit
		for (int i = 0; i < 36; ++i) {
			int card = i;
			int cardNum = cardValue(card);
			String cardNumber = String.valueOf(cardNum);
			String cardSuit = cardSuit(card);
			String deckCard = "[" + cardNumber + cardSuit + "]";
			deck[i] = deckCard;
		}

		displayDeck(deck, n);

	}

	// Return the integer value ([1,9]) of card
	public static int cardValue(int card) {

		int cardNum = (card % 9) + 1;
		return cardNum;

	}

	// Return the suit( ["Club", "Spade", "Heart", "Diamond"]
	public static String cardSuit(int card) {
		String cardSuit = "";
		int tmp;
		tmp = (card / 9);
		if (tmp == 0) {
			cardSuit = "C";
		} else if (tmp == 1) {
			cardSuit = "S";
		} else if (tmp == 2) {
			cardSuit = "H";
		} else if (tmp == 3) {
			cardSuit = "D";
		}

		return cardSuit;
	}

	// Prints card (both value and suit)
	public static void displayCard(String deckCard) {
		System.out.println(deckCard);
	}

	// prints initDeck
	public static void initDeck(String[] deck) {// need help with this part of code
		System.out.println("After initDeck");
		System.out.println("*************************");
		for (int i = 0; i < 36; ++i) {
			System.out.println(deck[i]);
		}

	}

	// shuffles initDeck
	public static void shuffleDeck(String[] deck, int n) {

		String tmp;
		for (int x = 0; x < n; ++x) {
			int j = (int) (Math.random() * 35);
			int k = (int) (Math.random() * 35);
			tmp = deck[j];
			deck[j] = deck[k];
			deck[k] = tmp;

		}

		System.out.println("After shuffleDeck");
		System.out.println("*************************");
		for (int i = 0; i < 36; ++i) {
			System.out.println(deck[i]);
		}

	}

	// Prints the cards in both decks
	public static void displayDeck(String[] deck, int n) {

		initDeck(deck);
		System.out.println();
		shuffleDeck(deck, n);
	}
}
