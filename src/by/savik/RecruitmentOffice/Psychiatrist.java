package by.savik.RecruitmentOffice;

import java.util.Random;

public class Psychiatrist extends Doc {

    public Psychiatrist() {
    }

    @Override
    public void test(Recruit recruit) {
        Random r = new Random();
        boolean b = r.nextBoolean();
        if (b) {
            recruit.valid = false;
            recruit.diagnosis = "не годен (Шизофрения).";
        }
    }
}
