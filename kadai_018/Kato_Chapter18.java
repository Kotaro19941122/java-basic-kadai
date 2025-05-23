package kadai_018;

public abstract class Kato_Chapter18 {
	
	// フィールド
	public String familyName = "加藤";
	public String givenName;
	public String address = "東京都中野区○×";
	
	// 共通の紹介を出力するメソッド
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}
	
	// 個別の紹介を出力するメソッド
	abstract public void eachIntroduce() {
		
	}
	
	// 紹介を実行するメソッド
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.println();
	}
	
	
}
