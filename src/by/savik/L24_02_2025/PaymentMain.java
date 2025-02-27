package by.savik.L24_02_2025;

public class PaymentMain {
    public static void main(String[] args) {
        PaymentMethod[] paymentMethods = new PaymentMethod[6];
        PayPal payPal = new PayPal("dzianis.savik@gmail.com");
        paymentMethods[0] = new CreditCard("2222 3333 4444 5555", "Денис Савик");
        paymentMethods[1] = new PayPal("denysavik@gmail.com");
        paymentMethods[2] = new Cash();
        paymentMethods[3] = new CreditCard("2222 3333 4444 5555", "Денис Савик");
        paymentMethods[4] = new PayPal("denysavik@gmail.com");
        paymentMethods[5] = payPal.clone();

        for (PaymentMethod paymentMethod : paymentMethods) {
            paymentMethod.pay(150.00);
        }

        System.out.println();
        System.out.println("Сравниваем CreditCard через equals");
        System.out.println(paymentMethods[0].equals(paymentMethods[3]) ? "Карты равны" : "Карты не равны");

        System.out.println();
        System.out.println("Сравниваем hashCode у Paypal");
        System.out.println("hashcode первого PayPal: " + paymentMethods[1].hashCode());
        System.out.println("hashcode второго PayPal: " + paymentMethods[4].hashCode());
        System.out.println(paymentMethods[1].hashCode() == paymentMethods[4].hashCode() ? "hashCode равны" : "hashCode не равны");

        System.out.println();
        System.out.println("Сравниваем Paypal и clone через equals");
        System.out.println(payPal.equals(paymentMethods[5]) ? "PayPal и clone равны" : "PayPal и clone не равны");
        System.out.println(paymentMethods[1].equals(paymentMethods[5]) ? "PayPal и clone другого PayPal равны" : "PayPal и clone другого PayPal не равны");
    }
}
