/*
Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
package A_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Word> words = new ArrayList<>();
        Word word1 = new Word("Hello");
        Word word2 = new Word("My");
        Word word3 = new Word("Name");
        Word word4 = new Word("Is");
        Word word5 = new Word("Ilya");
        words.add(word1);
        words.add(word2);
        words.add(word3);
        words.add(word4);
        words.add(word5);
        Sentence sentence = new Sentence(words);
        Text text = new Text();
        text.addSentence(sentence);
        text.setHeader(word1);
        System.out.println(text);
    }
}
