package by.savik.Transport2;

import java.util.HashMap;
import java.util.Map;

public class TransportStatistics {
    private Map<String, Integer> brandCount = new HashMap<>();

    public void addTransport(Transport transport) {
        brandCount.put(transport.getModel(), brandCount.get(transport.getModel()) == null ? 1 : brandCount.get(transport.getModel()) + 1);
    }

    public int getBrandCount(String brand) {
        System.out.println("Количество единиц транспорта бренда: " + brand + "\n" + brandCount.get(brand));
        return brandCount.get(brand);
    }

    public void printBrandStatistics() {
        System.out.println("Количество единиц транспорта по каждому бренду:");
        System.out.println(brandCount);
    }

}
