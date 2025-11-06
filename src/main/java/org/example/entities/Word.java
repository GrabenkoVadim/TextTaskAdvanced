package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Word {
    private List<Letter> letters; // список літер слова

    public Word(String text) {
        letters = new ArrayList<>();
        for (char ch : text.toCharArray()) {
            letters.add(new Letter(ch));
        }
    }

    public String getWord() {
        StringBuilder sb = new StringBuilder();
        for (Letter l : letters) {
            sb.append(l.getSymbol());
        }
        return sb.toString();
    }

    public int countVowels() {
        String vowels = "aeiouAEIOUаеєиіїоуюяАЕЄИІЇОУЮЯ";
        int count = 0;
        for (Letter l : letters) {
            if (vowels.indexOf(l.getSymbol()) >= 0) count++;
        }
        return count;
    }

    @Override
    public String toString() {
        return getWord();
    }
}
