package by.savik.L24_02_2025;

public class PaymentMain {
    public static void main(String[] args) {
        PaymentMethod[] paymentMethods = new PaymentMethod[3];
        paymentMethods[0] = new CreditCard("2222 3333 4444 5555", "Денис Савик");
        paymentMethods[1] = new PayPal("denysavik@gmail.com");
        paymentMethods[2] = new Cash();

        for (PaymentMethod paymentMethod : paymentMethods) {
            paymentMethod.pay(150.00);
        }


    }

}
