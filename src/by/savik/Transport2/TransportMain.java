package by.savik.Transport2;

public class TransportMain {
    public static void main(String[] args) {
        TransportUserManager transportUserManager = new TransportUserManager();

        for (int i = 0; i < 20; i++) {
            transportUserManager.addTransport(TransportFactory.next());
        }

        transportUserManager.printAllOwnersAndTransport();

    }
}
