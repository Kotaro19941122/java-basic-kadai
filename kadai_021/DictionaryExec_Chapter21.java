package kadai_021;

public class DictionaryExec_Chapter21 {
	
	public static void main(String[] args) {
		
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		String[] wordToSearch = {"apple", "banana", "grape", "orange"};
		
		for(int i = 0; i < wordToSearch.length; i++) {
			String meaning = dictionary.searchWord(wordToSearch[i]);
			if(meaning != null) {
				System.out.println(wordToSearch[i] + "の意味は" + meaning);
			} else {
				System.out.println(wordToSearch[i] + "は辞書に存在しません");
			}
		}
	}
}
