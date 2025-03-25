package by.savik.L24_03_2025.DiscountOnlineShop;


public class OnlineShop2Main {
    public static void main(String[] args) {
        TicketManager ticketManager = new TicketManager();

        ticketManager.getDiscountedPrice(TicketType.STANDARD, DayOfWeek.WEDNESDAY);
        System.out.println("-> " + ticketManager.getDiscountedPrice(TicketType.STANDARD, DayOfWeek.WEDNESDAY));

        ticketManager.getAllDiscountedPrices(DayOfWeek.SUNDAY);
        System.out.println("-> " + ticketManager.getAllDiscountedPrices(DayOfWeek.SUNDAY));
    }
}
