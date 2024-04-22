package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String,String> engDictionary = new HashMap<String,String>();
	
		public void engDictionary(String[] word) {
		
			engDictionary.put("apple","りんご");
			engDictionary.put("peach","桃");
			engDictionary.put("banana","バナナ");
			engDictionary.put("lemon","レモン");
			engDictionary.put("pear","梨");
			engDictionary.put("kiwi","キウイ");
			engDictionary.put("strawberry","いちご");
			engDictionary.put("grape","ぶどう");
			engDictionary.put("muscat","マスカット");
			engDictionary.put("cherry","さくらんぼ");
			
			for (int i = 0 ; i < word.length ; i++) {
				if(engDictionary.containsKey(word[i])) {
					String wordmeaning = engDictionary.get(word[i]);
					System.out.println(word[i] + "の意味は"+wordmeaning);
				} else {
					System.out.println(word[i] + "は辞書に存在しません");
				}
			}
		}
}
