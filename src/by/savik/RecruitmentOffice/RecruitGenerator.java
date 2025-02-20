package by.savik.RecruitmentOffice;

import java.util.Random;

public class RecruitGenerator {

    private String[] lastNameArray = new String[]{"Иванов", "Петров", "Сидоров", "Нурназаров", "Геряк", "Рожков", "Пирожков", "Ковалёв", "Балабанов", "Синяков"};
    private String[] firstNameArray = new String[]{"Иван", "Петр", "Алексей", "Александр", "Артём", "Игорь", "Андрей", "Кирилл", "Олег", "Валерий"};
    private String[] middleNameArray = new String[]{"Иванович", "Петрович", "Алексеевич", "Александрович", "Андреевич", "Сергеевич", "Витальевич", "Семёнович", "Николаевич", "Денисович"};

    public Recruit generate() {
        Random r = new Random();
        Recruit recruit = new Recruit();
        recruit.valid = true;
        recruit.firstName = firstNameArray[r.nextInt(firstNameArray.length)];
        recruit.lastName = lastNameArray[r.nextInt(lastNameArray.length)];
        recruit.middleName = middleNameArray[r.nextInt(middleNameArray.length)];
        recruit.cardiogram = r.nextInt(55, 110);
        recruit.flatFeet = r.nextBoolean();
        recruit.visionCoeff = r.nextDouble(0.7, 1.4);
        recruit.implantCount = r.nextInt(0, 2);
        return recruit;
    }


}
