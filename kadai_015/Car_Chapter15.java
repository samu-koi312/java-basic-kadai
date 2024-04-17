package kadai_015;

//車クラス
public class Car_Chapter15 {
	
	private int gear;
	private int speed;
	
	public Car_Chapter15(int gear, int speed) {
		this.gear = gear = 1;
		this.speed = speed = 10;
	}
	
	public void gearChange(int afterGear) {
		System.out.println("ギア"+this.gear+"から"+afterGear+"に切り替えました");
		this.gear = afterGear;
		this.speed = switch(this.gear) {
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
		};
	}
	
	public void run() {
		System.out.println("速度は時速"+this.speed+"kmです");
	}

}
