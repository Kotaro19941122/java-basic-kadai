package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		
		// 0～100までの配列
		boolean[] primeNumber = new boolean[101];
		
		// 初期化：とりあえず2以上をすべてtrueにしておく
		for(int i = 2; i <= 100; i++) {
			primeNumber[i] = true;
		}
		
		// 素数以外をfalseにする
		for(int i = 2; i * i <= 100; i++) {
			if(primeNumber[i]) {
				for(int j = i * i; j <= 100; j += i) {
					primeNumber[j] = false;
				}
			}
		}
		
		// 素数を出力
		for(int i = 2; i <= 100; i++) {
			if(primeNumber[i]) {
				System.out.println(i);
			}
		}
	}

}
