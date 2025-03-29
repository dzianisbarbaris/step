package by.savik.RandomPicker;

public class RandomPrickerMain {
    public static void main(String[] args) {
        LotteryMachine<Participant> lotto = new LotteryMachine<>();

        // Добавляем участников
        for (int i = 0; i < 20; i++) {
            Participant participant = ParticipantFactory.next();
            if (participant.getAge() >= 18) {
                lotto.add(participant);
            }
        }

        System.out.println("🎰 Первый розыгрыш:");
        Participant participant;
        while ((participant = lotto.pick()) != null) {
            System.out.println("Выбран: " + participant);
        }

        System.out.println("\n\uD83C\uDFB0Победители первого розыгрыша");
        lotto.printWinners();

        System.out.println("\n🔁 Новый розыгрыш:");
        lotto.reset();
        while ((participant = lotto.pick()) != null) {
            System.out.println("Выбран: " + participant);
        }
        System.out.println(lotto.remaining());
    }
}
