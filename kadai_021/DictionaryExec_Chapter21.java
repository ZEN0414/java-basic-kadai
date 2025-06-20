package kadai_021;

public class DictionaryExec_Chapter21 {
	
	public static void main(String[] args) {
		
        // ① 辞書クラスのインスタンスを作成
        Dictionary_Chapter21 dic = new Dictionary_Chapter21();

        // ② 調べる英単語を配列にセット
        String[] myWords = {"apple", "banana", "grape","orange"};

        // ③ 辞書を調べるメソッドを引数指定で呼び出す
        dic.checkWords(myWords);

    }

}
