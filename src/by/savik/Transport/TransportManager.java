package by.savik.Transport;

import java.util.*;

public class TransportManager {
    private static List<Transport> transportList = new ArrayList<>();
    private static Set<Transport> uniqueTransportSet = new HashSet<>();



    public static void addTransport(int transportNum){
        for (int i = 0; i < transportNum; i++){
            transportList.add(TransportFactory.next());
            uniqueTransportSet.add(TransportFactory.next());
        }
    }

    public static void removeTransport(String model){
        transportList.removeIf(transport -> transport.getModel().equals(model));
        uniqueTransportSet.removeIf(transport -> transport.getModel().equals(model));
    }

    public static void sortTransportBySpeed(){
        transportList.sort(Comparator.comparing(Transport::getSpeed));
    }

    public static void sortTransportByModel() {
        transportList.sort(Comparator.comparing(Transport::getModel));
    }

    public static void printAllTransport(){
        System.out.println(transportList);
    }

    public static void printUniqueTransport(){
        System.out.println(uniqueTransportSet);
    }

}
