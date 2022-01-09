package A_1;

// TODO Sentence это список слов, а не стринга + переопределить toString
//  вместо getSentence (или переименовать как getString)

import java.util.ArrayList;

public class Sentence {
    private final ArrayList<String> listOfWords = new ArrayList<>();

    public Sentence(String word) {
        listOfWords.add(word);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "words=" + listOfWords +
                '}';
    }
}
