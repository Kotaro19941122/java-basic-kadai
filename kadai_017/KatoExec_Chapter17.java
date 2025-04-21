package kadai_017;

// 実行用クラス
public class KatoExec_Chapter17 {
    public static void main(String[] args) {
        // 太郎の紹介
        KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
        taro.setGivenName();
        taro.execIntroduce();

        // 一郎の紹介
        KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
        ichiro.setGivenName();
        ichiro.execIntroduce();

        // 花子の紹介
        KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
        hanako.setGivenName();
        hanako.execIntroduce();
    }
}
