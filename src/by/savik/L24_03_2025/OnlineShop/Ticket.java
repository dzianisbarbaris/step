package by.savik.L24_03_2025.OnlineShop;

public class Ticket {
    private String buyerName;
    private TicketType type;

    public Ticket(String buyerName, TicketType type) {
        this.buyerName = buyerName;
        this.type = type;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public TicketType getType() {
        return type;
    }

    public void setType(TicketType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "buyerName='" + buyerName + '\'' +
                ", type=" + type +
                '}';
    }
}
