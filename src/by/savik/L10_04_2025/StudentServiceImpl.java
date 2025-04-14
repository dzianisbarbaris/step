package by.savik.L10_04_2025;

public class StudentServiceImpl implements StudentService {
    @Override
    public void enroll(String name) {
        System.out.println("Студент " + name + " записан на курс");
    }

    @Override
    public void printAll() {
        System.out.println("Список всех студентов ...");
    }
}
