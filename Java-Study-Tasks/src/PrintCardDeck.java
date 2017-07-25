
public class PrintCardDeck {

	/*Write a program that prints all possible cards from
	Standard joker-free deck (we have 52 cards: 4 suits by 13 faces).
	 */
	public static void main(String[] args) {
		/*
			char BlackSpadeSuit = '\u2660';//used
		char BlackHeartSuit = '\u2665';
		char BlackDiamondSuit = '\u2666';
			char BlackClubSuit = '\u2663';//used
		
		char WhiteSpadeSuit = '\u2664';
			char WhiteHeartSuit = '\u2661';//used
			char WhiteDiamondSuit = '\u2662';//used
		char WhiteClubSuit = '\u2667';
		*/
		char[] Suits = {'\u2660', '\u2663', '\u2661', '\u2662', };
		String[] Faces ={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		
		for (String face : Faces){
			for (char suit : Suits) {
				System.out.printf("%s%c, ", face, suit);
			}
		}
	}
}
