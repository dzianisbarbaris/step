package by.savik.RecruitmentOffice;

public class Therapist extends Doc {

    public Therapist() {
    }

    @Override
    public void test(Recruit recruit) {
        if (recruit.cardiogram < 60 || recruit.cardiogram > 100) {
            recruit.valid = false;
            recruit.diagnosis = "не годен.";
        }
    }
}
