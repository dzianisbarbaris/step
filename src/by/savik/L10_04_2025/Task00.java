package by.savik.L10_04_2025;

public class Task00 {
    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getInstance();
        SingletonExample singletonExample2 = SingletonExample.getInstance();
        System.out.println(singletonExample);
        System.out.println(singletonExample2);

        Student student = new Student.Builder("Денис")
                .age(35)
                .email("vavajuka@gmail.com")
                .city("Витебск")
                .build();

        StudentService studentService = new StudentServiceImpl();
        StudentService studentServiceLogging = new LoggingStudentServiceDecorator(studentService);
        studentService.enroll("Денис");
        studentService.printAll();
        test(studentService);
        test(studentServiceLogging);
    }

    private static void test(StudentService studentService) {
        studentService.printAll();
    }
}
