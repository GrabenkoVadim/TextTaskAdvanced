package org.example;

import org.example.entities.Sentence;
import org.example.entities.Text;
import org.example.entities.Word;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TextTask {
    private static final String VOWELS = "aeiouAEIOUаеєиіїоуюяАЕЄИІЇОУЮЯ";

    public void execute() {
        try {
            // створення тестового тексту
            String[] wordArray = getStrings();

            List<Word> words = new ArrayList<>();
            for (String w : wordArray) {
                words.add(new Word(w));
            }

            Sentence sentence = new Sentence(words, '.');
            List<Sentence> sentences = new ArrayList<>();
            sentences.add(sentence);

            Text text = new Text(sentences);

            System.out.println("Original text:");
            System.out.println(text);

            // сортування слів за кількістю голосних
            words.sort(Comparator.comparingInt(Word::countVowels));

            System.out.println("\nSorted words by vowel count:");
            for (Word w : words) {
                System.out.println(w + " (" + w.countVowels() + ")");
            }

        } catch (Exception e) {
            System.out.println("Error while processing text: " + e.getMessage());
        }
    }

    private static String[] getStrings() {
        String input = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?";

        return input.replaceAll("[^a-zA-Zа-яА-ЯїієЄІЇ ]", "")
                .trim().split("\\s+");
    }
}
