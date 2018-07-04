package Exam2.Colonist;

public class HardwareEngineer extends Engineer {


    public HardwareEngineer(String id, String familyId, int talent, int age) {
        super(id, familyId, talent, age);
    }

    @Override
    public int getPotential() {
        int sumOfPoints = 0;

        if (super.getAge() < 18) {
            sumOfPoints += super.getTalent() + 2;
        }
        return sumOfPoints;
    }
}
