package kadai_018;

public abstract class kato_Chapter18 {

	public String familyName = "加藤"; //苗字
	public String givenName;  //名前
	public String address = "東京都中野区〇×";    //住所
	
	public void commonIntroduce() { //共通の紹介を出力する
		
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
		
	}
	
	abstract void eachIntroduce(); //個別の紹介を出力する
	
	public void execIntroduce() { //紹介を実行する
		
		commonIntroduce();
		eachIntroduce();
		
	}
}
