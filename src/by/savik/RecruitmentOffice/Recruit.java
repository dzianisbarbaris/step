package by.savik.RecruitmentOffice;

public class Recruit {
    protected int id; // переписать id на static
    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected boolean valid;
    protected String diagnosis;
    protected double visionCoeff;
    protected boolean flatFeet;
    protected int implantCount;
    protected int cardiogram;




    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return valid ? ("" + lastName + " " + firstName + " " + middleName + " - годен\n")
                : ("" + lastName + " " + firstName + " " + middleName + " - " + diagnosis + "\n");
    }
}
