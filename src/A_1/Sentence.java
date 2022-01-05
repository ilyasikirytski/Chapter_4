package A_1;

// TODO Sentence это список слов, а не стринга + переопределить toString
//  вместо getSentence (или переименовать как getString)

// TODO форматирование кода (пробелы, запятые и тд)
public class Sentence {
    private String value = "";

    public void addWord(Word word){
        value = value + " " + word.getWord();
    }

    public String getSentence() {
        return value;
    }
}
