package by.savik.Transport2;

import java.util.Objects;

public class User implements Cloneable {
    private final String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
