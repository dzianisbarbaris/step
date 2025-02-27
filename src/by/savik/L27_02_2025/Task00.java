package by.savik.L27_02_2025;

public class Task00 {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User("Денис", 37);
        User user2 = new User("Денис", 37);
        System.out.println("user2.equals(user1) -> " + user2.equals(user1));
        System.out.println("user2 == user1 -> " + (user2 == user1));
        System.out.println("user1 hashcode -> " + user1.hashCode());
        System.out.println("user2 hashcode -> " + user2.hashCode());

        User user5 = (User) user1.clone();
        System.out.println("user5 == user 1 " + (user5 == user1));
        System.out.println(user1);
        System.out.println(user5);
    }
}
