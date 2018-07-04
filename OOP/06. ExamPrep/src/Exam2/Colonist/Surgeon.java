package Exam2.Colonist;

public class Surgeon extends Medic {


    public Surgeon(String id, String familyId, int talent, int age) {
        super(id, familyId, talent, age);
    }

    @Override
    public int getPotential() {
        int sumOfPoints = 0;

        if (super.getAge() > 25 || super.getAge()<35) {
            sumOfPoints += super.getTalent() + 2;
        }
        if (super.getSign().equals("precise")) {
            sumOfPoints += 3;
        } else if (super.getSign().equals("butcher")) {
            sumOfPoints -= 3;
        }
        return sumOfPoints;
    }
}
