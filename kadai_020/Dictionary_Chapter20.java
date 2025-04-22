package kadai_020;

import java.util.HashMap;

// 英単語と日本語の意味を管理する辞書クラス
public class Dictionary_Chapter20 {
	
	// HashMapを宣言
	HashMap<String, String> dictionary = new HashMap<String, String>();
	
	// コンストラクタ：クラスが生成されたときに辞書に単語を登録
	public Dictionary_Chapter20() {
		
		// 辞書に英単語と意味を追加
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "キウイ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
		
	}
	
	// 指定された英単語を辞書から検索するメソッド
	public String searchWord(String word) {
		return dictionary.get(word);
		
	}
}
