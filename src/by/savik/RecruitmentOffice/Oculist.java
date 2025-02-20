package by.savik.RecruitmentOffice;

public class Oculist extends Doc {

    public Oculist() {
    }

    @Override
    public void test(Recruit recruit) {
        if (recruit.visionCoeff < 0.8 || recruit.visionCoeff > 1.2) {
            recruit.valid = false;
            recruit.diagnosis = "не годен (Плохое зрение).";
        }
    }
}
