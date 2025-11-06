package org.example.entities;

import java.util.List;

public class Text {
    private List<Sentence> sentences; // список речень

    public Text(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Sentence s : sentences) {
            sb.append(s).append(" ");
        }
        return sb.toString();
    }
}
