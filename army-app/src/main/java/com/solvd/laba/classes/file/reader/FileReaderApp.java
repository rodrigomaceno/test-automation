package com.solvd.laba.classes.file.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class FileReaderApp {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/myfile.txt");

        FileReader a = new FileReader(file);

        BufferedReader b = new BufferedReader(a);

        HashSet<String> list = new HashSet<>();

        try {
            String s;
            String word = "";

            while ((s = b.readLine()) != null) {
                for (char c : s.toCharArray()) {
                    if (c != ' ')
                        word += c;
                    else {
                        if (!word.equals("")) {
                            list.add(word);
                            word = "";
                        }
                    }
                }
            }
        } finally {
            a.close();
            b.close();
        }

        logger.info("Number of unique words: " + list.size());

    }
}
