package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	public String getMyChoice() {
		
		System.out.println("自分のじゃんけんの手を入力しましょう\n"
				+ "グーはrockのrを入力しましょう\n"
				+ "チョキはscissorsのsを入力しましょう\n"
				+ "パーはpaperのpを入力しましょう");
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			String input = scanner.next();
				
			if (input.equals("r") || input.equals("s") || input.equals("p") ) {
				scanner.close();
				return input;
			} else {
			System.out.println("正しいじゃんけんの手を入力してください");
			}
		}
}
	
	public String getRandom() {
		String rsp[] =  {"r","s","p"};
		
		int choise = (int)(Math.floor(Math.random() * 3));
		
		return rsp[choise];
	}
	
	public void playGame(String myChoise, String choise) {
		HashMap<String,String> jyanken = new HashMap<String,String>();
		jyanken.put("r", "グー");
		jyanken.put("s", "チョキ");
		jyanken.put("p", "パー");
		
		System.out.println("自分の手は"+jyanken.get(myChoise)+",対戦相手の手は"+jyanken.get(choise));
		
		if ( myChoise.equals(choise)) {
			System.out.println("あいこです");
		} else if ( myChoise.equals("r") && choise.equals("s") ) {
			System.out.println("自分の勝ちです");
		} else if ( myChoise.equals("s") && choise.equals("p") ) {
			System.out.println("自分の勝ちです");
		} else if ( myChoise.equals("p") && choise.equals("r") ) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
		
	}
}
