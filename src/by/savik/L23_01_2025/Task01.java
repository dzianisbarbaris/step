package by.savik.L23_01_2025;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        /*Building building1 = new Building(4, 5, "кирпич", "Чкалова");
        Building building2 = new Building(10, 7, "силикатные блоки", "Черняховского");
        System.out.println(building1.getDescription());
        System.out.println(building2.getDescription());*/
        /*createBuilding();*/
        /*createBuildingYear();*/
        createMegaBuilding();
    }


    public static void createBuilding() {
        Random r = new Random();
        Building[] building = new Building[200];
        for (int i = 0; i < 200; i++) {
            int a = r.nextInt(20);
            int b = r.nextInt(20);
            building[i] = new Building(a, b, "кирпич", "Чкалова");
        }
        for (int i = 0; i < 200; i++) {
            System.out.println(building[i].getDescription());
        }
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < 200; i++) {
            if (building[i].windows == 10) {
                building[i].material = "Панель";
            }
        }
        for (int i = 0; i < 200; i++) {
            System.out.println(building[i].getDescription());
        }
    }

    public static void createBuildingYear() {
        Random r = new Random();
        Building[] building = new Building[200];
        for (int i = 0; i < 200; i++) {
            int a = r.nextInt(21);
            int b = r.nextInt(21);
            int c = r.nextInt(1, 51);
            int d = r.nextInt(1900, 2024);
            building[i] = new Building(a, b, "кирпич", "Чкалова", c, d);
        }
        for (int i = 0; i < 200; i++) {
            System.out.println(building[i].getDescription());
        }
        for (int i = 0; i < building.length - 1; i++) {
            for (int j = 0; j < building.length - 1 - i; j++) {
                if (building[j].height > building[j + 1].height) {
                    Building temp = building[j];
                    building[j] = building[j + 1];
                    building[j + 1] = temp;
                }
            }
        }
        System.out.println("Самое высокое здание");
        System.out.println(building[building.length - 1].getDescription());

        for (int i = 0; i < building.length - 1; i++) {
            for (int j = 0; j < building.length - 1 - i; j++) {
                if (building[j].yearBuilt < building[j + 1].yearBuilt) {
                    Building temp = building[j];
                    building[j] = building[j + 1];
                    building[j + 1] = temp;
                }
            }
        }

        System.out.println("Самое старое здание");
        System.out.println(building[building.length - 1].getDescription());
    }

    public static void createMegaBuilding() {
        String[] material = new String[]{"панель", "кирпич", "бетон", "монолит", "блоки"};
        String[] street = new String[]{"Чкалова", "Мира", "Пограничная", "Строителей", "Герцена", "Воинов-Интернационалистов"};
        Random r = new Random();
        Building[] building = new Building[200];
        for (int i = 0; i < building.length; i++) {
            int a = r.nextInt(21);
            int b = r.nextInt(21);
            int c = r.nextInt(1, 51);
            int d = r.nextInt(1900, 2024);
            String randomMaterial = material[r.nextInt(material.length)];
            String randomStreet = street[r.nextInt(street.length)];
            building[i] = new Building(a, b, randomMaterial, randomStreet, c, d);
        }
        for (int i = 0; i < building.length; i++) {
            System.out.println(building[i].getDescription());
        }
        for (int i = 0; i < building.length - 1; i++) {
            for (int j = 0; j < building.length - 1 - i; j++) {
                if (building[j].yearBuilt > building[j + 1].yearBuilt) {
                    Building temp = building[j];
                    building[j] = building[j + 1];
                    building[j + 1] = temp;
                }
            }
        }
        for (int i = building.length - 1; i >= 0; i--) {
            if ("бетон".equals(building[i].material) && building[i].height > 40) {
                System.out.println("Самое новое здание из бетона высотой более 40м");
                System.out.println(building[i].getDescription());
                break;
            }
        }
        }
    }
