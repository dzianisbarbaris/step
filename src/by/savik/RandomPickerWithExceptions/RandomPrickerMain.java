package by.savik.RandomPickerWithExceptions;

import by.savik.RandomPickerWithExceptions.exception.DuplicateParticipantException;
import by.savik.RandomPickerWithExceptions.exception.MaxWinnersExceededException;
import by.savik.RandomPickerWithExceptions.exception.NotInitializedException;
import by.savik.RandomPickerWithExceptions.exception.UnderageException;

public class RandomPrickerMain {
    public static void main(String[] args) {
        LotteryMachine<Participant> lotto = new LotteryMachine<>();

        // Добавляем участников
        lotto.setMaxWinners(2);
        try {
            for (int i = 0; i < 10; i++) {
                lotto.add(ParticipantFactory.next());
            }
        } catch (UnderageException | DuplicateParticipantException e) {
            System.out.println(e);
        }

        System.out.println("🎰 Первый розыгрыш:");
        Participant participant;
        try {
            while ((participant = lotto.pick()) != null) {
                System.out.println("Выбран: " + participant);
            }
        } catch (MaxWinnersExceededException e) {
            System.out.println(e);
        }



        System.out.println("\n\uD83C\uDFB0Победители первого розыгрыша");
        lotto.printWinners();

        System.out.println("\n🔁 Новый розыгрыш:");
        try {
            lotto.reset();
        } catch (NotInitializedException e) {
            System.out.println(e);
        }
        try {
            while ((participant = lotto.pick()) != null) {
                System.out.println("Выбран: " + participant);
            }
        } catch (MaxWinnersExceededException e) {
            System.out.println(e);
        }

        lotto.ageToWinners();
        System.out.println(lotto.ageToWinners());
    }
}
