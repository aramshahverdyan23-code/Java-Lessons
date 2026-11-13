package model;

public class Student implements Comparable<Student>  {
    private String name;
    private String surname;
    private int year;
    private int age;
    private double mark;

    public Student(String element) {
        String[] source = element.split(",");
        name = source[0];
        surname = source[1];
        year = Integer.parseInt(source[2]);
        mark = Double.parseDouble(source[3]);
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(String name, String surname, int year, double mark) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public int compareTo(Student s) {
        return name.compareTo(s.name);
    }
}
