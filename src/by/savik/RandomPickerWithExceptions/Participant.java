package by.savik.RandomPickerWithExceptions;

import java.util.Objects;

public class Participant {
    private String name;
    private int age;
    private String sex;
    private int pasportId;

    public Participant(String name, int age, String sex, int pasportId) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.pasportId = pasportId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getPasportId() {
        return pasportId;
    }

    public void setPasportId(int pasportId) {
        this.pasportId = pasportId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return pasportId == that.pasportId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(pasportId);
    }

    @Override
    public String toString() {
        return name + " Возраст: " + age + ", Пол: " + sex + ", ID Паспорта: " + pasportId;
    }
}
