package com.mrfisherman.color;

public class ColorRepository {

    private static final Color white = new Color(255,255,255);
    private static final Color black = new Color(0,0,0);

    public static Color getWhite() {
        return white;
    }

    public static Color getBlack() {
        return black;
    }

}
