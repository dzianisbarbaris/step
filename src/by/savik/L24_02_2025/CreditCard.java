package by.savik.L24_02_2025;

public class CreditCard implements PaymentMethod {
    private String cardNumber;
    private String cardHolder;

    public CreditCard(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " c кредитной карты № " + cardNumber + " " + cardHolder);
    }
}
