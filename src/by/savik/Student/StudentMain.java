package by.savik.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Student> students1 = new ArrayList<>();
        fillStudentsList(students);
        removeStudent(students, "Оля");
        addStudentsToList(students, students1);
        System.out.println(students1);
        System.out.println(findStudent(students, "Денис"));
        replaceStudentByIndex(students, 2);
        System.out.println(students);
    }

    public static void fillStudentsList(List<Student> students) {
        for (int i = 0; i < 100; i++) {
            students.add(StudentFactory.next());
        }
        System.out.println(students);
    }

    public static Student findStudent(List<Student> students, String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public static void removeStudent(List<Student> students, String name) {
        students.removeIf(student -> student.getName().equals(name));
        System.out.println(students);
    }

    public static void addStudentsToList(List<Student> students1, List<Student> students) {
        students1.addAll(students);
    }

    public static void replaceStudentByIndex(List<Student> students, int index) {
        students.set(index, StudentFactory.next());
    }

}