package by.savik.Transport2;


import java.util.List;
import java.util.Random;

public class TransportFactory {
    private static final Random random = new Random();
    private static final List<String> transportNames = List.of("Mercedes", "BMW", "Honda", "Suzuki");
    private static final List<String> fuelTypes = List.of("Газ", "Дизель", "Бензин", "Электро");

    private TransportFactory() {
    }

    public static List<Transport> next() {
        String transportName = transportNames.get(random.nextInt(transportNames.size()));
        String fuelType = fuelTypes.get(random.nextInt(fuelTypes.size()));
        String randomPlate = String.valueOf(random.nextInt(1000, 9999));
        int i = random.nextInt(3);
        if (i == 0) {
            return new Car(transportName, random.nextInt(120, 180), randomPlate, random.nextInt(1993, 2025), fuelType, UserFactory.next());
        } else if (i == 1) {
            return new Bike(transportName, random.nextInt(180, 280), randomPlate, random.nextInt(1993, 2025), random.nextBoolean(), UserFactory.next());
        } else
            return new Truck(transportName, random.nextInt(72, 150), randomPlate, random.nextInt(1993, 2025), random.nextInt(5, 20), UserFactory.next());
    }
}
