package by.savik.RecruitmentOffice;

public class ReruitmentMain {
    public static void main(String[] args) {

        Doc[] doctors = new Doc[]{new Oculist(), new Psychiatrist(), new Therapist(), new Dentist(), new Surgeon()};
        Commission commission = new Commission(doctors);

        ArrayRecruits recruits = new ArrayRecruits(1000);
        ArrayRecruits validRecruits = new ArrayRecruits(0);
        ArrayRecruits invalidRecruits = new ArrayRecruits(0);

        for (int i = 0; i < recruits.getSize(); i++) {
            recruits.add(new RecruitGenerator().generate());
        }

        recruits.sortByLastName();

        for (int i = 0; i < recruits.getSize(); i++) {
            commission.test(recruits.get(i));
            if (recruits.get(i).valid) {
                validRecruits.add(recruits.get(i));
            } else {
                invalidRecruits.add(recruits.get(i));
            }
        }

        System.out.println(validRecruits);
        System.out.println(invalidRecruits);
    }

}
