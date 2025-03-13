package by.savik.Transport;

public class TransportMain {
    public static void main(String[] args) {
        TransportManager transportManager = new TransportManager();

        transportManager.addTransport(20);
        transportManager.printAllTransport();
        transportManager.printTransportByType();
        System.out.println("-");
        transportManager.removeTransport("2222");
        transportManager.printAllTransport();
        transportManager.printTransportByType();
        System.out.println("-");
        transportManager.findTransportByPlate("5555");
        transportManager.getTransportByType("Car");
        transportManager.getFastestTransportByType("Truck");
    }
}
