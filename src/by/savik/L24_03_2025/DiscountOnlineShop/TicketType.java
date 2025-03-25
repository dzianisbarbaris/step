package by.savik.L24_03_2025.DiscountOnlineShop;

public enum TicketType {
    VIP(1000, "Зал с мягкими креслами и напитками"),
    STANDARD(500, "Обычное место"),
    STUDENT(250, "Студенческий билет");

    private final int basePrice;
    private final String description;

    TicketType(int basePrice, String description) {
        this.basePrice = basePrice;
        this.description = description;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public String getDescription() {
        return description;
    }
}
