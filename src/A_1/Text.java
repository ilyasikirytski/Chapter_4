package A_1;

// TODO Text это список предложений, а не строки, хедер тоже или слово и предложение + переопределить
//  toString вместо getHeader\getBody (или переименовать как getString)

// TODO форматирование кода (пробелы, запятые и тд)
public class Text {
    // TODO private?
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
