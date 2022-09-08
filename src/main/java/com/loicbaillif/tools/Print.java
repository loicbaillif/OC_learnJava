package com.loicbaillif.tools;

public class Print {
    public static void title(String text) {
        // Constants
        final var TEXT_LEN = text.length();
        final var TITLE_WIDTH = 80;
        final var FILING_CHAR = '*';

        // Variables
        int prefixSize = 0;
        int suffixSize = 0;

        if (TITLE_WIDTH - TEXT_LEN > 0) {
            int blank_space = TITLE_WIDTH - TEXT_LEN - 2;
            prefixSize = blank_space % 2 == 0
                    ? blank_space / 2
                    : blank_space / 2 + 1;
            suffixSize = blank_space % 2 == 0
                    ? prefixSize
                    : prefixSize - 1;
        }

        // Displaying title

        System.out.println(); // starts with an empty line
        // First line: full of FILING_CHAR
        for (int i = 0; i < TITLE_WIDTH; i++) {
            System.out.print(FILING_CHAR);
        }
        System.out.println();

        // Second line: centered text, filled on left and right
        for (int i = 0; i < prefixSize; i++) {
            System.out.print(FILING_CHAR);
        }
        System.out.printf(" %s ", text);
        for (int i = 0; i < suffixSize; i++) {
            System.out.print(FILING_CHAR);
        }
        System.out.println();

        // Third line: full of FILING_CHAR
        for (int i = 0; i < TITLE_WIDTH; i++) {
            System.out.print(FILING_CHAR);
        }
        System.out.println("\n");

    }
}
