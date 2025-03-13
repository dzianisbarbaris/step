package by.savik.Transport;

import java.util.*;

public class TransportManager {
    private static final Map<String, Transport> transportByPlate = new HashMap<>();
    private static final Map<String, List<Transport>> transportByType = new HashMap<>();


    public void addTransport(int transportNum) {
        for (int i = 0; i < transportNum; i++) {
            Transport transport = TransportFactory.next();
            transportByPlate.put(transport.getLicensePlate(), transport);
            String type = transport.getClass().getSimpleName();
            transportByType.putIfAbsent(type, new ArrayList<>());
            transportByType.get(type).add(transport);
        }
    }

    public void removeTransport(String licensePlate) {
        transportByPlate.remove(licensePlate);
        /*if (transportByPlate.get(licensePlate) != null) {
            String type = transportByPlate.get(licensePlate).getClass().getSimpleName();
            transportByType.get(type).remove(licensePlate);
            System.out.println("транспорт удалён");
        }*/
        for (Map.Entry<String, List<Transport>> entry : transportByType.entrySet()) {
            List<Transport> transports = entry.getValue();
            Iterator<Transport> iterator = transports.iterator();
            while (iterator.hasNext()) {
                Transport next = iterator.next();
                if (licensePlate.equals(next.getLicensePlate())) {
                    iterator.remove();
                }
            }
            System.out.println("транспорт удалён");
        }
        }


    public Transport findTransportByPlate(String licensePlate) {
        if (transportByPlate.get(licensePlate) == null) {
            System.out.println("такого номера нет");
            return null;
        }
        return transportByPlate.get(licensePlate);
    }

    public List<Transport> getTransportByType(String type) {
        return transportByType.get(type);
    }

    public Transport getFastestTransportByType(String type) {
        List<Transport> transportsBySpeed = transportByType.get(type);
        transportsBySpeed.sort(new TransportSpeedComparator());
        return transportsBySpeed.getLast();
    }


    public void printAllTransport() {
        System.out.println(transportByPlate);
    }

    public void printTransportByType() {
        System.out.println(transportByType);
    }
}
