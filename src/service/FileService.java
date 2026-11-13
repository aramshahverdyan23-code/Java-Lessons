package service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class FileService {

    public static ArrayList<String> readFile(String url) throws Exception {

        return new ArrayList<>(Files.readAllLines(Path.of(url)));
    }
}