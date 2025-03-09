package by.savik.Transport;

public class TransportMain {
    public static void main(String[] args) {
        TransportManager transportManager = new TransportManager();
        TransportManager.addTransport(20);
        TransportManager.printAllTransport();
        TransportManager.printUniqueTransport();
        System.out.println("------------------");
        TransportManager.sortTransportBySpeed();
        TransportManager.printAllTransport();
        System.out.println("------------------");
        TransportManager.sortTransportByModel();
        TransportManager.printAllTransport();
        TransportManager.printUniqueTransport();

    }
}
