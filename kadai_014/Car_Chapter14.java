package kadai_014;

public class Car_Chapter14 {
	
	// フィールド
	private int gear = 1;   // 1速から5足のギアを表す
	private int speed = 10;   // ギアチェンジ後の速度を表す
	
	// メソッド
	// ギアの値により速度を変える
	public void gearChange(int afterGear) {
		
	    this.gear = afterGear;
		
		switch(this.gear) {
		case 1 -> this.speed = 10;
		case 2 -> this.speed = 20;
		case 3 -> this.speed = 30;
		case 4 -> this.speed = 40;
		case 5 -> this.speed = 50;
		default -> this.speed = 10;
		}
		
		System.out.println("ギア1から" + this.gear + "に切り替えました");
	}
	
	// ギアチェンジ後の速度を表示する
	public void run() {	
		System.out.println("速度は時速" + this.speed + "kmです");
	}
}