package A_1;

// TODO Text это список предложений, а не строки, хедер тоже или слово и предложение + переопределить
//  toString вместо getHeader\getBody (или переименовать как getString)

import java.util.ArrayList;

public class Text {
    private final ArrayList<String> listOfSentence = new ArrayList<>();

    public Text(String sentence) {
        listOfSentence.add(sentence);
    }

    @Override
    public String toString() {
        return "Text{" +
                "text=" + listOfSentence +
                '}';
    }
}
