package by.savik.Transport;


import java.util.Random;

public class TransportFactory {
    private static final Random random = new Random();
    private static String[] transportNames = new String[]{"Мерседес", "BMW", "Honda", "Suzuki"};
    private static String[] fuelTypes = new String[]{"Газ", "Дизель", "Бензин", "Электро"};

    public static Transport next() {
        int i = random.nextInt(3);
        if (i == 0) {
            return new Car(transportNames[random.nextInt(transportNames.length)], random.nextInt(120,1500), fuelTypes[random.nextInt(fuelTypes.length)]);
        } else if (i == 1) {
            return new Bike(transportNames[random.nextInt(transportNames.length)], random.nextInt(180,280), random.nextBoolean());
        }
        else return new Truck(transportNames[random.nextInt(transportNames.length)], random.nextInt(1,10), random.nextInt(5,20));
    }
}
