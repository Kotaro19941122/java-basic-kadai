package kadai_024;

public class JyankenExec_Chapter24 {

	public static void main(String[] args) {
		
		// じゃんけんクラスのインスタンスを作成
		Jyanken_Chapter24 jyanken = new Jyanken_Chapter24();
		
		// 自分の手を取得
		String myChoice = jyanken.getMyChoice();
		
		// 対戦相手の手をランダムに取得
		String opponentChoice = jyanken.getRandom();
		
		jyanken.playGame(myChoice, opponentChoice);
	}

}
