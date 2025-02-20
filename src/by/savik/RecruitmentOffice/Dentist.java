package by.savik.RecruitmentOffice;

public class Dentist extends Doc {

    public Dentist() {
    }

    @Override
    public void test(Recruit recruit) {
        if (recruit.implantCount > 1) {
            recruit.valid = false;
            recruit.diagnosis = "не годен.";
        }
    }
}
