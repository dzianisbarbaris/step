package by.savik.Transport2;

import by.savik.Transport2.factory.TransportFactory;
import by.savik.Transport2.manager.*;

public class TransportMain {
    public static void main(String[] args) {

        //ЕСЛИ ЭТО ВЫГЛЯДИТ ХЕРОВО, НО РАБОТАЕТ - ТО ЭТО НЕ ХЕРОВО!)

        TransportUserManager transportUserManager = new TransportUserManager();
        TransportStatistics transportStatistics = new TransportStatistics();
        TransportAnalytics transportAnalytics = new TransportAnalytics();
        TransportSpeedGrouper transportSpeedGrouper = new TransportSpeedGrouper();
        TransportService transportService = new TransportService();

        /*// TransportUserManager и все его методы
        for (int i = 0; i < 20; i++) {
            transportUserManager.addTransport(TransportFactory.next());
        }

        transportUserManager.printAllOwnersAndTransport();
        System.out.println(" ");
        transportUserManager.addTransportForUser(owner, TransportFactory.next());
        System.out.println(" ");
        transportUserManager.getTransportByOwner(owner);
        transportUserManager.removeTransport(owner, "1234");
        System.out.println(" ");
        transportUserManager.getFastestTransport(owner);
        transportUserManager.findOwnerWithMostCars();


        // TransportStatistics, TransportAnalytics, TransportSpeedGrouper и все их методы
        // в TransportAnalytics старался не менять изначальный List<Transport> transportsAnalytics
        for (int i = 0; i < 100; i++) {
            Transport transport = TransportFactory.next();
            transportStatistics.addTransport(transport);
            transportAnalytics.addTransport(transport);
            transportSpeedGrouper.addTransport(transport);
        }

        System.out.println(" ");
        transportStatistics.printBrandStatistics();
        System.out.println(" ");
        transportStatistics.getBrandCount("BMW");
        System.out.println(" ");
        transportSpeedGrouper.getTransportBySpeed(110);
        System.out.println(" ");
        transportAnalytics.filterByYear(1999);
        System.out.println(" ");
        transportAnalytics.findTop3Fastest();
        System.out.println(" ");
        transportAnalytics.getUniqueBrands();
        System.out.println(" ");
        transportAnalytics.groupBySpeedRange();*/

        for (int i = 0; i < 100; i++) {
            transportService.addTransport(TransportFactory.next());
        }

        transportService.findTop3MostPopularBrands();

    }
}
