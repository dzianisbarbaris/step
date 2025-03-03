package by.savik.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            students.add(StudentFactory.next());
        }

        System.out.println(students);
    }
 /*   Создать в классе с main метод поиска по List студента с определенным именем (аргументы метода это List и String name)
    Создать в классе с main метод удаления по List студента с определенным именем (аргументы метода это List и String name)
    Создать в классе с main метод добавления List студентов к другому List студентов  (аргументы метода это List и List)
    Создать в классе с main метод замены Студента в определеный индекс List студентов  (аргументы метода это List и int index)*/
}
