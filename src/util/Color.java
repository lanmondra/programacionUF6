package util;

public enum Color {

    EXITO("\u001B[32m"),
    ERROR("\u001B[31m"),
    DEFAULT("\u001B[0m"),
    GREEN("\033[32;1m"),
    BLUE("\033[36m"),
    PURPLE("\033[0;35m"),
    BLUE_BACKGROUND("\033[44m"),
    BLACK_BACKGROUND("\033[40m"),
    DARK_BLUE("\u001B[34m");

    String color;

    private Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }

}
