package org.example.entities;

import java.util.List;

public class Sentence {
    private List<Word> words; // список слів у реченні
    private char punctuation; // розділовий знак

    public Sentence(List<Word> words, char punctuation) {
        this.words = words;
        this.punctuation = punctuation;
    }

    public List<Word> getWords() {
        return words;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Word w : words) {
            sb.append(w).append(" ");
        }
        sb.append(punctuation);
        return sb.toString();
    }
}
