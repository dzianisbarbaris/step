package by.savik.L06_03_2025;

import by.savik.Student.Student;
import by.savik.Student.StudentFactory;
import by.savik.Student.StudentNameComparator;

import java.util.*;

public class Task00 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        LinkedHashSet<Student> studentsLinked = new LinkedHashSet<>();
        Set<Student> studentsTreeSet = new TreeSet<>(new StudentNameComparator());
        List<Student> studentsList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student next = StudentFactory.next();
            System.out.println(next);
            students.add(StudentFactory.next());
            studentsLinked.add(StudentFactory.next());
            studentsTreeSet.add(StudentFactory.next());
        }
        System.out.println(students);
        System.out.println(students.size());
        /*List<Student> students1 = new ArrayList<>(students);
        Set<Student> studentHashSet = new HashSet<>(studentList);*/
        System.out.println("------------------------------");
        System.out.println(studentsLinked);
        System.out.println(studentsLinked.size());

        System.out.println("------------------------------");
        System.out.println(studentsTreeSet);
        System.out.println(studentsTreeSet.size());

    }
}
