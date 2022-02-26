package A_1;

import java.util.ArrayList;

public class Text {
    private final ArrayList<Sentence> listOfSentence;
    private Word header;

    public Text() {
        listOfSentence = new ArrayList<>();
    }

    public void addSentence(Sentence s) {
        listOfSentence.add(s);
    }

    public void setHeader(Word w) {
        header = w;
    }

    @Override
    public String toString() {
        return "Header {" +
                "header=" + header +
                "}\n" +
                "Text {" +
                "text=" + listOfSentence +
                "}";
    }
}
