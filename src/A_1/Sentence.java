package A_1;

// TODO Sentence это список слов, а не стринга + переопределить toString
//  вместо getSentence (или переименовать как getString)

import java.util.ArrayList;

public class Sentence {
    private final ArrayList<Word> listOfWords;

    public Sentence() {
        listOfWords = new ArrayList<>();
    }

    public Sentence(ArrayList<Word> word) {
        listOfWords = word;
    }

    public void addWord(Word w) {
        listOfWords.add(w);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "words=" + listOfWords +
                '}';
    }
}
