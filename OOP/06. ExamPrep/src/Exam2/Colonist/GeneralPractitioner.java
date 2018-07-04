package Exam2.Colonist;

import Exam2.Colonist.Medic;

public class GeneralPractitioner extends Medic {


    public GeneralPractitioner(String id, String familyId, int talent, int age) {
        super(id, familyId, talent, age);
    }

    @Override
    public int getPotential() {
        int sumOfPoints = 0;

        if (super.getAge() > 15) {
            sumOfPoints += super.getTalent() + 1;
        }
        if (super.getSign().equals("caring")) {
            sumOfPoints += 1;
        } else if (super.getSign().equals("careless")) {
            sumOfPoints -= 2;
        }
        return sumOfPoints;
    }
}
