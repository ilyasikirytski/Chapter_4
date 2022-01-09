/*
Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
package A_1;

import java.util.ArrayList;

// TODO форматирование кода (пробелы, запятые и тд)
public class Main {
    public static void main(String[] args) {
        ArrayList<Word> words = new ArrayList<Word>();
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
        Sentence sentence = new Sentence(words.toString());
        Text text = new Text(sentence.toString());

        System.out.println("Заголовок :" + sentence);
        System.out.println("Текст :" + text);
    }
}
