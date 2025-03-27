package by.savik.L_27_03_2025;

public class User implements Comparable<User>{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(User o) {
        return this.name.compareTo(o.name);
    }
}
