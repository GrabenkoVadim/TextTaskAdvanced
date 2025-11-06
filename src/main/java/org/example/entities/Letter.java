package org.example.entities;

public class Letter {
    private char symbol; // символ літери

    public Letter(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }
}
