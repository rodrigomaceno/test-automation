package com.solvd.laba.classes.file.reader;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class FileReaderApp {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/myfile.txt");

        HashSet<String> list = new HashSet<>();

        List<String> s = FileUtils.readLines(file, StandardCharsets.UTF_8);

        for (String a : s)
            list.addAll(Arrays.asList(a.replaceAll("[^a-zA-Z ]", "").split(" ")));

        list.removeIf(StringUtils::isBlank);

        logger.info("Number of unique words: " + list.size());

        FileUtils.write(file, Integer.toString(list.size()), StandardCharsets.UTF_8, true);

    }
}
