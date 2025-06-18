package kadai_018;

public class KatoIchiro_Chapter18 extends kato_Chapter18 {

	public void setGivenName() {//名前をセットするセッター
		
		this.givenName = "一郎";
		
	}

	public void eachIntroduce() { //オーバーライドされたメソッド
    	
        System.out.println("好きな食べ物はリンゴです");
    
    }
}
