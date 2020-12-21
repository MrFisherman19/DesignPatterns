package com.mrfisherman;

import com.mrfisherman.chess.BlackHorse;
import com.mrfisherman.chess.BlackKing;
import com.mrfisherman.chess.ChessPiece;

public class Main {

    public static void main(String[] args) {
        //extract r,g,b to new class Color, create ColorRepository to get values of colors
        ChessPiece blackKing = new BlackKing("Black king", 1, 'A');
        ChessPiece blackHorse = new BlackHorse("Black horse", 2, 'B' );
        ChessPiece whiteQueen = new BlackKing("White queen", 3, 'C');
        ChessPiece whitePawn = new BlackKing("White pawn",4, 'D');

        System.out.println(whitePawn.getColor() == whiteQueen.getColor()); //true

        System.out.println(blackHorse.getColor() == blackKing.getColor()); //true

        System.out.println(blackHorse.getColor() != whiteQueen.getColor()); //false
    }
}
