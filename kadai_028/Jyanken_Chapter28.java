package kadai_028;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	private HashMap<String, String> Jankenhyou;

	//自分のじゃんけんの手を入力する
	public String getMyChoice() {

		//Scannerクラスのオブジェクトを生成する
	      Scanner scanner = new Scanner(System.in);
	      String input = null;
	      String myChoice = null;
	      
			// 有効な入力を得るまでループ
	        do {
	        	input = scanner.next();
	        	
	        	switch(input) {
	  	     
	  	      case "r":
	  	    	
	  	      case "s":
	  	    	
	  	      case "p":
	  	    	myChoice = input;
                break;
	  	    	  
	  	      //例外処理
	  	      default:
	  		    System.out.println("無効な入力です。r, s, p のいずれかを入力してください。");
	  		    break;
	  	    		  
	  	      }
	        }while(myChoice == null);
	      
	        return myChoice;
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {

		String[] myArray = {"r", "s", "p"};
		double randomValue = Math.random() * 3;         // 0.0 以上 3.0 未満の数を取得
	    int index = (int)Math.floor(randomValue);       // floorで切り捨てて0,1,2の整数に
	    return myArray[index];                          // 配列から選んで返す
	}
	
	//じゃんけんを行う
	public void playGame() {
		
		System.out.println("自分のじゃんけんの手を入力しましょう\nグーはrockのrを入力しましょう\nチョキはscissorsのsを入力しましょう\nパーはpaperのpを入力しましょう");
		
		//自分の手を入力
		String myChoice = getMyChoice();
		
        //対戦相手の手を作成
        String opponentChoice = getRandom();
        
        this.Jankenhyou = new HashMap<>();
        
      //HashMapにキーと値をセット
        Jankenhyou.put("r", "グー");
        Jankenhyou.put("s", "チョキ");
        Jankenhyou.put("p", "パー");
		
        System.out.println("自分の手は" + Jankenhyou.get(myChoice) + ",対戦相手の手は" + Jankenhyou.get(opponentChoice));
        
        if(myChoice.equals(opponentChoice)) {
    		
        	System.out.println("あいこです");
        	
    	}else if((myChoice.equals("r") && opponentChoice.equals("s")) ||
    	        (myChoice.equals("s") && opponentChoice.equals("p")) || 
    	        (myChoice.equals("p") && opponentChoice.equals("r"))) {
    		
    		System.out.println("自分の勝ちです");
    		
    	}else {
    		System.out.println("自分の負けです");
    	}
	}
}
