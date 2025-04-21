package kadai_017;

// 加藤家の共通クラス（抽象クラス）
public abstract class Kato_Chapter17 {
    // フィールド：姓
    public String familyName = "加藤";
    // フィールド：名（子クラスで設定）
    public String givenName;
    // フィールド：住所
    public String address = "東京都中野区〇×";

    // 共通紹介メソッド（名前と住所を出力）
    public void commonIntroduce() {
        System.out.println("名前は" + familyName + givenName + "です");
        System.out.println("住所は" + address + "です");
    }

    // 個別紹介メソッド（抽象メソッド、子クラスで実装）
    abstract public void eachIntroduce();

    // 紹介を実行するメソッド（共通紹介＋個別紹介）
    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
        System.out.println(); // 出力結果の区切り用の空行
    }
}
