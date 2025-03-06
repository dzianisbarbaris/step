package by.savik.Student;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private final String name;
    private final int age;
    private final double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return getName() + " Возраст : " + getAge() + " Средний балл : " + getGrade();
    }

    @Override
    public int compareTo(Student o) {
        int nameCompare = this.name.compareTo(o.name);
        if(nameCompare != 0) {
            return nameCompare;
        }
        return Integer.compare(this.age, o.age);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}
