package A_1;

public class Sentence {
    private String value = "";

    public void addWord(Word word){
        value = value + " " + word.getWord();
    }

    public String getSentence() {
        return value;
    }
}
