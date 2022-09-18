package com.loicbaillif.tools;

public class Print {
    // Variables
    final static char FILING_CHAR = '*';
    final static int TITLE_WIDTH = 80;

    public static int calculatePrefixSize(int textLength) {
        if (TITLE_WIDTH - textLength > 0) {
            int blankSpace = TITLE_WIDTH - textLength - 2;
            return blankSpace % 2 == 0 ? blankSpace / 2 : blankSpace / 2 + 1;
        } else {
            return 0;
        }
    }

    public static int calculateSuffixSize(int textLength) {
        if (TITLE_WIDTH - textLength > 0) {
            int blankSpace = TITLE_WIDTH - textLength - 2;
            return blankSpace % 2 == 0 ? blankSpace / 2 : blankSpace / 2 - 1;
        } else {
            return 0;
        }
    }


    public static void title(String text) {
        // Constants
        final var TEXT_LEN = text.length();

        // Variables
        int prefixSize = calculatePrefixSize(TEXT_LEN);
        int suffixSize = calculateSuffixSize(TEXT_LEN);


        // Displaying title

        System.out.println(); // starts with an empty line
        // First line: full of FILING_CHAR
        for (int i = 0; i < TITLE_WIDTH; i++) {
            System.out.print(FILING_CHAR);
        }
        System.out.println();

        // Second line: centered text, filled on left and right
        subtitle(text, false);

        // Third line: full of FILING_CHAR
        for (int i = 0; i < TITLE_WIDTH; i++) {
            System.out.print(FILING_CHAR);
        }
        System.out.println("\n");

    }

    public static void subtitle(String text) {
        subtitle(text, true);
    }

    public static void subtitle(String text, Boolean subtitleOnly) {
        // Variables
        int textLen = text.length();
        int prefixSize = calculatePrefixSize(textLen);
        int suffixSize = calculateSuffixSize(textLen);

        if (subtitleOnly) {
            System.out.println();
        }

        for (int i = 0; i < prefixSize; i++) {
            System.out.print(FILING_CHAR);
        }
        System.out.printf(" %s ", text);
        for (int i = 0; i < suffixSize; i++) {
            System.out.print(FILING_CHAR);
        }
        System.out.println();
    }
}
