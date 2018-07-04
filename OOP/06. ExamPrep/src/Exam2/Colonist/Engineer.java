package Exam2.Colonist;

public abstract class Engineer extends Colonist {
    public Engineer(String id, String familyId, int talent, int age) {
        super(id, familyId, talent, age);
    }

    @Override
    public int getPotential() {
        int sumOfPoints;
        sumOfPoints = super.getTalent() + 3;
        if (super.getAge() > 30) {
            sumOfPoints += 2;
        }
        return sumOfPoints;
    }

    @Override
    public void grow(int years) {

    }
}
