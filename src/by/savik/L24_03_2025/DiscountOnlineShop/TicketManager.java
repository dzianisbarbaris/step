package by.savik.L24_03_2025.DiscountOnlineShop;

import java.util.HashMap;
import java.util.Map;

public class TicketManager {
    private TicketType ticketType;
    private DayOfWeek dayOfWeek;

    public int getDiscountedPrice(TicketType type, DayOfWeek day) {
        int discount = (type.getBasePrice() * day.getDiscountPercent()) / 100;
        return type.getBasePrice() - discount;
    }

    public Map<TicketType, Integer> getAllDiscountedPrices(DayOfWeek day) {
        Map<TicketType, Integer> discountedPrices = new HashMap<>();
        for (TicketType type : TicketType.values()) {
            int discount = (type.getBasePrice() * day.getDiscountPercent()) / 100;
            discountedPrices.put(type, type.getBasePrice() - discount);
        }
        return discountedPrices;
    }
}
