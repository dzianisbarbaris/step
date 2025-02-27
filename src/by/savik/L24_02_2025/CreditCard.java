package by.savik.L24_02_2025;

import java.util.Objects;

public class CreditCard implements PaymentMethod, Cloneable {
    private String cardNumber;
    private String cardHolder;

    public CreditCard(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return Objects.equals(cardNumber, that.cardNumber) && Objects.equals(cardHolder, that.cardHolder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, cardHolder);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " c кредитной карты № " + cardNumber + " " + cardHolder);
    }
}
