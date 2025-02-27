package by.savik.RecruitmentOffice;

public class Surgeon extends Doc {


    @Override
    public void test(Recruit recruit) {
        if (recruit.flatFeet) {
            recruit.valid = false;
            recruit.diagnosis = "не годен.";
        }
    }
}
