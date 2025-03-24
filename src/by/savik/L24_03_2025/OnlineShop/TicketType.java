package by.savik.L24_03_2025.OnlineShop;

public enum TicketType {
    VIP(1000, "Зал с мягкими креслами и напитками"),
    STANDARD (500, "Обычное место"),
    STUDENT(250, "Студенческий билет + скидка");

    private final int price;
    private final String description;

    TicketType(int price, String description) {
        this.price = price;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
