package Exam4.colonist;

public abstract class Engineer extends Colonist {
    public Engineer(String id, String familyId, int talent, int age) {
        super(id, familyId, talent, age);
    }

    @Override
    public int getPotential() {
        if (super.getAge()>30){
            return super.getTalent()+5;
        }
        return super.getTalent()+ 3;
    }
}
