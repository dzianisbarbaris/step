package by.savik.L19_12_2024;

public class Task02 {
    public static void main(String[] args) {
        int weight = 63;
        int height = 173;
        int perfect = height - 110;
        if (perfect > weight) {
            int nabrat = perfect - weight;
            System.out.println("Вам нужно набрать: " + nabrat);
        } else if (perfect < weight) {
            int skinut = weight - perfect;
            System.out.println("Вам нужно скинуть: " + skinut);
        } else {
            System.out.println("Вы идеальны!");
        }
    }
}
