package by.savik.Transport2;

public class TransportMain {
    public static void main(String[] args) {
        TransportUserManager transportUserManager = new TransportUserManager();
        TransportStatistics transportStatistics = new TransportStatistics();
        TransportAnalytics transportAnalytics = new TransportAnalytics();

        for (int i = 0; i < 20; i++) {
            transportUserManager.addTransport(TransportFactory.next());
        }

        transportUserManager.printAllOwnersAndTransport();


        for (int i = 0; i < 100; i++) {
            Transport transport = TransportFactory.next();
            transportStatistics.addTransport(transport);
            transportAnalytics.addTransport(transport);
        }

        System.out.println(" ");
        transportStatistics.printBrandStatistics();
        System.out.println(" ");
        transportAnalytics.filterByYear(1999);

        transportAnalytics.findTop3Fastest();
    }
}
