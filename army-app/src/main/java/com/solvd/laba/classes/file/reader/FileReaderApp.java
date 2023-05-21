package com.solvd.laba.classes.file.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.HashSet;

public class FileReaderApp {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/myfile.txt");

        HashSet<String> list = new HashSet<>();

        try (BufferedReader b = new BufferedReader(new FileReader(file))) {

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
        }


        logger.info("Number of unique words: " + list.size());

        try (FileWriter writer = new FileWriter("src/main/resources/myfile.txt", true)) {
            writer.write((String.valueOf(list.size())));
        }

    }
}
