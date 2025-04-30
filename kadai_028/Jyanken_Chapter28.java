package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	HashMap<String, String> handMap = new HashMap<String, String>();
	Scanner scanner = new Scanner(System.in);
	
	// コンストラクタ
	public Jyanken_Chapter28() {

		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");
		
	}
	
	// 自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
		
		System.out.println("自分のじゃんんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String input = scanner.nextLine().toLowerCase();
		
		// 正しい入力がされるまで繰返す
		while(!handMap.containsKey(input)) {
			System.out.println("正しい入力してください（r ,s ,p のいずれか）");
			input = scanner.nextLine().toLowerCase();
		}
		
		return input;
	}
	
	// 対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		
		String[] hands = {"r", "s", "p"};
		
		int index = (int)Math.floor(Math.random() * hands.length);
		return hands[index];
	}
	
	// じゃんけんを行うメソッド
	public void playGame(String myChoice, String opponentChoice) {
		
		System.out.println("自分の手は" + handMap.get(myChoice) + "対戦相手の手は" + handMap.get(opponentChoice));
		
		if(myChoice.equals(opponentChoice)) {
			System.out.println("あいこです");
		} else if(myChoice.equals("r") && opponentChoice.equals("s") || 
				myChoice.equals("s") && opponentChoice.equals("p") ||
				myChoice.equals("p") && opponentChoice.equals("r")) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}
}
