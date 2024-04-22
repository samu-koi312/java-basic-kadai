package kadai_026;

public class JyankenExec_Chapter26 {
	public static void main(String[] args) {
		Jyanken_Chapter26 hand = new Jyanken_Chapter26();
		
		String myChoise = hand.getMyChoice();
		
		String choise = hand.getRandom();
		
		hand.playGame(myChoise, choise);
	}
}
