package by.savik.L24_02_2025;

public class Cash implements PaymentMethod {

    public Cash() {
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " наличными");
    }
}
