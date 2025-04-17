package by.savik.L10_03_2025;

import java.util.*;

public class Task00 {
    public static void main(String[] args) {
        Student student1 = new Student("Вася", 19, 4.6);
        Student student2 = new Student("Петя", 20, 7.6);
        Student student3 = new Student("Олег", 20, 8);

        Map<Integer, Student> mapGradeToStudent = new HashMap<>();
        mapGradeToStudent.put(student1.getAge(), student1);
        mapGradeToStudent.put(student2.getAge(), student2);
        mapGradeToStudent.put(student3.getAge(), student3);
        System.out.println(mapGradeToStudent);

        Student student = mapGradeToStudent.get(19);
        System.out.println(student);

        boolean containsStudent2 = mapGradeToStudent.containsValue(student2);
        System.out.println(containsStudent2);

        Set<Integer> integers = mapGradeToStudent.keySet();
        System.out.println(integers);

        Collection<Student> values = mapGradeToStudent.values();
        System.out.println(values);

        for (Map.Entry<Integer, Student> entry : mapGradeToStudent.entrySet()) {
            Student value = entry.getValue();
            Integer key = entry.getKey();
            System.out.println(key);
            System.out.println(value);
        }

        mapGradeToStudent.getOrDefault(22, new Student("Валера", 12, 2));
        mapGradeToStudent.putIfAbsent(20, new Student("Катя", 10, 8));
        mapGradeToStudent.remove(34);
        Map<Integer, List<Student>> ageStudentsMap = new HashMap<>();
        /*List<Student> students = new ArrayList<>();
        students.add(student1);
        ageStudentsMap.put(student1.getAge(), students);
        List<Student> students1 = ageStudentsMap.get(student1.getAge());
        students1.add(student2);*/

        List<Student> studentsList = List.of(student1, student2, student3);
        for (Student s : studentsList) {
            ageStudentsMap.putIfAbsent(s.getAge(), new ArrayList<>());
            List<Student> list = ageStudentsMap.get(s.getAge());
            list.add(s);
        }
        System.out.println(ageStudentsMap);
    }
}
