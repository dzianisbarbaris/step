package by.savik.Transport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TransportManager {
    private static List<Transport> transportList = new ArrayList<>();
    private static Set<Transport> uniqueTransportSet = new HashSet<>();


    public static void addTransport(List<Transport> transportList, Set<Transport> transportSet){
        for (int i = 0; i < 10; i++){
            transportList.add(TransportFactory.next());
            transportSet.add(TransportFactory.next());
        }
    }

    public static void removeTransport(List<Transport> transportList, Set<Transport> uniqueTransportSet, String model){
        transportList.removeIf(transport -> transport.getModel().equals(model));
        uniqueTransportSet.removeIf(transport -> transport.getModel().equals(model));
    }

    public static void sortTransportBySpeed(List<Transport> transportList, Set<Transport> transportSet){

    }
}
