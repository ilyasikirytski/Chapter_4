package A_1;

import java.util.ArrayList;

public class Sentence {
    private final ArrayList<Word> listOfWords;

    public Sentence(ArrayList<Word> word) {
        listOfWords = word;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "words=" + listOfWords +
                '}';
    }
}
