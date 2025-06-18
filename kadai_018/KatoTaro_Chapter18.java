package kadai_018;

public class KatoTaro_Chapter18 extends kato_Chapter18 { //kato_Chapter18を継承したKatoTaro_Chapter18クラスを作成
    
	public void setGivenName() {//名前をセットするセッター
		
		this.givenName = "太郎";
		
	}
	
    public void eachIntroduce() { //オーバーライドされたメソッド
    	
        System.out.println("私はJavaが得意です");
    
    }

}