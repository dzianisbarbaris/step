package by.savik.L03_02_2025;

public class Author {
    private String name;
    private String surName;
    private int birthYear;

    public Author(String name, String surName, int birthYear) {
        this.name = name;
        this.surName = surName;
        this.birthYear = birthYear;
    }

    public String toString() {
        return this.surName + " " + this.name + " -  " + this.birthYear;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

}
