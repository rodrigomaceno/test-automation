package com.solvd.laba.classes.file.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderApp {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/myfile.txt");

        FileReader var1 = new FileReader(file);

        BufferedReader var2 = new BufferedReader(var1);

        String text;
        List<Character> list = new ArrayList<>();
        int counter = 0;

        while ((text = var2.readLine()) != null) {
            for (char c : text.toCharArray()) {
                if (c == ' ')
                    counter++;
            }
        }
        counter++;

        System.out.print(counter);

    }
}
