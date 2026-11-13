import model.Student;
import service.FileService;
import service.StudentService;

import java.util.ArrayList;
import java.util.TreeSet;

public class Test {
    void main(String[] args) throws Exception {

        ArrayList<String> lines = FileService.readFile("lesson.txt");

        ArrayList<Student> students = StudentService.convert(lines.toArray(new String[0]));

        TreeSet<Student> sortedStudents = new TreeSet<>(students);

        for (Student s : sortedStudents) {
            System.out.println(s.getName() + " " + s.getSurname());
        }
    }
}