package service;

import model.Student;

import java.util.ArrayList;
import java.util.TreeSet;

public class StudentService {

    public static ArrayList<Student> convert(String[] lines) {

        ArrayList<Student> result = new ArrayList<>();

        for (int i = 0; i < lines.length; i++) {

            result.add(new Student(lines[i]));
        }

        return result;
    }
}