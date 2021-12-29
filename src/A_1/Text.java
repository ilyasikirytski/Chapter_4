package A_1;

public class Text {
    String header;
    String body = "";

    public Text(Word word){
        header = word.getWord();
    }

    public void addHeader(Word word){
        body += " " + word.getWord();
    }

    public void addBody(Sentence sentence){
        body += " " + sentence.getSentence();
    }

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }
}
