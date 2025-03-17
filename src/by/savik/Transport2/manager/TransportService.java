package by.savik.Transport2.manager;

import by.savik.Transport2.model.Transport;
import by.savik.Transport2.model.User;

import java.util.*;

public class TransportService {
    private final List<Transport> transports = new ArrayList<>();

    public void addTransport(Transport transport) {
        transports.add(transport);
        System.out.println(transports);
    }

    public User findOwnerByLicensePlate(String licensePlate) {
        for (Transport transport : transports) {
            if (transport.getLicensePlate().equals(licensePlate)) {
                return transport.getUser();
            }
        }
        return null;
    }

    public Map<String, List<User>> groupOwnersByCarCount() {
        Map<String, List<User>> ownersByCarGroup = Map.of("1-2 машины", new ArrayList<>(), "3-5 машин", new ArrayList<>(), "6 и более машин", new ArrayList<>());
        Map<User, Integer> ownersCarsNum = new HashMap<>();
        for (Transport transport : transports) {
            User user = transport.getUser();
            if (ownersCarsNum.containsKey(user)) {
                Integer count = ownersCarsNum.get(user);
                ownersCarsNum.put(transport.getUser(), ++count);
            } else {
                ownersCarsNum.put(user, 1);
            }
        }
        for (Map.Entry<User, Integer> entry : ownersCarsNum.entrySet()) {
            Integer size = entry.getValue();
            if (size > 0 && size < 2) {
                ownersByCarGroup.get("1-2 машины").add(entry.getKey());
            } else if (size > 2 && size < 6) {
                ownersByCarGroup.get("3-5 машин").add(entry.getKey());
            } else {
                ownersByCarGroup.get("6 и более машин").add(entry.getKey());
            }
        }
        return ownersByCarGroup;
    }

    public List<String> findTop3MostPopularBrands() {
        Map<String, Integer> top3Brands = new HashMap<>();
        TreeMap<Integer, String> top3BrandsSorted = new TreeMap<>();
        List<String> allBrands = new ArrayList<>();
        List<String> top3MostPopularBrands = new ArrayList<>();
        for (Transport transport : transports) {
            String model = transport.getModel();
            if (top3Brands.containsKey(model)) {
                int count = top3Brands.get(model);
                top3Brands.put(model, ++count);
            } else {
                top3Brands.put(model, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : top3Brands.entrySet()){
            top3BrandsSorted.put(entry.getValue(), entry.getKey());
        }
        for (Map.Entry<Integer, String> entry : top3BrandsSorted.entrySet()){
            allBrands.add(entry.getValue());
        }
        if (allBrands.size() >= 3){
            int size = allBrands.size();
            top3MostPopularBrands.add(allBrands.get(size-1));
            top3MostPopularBrands.add(allBrands.get(size-2));
            top3MostPopularBrands.add(allBrands.get(size-3));
        }
        System.out.println(top3BrandsSorted);
        System.out.println(top3MostPopularBrands);
        return top3MostPopularBrands;
    }


}
