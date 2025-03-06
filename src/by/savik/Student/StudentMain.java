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
        findStudent(students1, "Денис");
        replaceStudentByIndex(students, 2);
    }

    public static void fillStudentsList(List<Student> students) {
        for (int i = 0; i < 100; i++) {
            students.add(StudentFactory.next());
        }
        System.out.println(students);
    }

    public static void findStudent(List<Student> students, String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println(student);
            }
            System.out.println("Cтудента с таким именем нет");
            break;
        }
    }

    public static void removeStudent(List<Student> students, String name) {
        students.removeIf(student -> student.getName().equals(name));
        System.out.println(students);
    }

    public static void addStudentsToList(List<Student> students, List<Student> students1) {
        students1.addAll(students);
        System.out.println(students1);
    }

    public static void replaceStudentByIndex(List<Student> students, int index) {
        students.set(index, StudentFactory.next());
        System.out.println(students);
    }

}