package by.savik.L07_07_2025;

import java.util.Comparator;
import java.util.List;

public class StudentManager {


    public void addStudent(List<Student> list, int studentNum) {
        for (int i = 0; i < studentNum; i++) {
            list.add(StudentFactory.next());
        }
    }

    public void filterStudents(List<Student> studentList) {
        if (!studentList.isEmpty()) {
            studentList.stream().filter(student -> student.getAge() > 20)
                    .sorted(Comparator.comparingDouble(Student::getGrade))
                    .map(student -> "Студент: " + student.getName() + ", балл: " + student.getGrade()).forEach(System.out::println);
        } else System.out.println("Список студентов пустой");
    }

}
