package miu.cs472;
import com.google.gson.Gson;
public class DictionaryDB {

	private String word;
	private String wordtype;
	private String definition;
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	DictionaryDB(String word, String wordtype, String definition) {
		this.word = word;
		this.wordtype = wordtype;
		this.definition = definition;
	}

	public String getWordtype() {
		return new Gson().toJson(wordtype);

	}
	public void setWordtype(String wordtype) {
		this.wordtype = wordtype;
	}
	public String getDefinition() {
		return new Gson().toJson(definition);
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	
	public void setData(String word,String type,String Dis)
	{
		this.word = word;
		this.wordtype = type;
		this.definition = Dis;
	}
}
