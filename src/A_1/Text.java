package A_1;

// TODO Text это список предложений, а не строки, хедер тоже или слово и предложение + переопределить
//  toString вместо getHeader\getBody (или переименовать как getString)

import java.util.ArrayList;

public class Text {
    private final ArrayList<Sentence> listOfSentence;
    private Word header;

    public Text() {
        listOfSentence = new ArrayList<>();
    }

    public Text(ArrayList<Sentence> sentence) {
        listOfSentence = sentence;
    }

    public void addSentence(Sentence s) {
        listOfSentence.add(s);
    }

    public void setHeader(Word w) {
        header = w;
    }

    public Word getHeader() {
        return header;
    }

    @Override
    public String toString() {
        return "Text{" +
                "text=" + listOfSentence +
                '}';
    }
}
