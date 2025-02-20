package by.savik.RecruitmentOffice;

public class Commission {
    private Doc[] doctors;

    public Commission(Doc[] doctors) {
        this.doctors = doctors;
    }

    public void test(Recruit recruit) {
        for (int i = 0; i < doctors.length; i++) {
            doctors[i].test(recruit);
            if (!recruit.valid) {
                break;
            }
        }
    }

}
