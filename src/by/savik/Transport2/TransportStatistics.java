package by.savik.Transport2;

import java.util.HashMap;
import java.util.Map;

public class TransportStatistics {

    private Map<String, Integer> brandCount = new HashMap<>();


    public void addTransport(Transport transport) {
        brandCount.put(transport.getModel(),  );
    }

    public int getBrandCount(String brand){
        return brandCount.get(brand);
    }

    public void printBrandStatistics() {
        System.out.println(brandCount);
    }
}
