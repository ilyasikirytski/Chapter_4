/*
Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
package A_1;

public class Main {
    public static void main(String[] args) {
        Word header = new Word("hello");
        Word word2 = new Word("dear");
        Word word3 = new Word("dev");
        Word word4 = new Word("!");

        Sentence sentence = new Sentence();

        sentence.addWord(word2);
        sentence.addWord(word3);
        sentence.addWord(word4);

        Text text = new Text(header);
        text.addHeader(header);
        text.addBody(sentence);

        System.out.println("Заголовок :" + text.getHeader());
        System.out.println("Текст :" + text.getBody());
    }
}
