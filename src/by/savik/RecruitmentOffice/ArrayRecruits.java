package by.savik.RecruitmentOffice;

import java.util.Arrays;

public class ArrayRecruits {
    private Recruit[] recruits;
    private int size;

    public ArrayRecruits(int size) {
        recruits = new Recruit[size];
    }

    public void add(Recruit recruit) {
        if (size < recruits.length) {
            recruits[size++] = recruit;
        } else {
            Recruit[] recruits1 = new Recruit[recruits.length + 1];
            for (int i = 0; i < recruits.length; i++) {
                recruits1[i] = recruits[i];
            }
            recruits1[size++] = recruit;
            recruits = recruits1;
        }
    }

    public Recruit get(int index) {
        return recruits[index];
    }

    public int getSize() {
        return recruits.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(recruits);
    }

    public void sortByLastName() {
        for (int i = 0; i < recruits.length - 1; i++) {
            for (int j = 0; j < recruits.length - 1 - i; j++) {
                if (recruits[j] == null || recruits[j + 1] == null) {
                    continue;
                }
                if (recruits[j].getLastName().compareTo(recruits[j + 1].getLastName()) > 0) {
                    Recruit temp = recruits[j];
                    recruits[j] = recruits[j + 1];
                    recruits[j + 1] = temp;
                }
            }
        }
    }


}
