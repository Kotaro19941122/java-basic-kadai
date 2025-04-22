package kadai_020;

// 辞書を使って英単語の意味を調べる実行用クラス
public class DictionaryExec_Chapter21 {
	
	public static void main(String[] args) {
		
		// 辞書クラスのインスタンスを作成(辞書データが準備される)
		Dictionary_Chapter20 dictionary = new Dictionary_Chapter20();
		
		// 調べたい英単語のリスト
		String[] wordsToSearch = {"apple", "banana", "grape", "orange"};
		
		// 配列の中の単語を順番に取り出して調べる
		for(String word : wordsToSearch) {
			// 辞書から単語の意味を検索
			String meaning = dictionary.searchWord(word);
			
			if(meaning != null) {
				System.out.println(word + "の意味は" + meaning);
			} else {
				System.out.println(word + "は辞書に存在しません");
			}
		}
	}

}
