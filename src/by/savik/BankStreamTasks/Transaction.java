package by.savik.BankStreamTasks;
import java.time.LocalDate;

public class Transaction {
    public enum Type { DEPOSIT, WITHDRAWAL }

    private final LocalDate date;
    private final Type type;
    private final double amount;

    public Transaction(LocalDate date, Type type, double amount) {
        this.date = date;
        this.type = type;
        this.amount = amount;
    }

    public LocalDate getDate() { return date; }
    public Type      getType() { return type; }
    public double    getAmount() { return amount; }

    @Override
    public String toString() {
        return date + " " + type + " " + amount + " Br";
    }
}