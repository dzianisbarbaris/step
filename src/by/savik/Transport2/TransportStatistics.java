package by.savik.Transport2;

import java.util.HashMap;
import java.util.Map;

public class TransportStatistics {
    private final Map<String, Integer> brandCount = new HashMap<>();

    public void addTransport(Transport transport) {
        String model = transport.getModel()
        if(brandCount.containsKey(model)){
            int count = brandCount.get(model);
            brandCount.put(model, ++count);
        }
        else{
            brandCount.put(model, 1);
        }
    }

    public int getBrandCount(String brand) {
        return brandCount.get(brand);
    }

    public void printBrandStatistics() {
        System.out.println("Количество единиц транспорта по каждому бренду:");
        System.out.println(brandCount);
    }

}
