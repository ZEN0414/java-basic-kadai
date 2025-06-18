package kadai_015;

public class Car_Chapter15 {
	private int gear = 1;   // ギア変数
	private int speed = 10; // スピード変数
	
	public void  gearChange(int afterGear) { //ギアをチェンジした際にスピードの値を変更
		
		int beforeGear = gear;  // 変更前のギアを保存
		gear = afterGear; //ギアを更新
		
		switch(gear) {
		
		case 1:
			speed = 10;
			break;
		case 2:
			speed = 20;
			break;
		case 3:
			speed = 30;
			break;
		case 4:
			speed = 40;
			break;
		case 5:
			speed = 50;
			break;
		default:
			speed = 10;
		}
			
		// ギア変更のメッセージを表示
		System.out.println("ギアを" + beforeGear + "から" + gear + "に切り替えました。");
	}

	public void run() { //ここで速度を表示
		System.out.println("速度は時速"+ speed +"です");
	}

}
