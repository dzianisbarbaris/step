package by.savik.RecruitmentOffice;

import java.util.Random;

public class Psychiatrist extends Doc {
    private final static Random r = new Random();

    @Override
    public void test(Recruit recruit) {
        boolean b = r.nextBoolean();
        if (b) {
            recruit.valid = false;
            recruit.diagnosis = "не годен (Шизофрения).";
        }
    }
}
