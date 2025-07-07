package by.savik.L07_07_2025;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        List<Student> studentList = new ArrayList<>();
        studentManager.addStudent(studentList, 5);
        studentManager.filterStudents(studentList);
    }
}
