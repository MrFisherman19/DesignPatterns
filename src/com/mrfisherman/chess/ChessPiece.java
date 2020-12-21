package com.mrfisherman.chess;

import com.mrfisherman.color.Color;
import com.mrfisherman.color.ColorRepository;

public abstract class ChessPiece {

    private final String name;
    private final int numberPosition;
    private final char letterPosition;
    private final Color color;

    public ChessPiece(String name, int numberPosition, char letterPosition, String color) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        switch (color.toLowerCase()) {
            case "black":
                this.color = ColorRepository.getBlack();
                break;
            case "white":
                this.color = ColorRepository.getWhite();
                break;
            default:
                throw new UnsupportedOperationException("There are no more colors than black and white!");
        }
    }

    public String getName() {
        return name;
    }

    public int getNumberPosition() {
        return numberPosition;
    }

    public char getLetterPosition() {
        return letterPosition;
    }

    public Color getColor() {
        return color;
    }
}
