package by.savik.L30_01_2025;

public class Task00 {
    public static void main(String[] args) {
        /*Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++){
            wheels[i] = new Wheel("Зимняя", 18, "Резина");
        }
        Car audi = new Car("Audi", "100", 1999, wheels);*/
        /*System.out.println(audi);*/
        WheelArray wheelArray = new WheelArray(7);
        wheelArray.add(new Wheel("Зимняя", 9, "Резина"));
        wheelArray.add(new Wheel("Летняя", 12, "Резина"));
        wheelArray.add(new Wheel("Зимняя", 11, "Резина"));
        wheelArray.add(new Wheel("Зимняя", 15, "Резина"));
        wheelArray.add(new Wheel("Летняя", 16, "Резина"));
        System.out.println(wheelArray);
        Wheel wheel = wheelArray.get(wheelArray.getSize() - 1);
        System.out.println(wheel);
        wheelArray.sortByDiameter();
        System.out.println(wheelArray);
        wheelArray.sortByType();
        System.out.println(wheelArray);
        int size = wheelArray.getSize();
        Wheel[] wheels = wheelArray.getWheels();
    }
}
