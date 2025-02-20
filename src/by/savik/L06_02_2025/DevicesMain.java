package by.savik.L06_02_2025;

public class DevicesMain {
    public static void main(String[] args) {
        // полиморфизм //
        ElectronicDevice laptop = new Laptop("Dell", "X154", 155, 5);
        ElectronicDevice smartphone = new Smartphone("Nokia", "3310", 10, 0);
        ElectronicDevice television = new Television("Telefunken", "HomeCinema", 100, 52);

        ElectronicDevice[] electronicDevices = {smartphone, television, laptop};
        for (ElectronicDevice electronicDevice : electronicDevices) {
            System.out.println(electronicDevice);
            System.out.println(" Состояние " + electronicDevice.getStatus());
            electronicDevice.turnOn();
            System.out.println(" Состояние " + electronicDevice.getStatus());
            electronicDevice.turnOff();
            System.out.println(" Состояние " + electronicDevice.getStatus());
        /*
        Это мы писали изначально
        Laptop laptop = new Laptop("Dell", "X154", 155, 5);
        Smartphone smartphone = new Smartphone("Nokia", "3310", 10, 0);
        Television television = new Television("Telefunken", "HomeCinema", 100, 52);

            System.out.println(laptop);
            System.out.println(" Состояние " + laptop.getStatus());
            laptop.turnOn();
            System.out.println(" Состояние " + laptop.getStatus());
            laptop.turnOff();
            System.out.println(" Состояние " + laptop.getStatus());

            System.out.println(smartphone);
            System.out.println(" Состояние " + smartphone.getStatus());
            laptop.turnOn();
            System.out.println(" Состояние " + smartphone.getStatus());
            laptop.turnOff();
            System.out.println(" Состояние " + smartphone.getStatus());

            System.out.println(television);
            System.out.println(" Состояние " + television.getStatus());
            laptop.turnOn();
            System.out.println(" Состояние " + television.getStatus());
            laptop.turnOff();
            System.out.println(" Состояние " + television.getStatus());*/
        }
    }
}
