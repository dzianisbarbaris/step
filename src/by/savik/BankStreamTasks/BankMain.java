package by.savik.BankStreamTasks;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class BankMain {
    public static void main(String[] args) {
        List<BankAccount> accounts = List.of(
                new BankAccount("12345", "Иван Иванов", List.of(
                        new Transaction(LocalDate.of(2025, 1, 5), Transaction.Type.DEPOSIT, 500.0),
                        new Transaction(LocalDate.of(2025, 2, 10), Transaction.Type.WITHDRAWAL, 120.0)
                )),
                new BankAccount("67890", "Мария Петрова", List.of(
                        new Transaction(LocalDate.of(2025, 3, 1), Transaction.Type.DEPOSIT, 1500.0),
                        new Transaction(LocalDate.of(2025, 3, 5), Transaction.Type.WITHDRAWAL, 200.0),
                        new Transaction(LocalDate.of(2025, 3, 7), Transaction.Type.DEPOSIT, 300.0)
                )),
                new BankAccount("54321", "Олег Смирнов", List.of(
                        new Transaction(LocalDate.of(2025, 4, 1), Transaction.Type.WITHDRAWAL, 50.0)
                )),
                new BankAccount("68421", "Валера Иванов", new ArrayList<>())
        );


        List<Double> allTransactions = accounts.stream()
                .flatMap(bankAccount -> bankAccount.getTransactions().stream())
                .map(Transaction::getAmount).toList();
        System.out.println(allTransactions);

        List<Transaction> onlyDeposits = accounts.stream()
                .flatMap(bankAccount -> bankAccount.getTransactions().stream())
                .filter(transaction -> Transaction.Type.DEPOSIT.equals(transaction.getType()))
                .toList();
        System.out.println(onlyDeposits);

        List<LocalDate> withdrawDates = accounts.stream()
                .flatMap(bankAccount -> bankAccount.getTransactions().stream())
                .filter(transaction -> Transaction.Type.WITHDRAWAL.equals(transaction.getType()))
                .map(Transaction::getDate).toList();
        System.out.println(withdrawDates);

        accounts.stream().forEach(bankAccount -> System.out.println(bankAccount.getOwnerName()));

        List<Transaction> bigTransactions = accounts.stream()
                .flatMap(bankAccount -> bankAccount.getTransactions().stream())
                .filter(transaction -> transaction.getAmount() > 1000)
                .toList();
        System.out.println(bigTransactions);

        List<Transaction> sorteByAmount = accounts.stream()
                .flatMap(bankAccount -> bankAccount.getTransactions().stream())
                .sorted(Comparator.comparingDouble(Transaction::getAmount))
                .toList();
        System.out.println(sorteByAmount);

        List<Transaction> top2Withdraws = accounts.stream()
                .flatMap(bankAccount -> bankAccount.getTransactions().stream())
                .filter(transaction -> Transaction.Type.WITHDRAWAL == (transaction.getType()))
                .sorted(Comparator.comparingDouble(Transaction::getAmount).reversed())
                .limit(2).toList();
        System.out.println(top2Withdraws);

        /*Pair<Transaction, Transaction> top2WithdrawsPair = accounts.stream()
                .flatMap(bankAccount -> bankAccount.getTransactions().stream())
                .filter(transaction -> Transaction.Type.WITHDRAWAL == (transaction.getType()))
                .sorted(Comparator.comparingDouble(Transaction::getAmount).reversed())
                .limit(2).*/

        Map<String, Integer> transactionsCount = accounts.stream()
                .collect(Collectors.groupingBy(BankAccount::getAccountNumber, Collectors.summingInt(t -> t.getTransactions().size())));
        System.out.println(transactionsCount);

        Optional<BankAccount> optional = accounts.stream()
                .filter(bankAccount -> bankAccount.getTransactions().isEmpty())
                .findAny();
        optional.ifPresent(System.out::println);

        Set<String> depositOwners = accounts.stream()
                .collect(Collectors.filtering(bankAccount -> bankAccount.getTransactions().stream()
                                .anyMatch(transaction -> transaction.getType() == Transaction.Type.DEPOSIT),
                        Collectors.mapping(BankAccount::getOwnerName, Collectors.toSet())));
        System.out.println(depositOwners);

    }
}
