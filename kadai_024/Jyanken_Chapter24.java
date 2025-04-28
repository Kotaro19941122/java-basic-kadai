package kadai_024;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	
	// 入力用のScannerオブジェクト
	Scanner scanner = new Scanner(System.in);
	
	// じゃんけんの手を管理するHashMap
	Map<String, String> handMap = new HashMap<>();
	
	
	// コンストラクタ
	public Jyanken_Chapter24() {
		// キー(入力文字)と、実際の手(日本語)を対応付け
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");
	}
	
	// 自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		// ユーザーから入力を受け取る
		String input = scanner.nextLine().toLowerCase(); // 小文字に変換
		
		// 正しい入力がされるまでループ
		while(!handMap.containsKey(input)) {
			System.out.println("正しい入力をしてください(r, s, pのいずれか)");
			input = scanner.nextLine().toLowerCase();
		}
		
		return input;
	}
	
	// 対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		
		// じゃんけんの手の選択肢
		String[] hands = {"r", "s", "p"};
		
		// 0～2の範囲でランダムな整数を生成し、配列から選ぶ
		int index = (int)Math.floor(Math.random() * hands.length);
		return hands[index];
		
	}
	
	// じゃんけんの勝負をするメソッド
	public void playGame(String myChoice, String opponentChoice) {
		
		// 自分と相手の手を表示
		System.out.println("自分の手は" + handMap.get(myChoice) + ",対戦相手の手は" + handMap.get(opponentChoice));
		
		// 勝敗判定
		if(myChoice.equals(opponentChoice)) {
			// あいこの場合
			System.out.println("あいこです");
		} else if(
				(myChoice.equals("r") && opponentChoice.equals("s")) || // グー vs チョキ → 勝ち
                (myChoice.equals("s") && opponentChoice.equals("p")) || // チョキ vs パー → 勝ち
                (myChoice.equals("p") && opponentChoice.equals("r"))    // パー vs グー → 勝ち
        ) {
			System.out.println("自分の勝ちです");
		} else {
			// 上記以外は負け
			System.out.println("自分の負けです");
		}
	}
}
