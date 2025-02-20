package by.savik.L27_01_2025;

import by.savik.L23_01_2025.Building;

public class Task00 {
    public static void main(String[] args) {
        Building b = new Building(1, 2, "бетон", "чкалова");
        Building b2 = new Building(3, 2, "бетон", "чкалова");
        boolean eql = b == b2;

        String g = "Привет";
        String h = "Привет2";
        boolean equals = g.equals(h);
        boolean equals1 = h.equals(g);
        String lowerStr = g.toLowerCase();
        char c1 = g.charAt(3);


        /*for (Building b : buildingArray) { перебираем весь массив
            string m = b.material; - присваиваем переменной значение одного из элементов массива
        }*/
    }
}
