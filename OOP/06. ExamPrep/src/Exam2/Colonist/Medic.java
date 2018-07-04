package Exam2.Colonist;

public abstract class Medic extends Colonist {
    private String sign;

    public Medic(String id,  String familyId, int talent, int age) {
        super(id, familyId, talent, age);
    }


    public String getSign() {
        return this.sign;
    }

    @Override
    public int getPotential() {
        return super.getTalent() + 2;
    }

    @Override
    public void grow(int years) {

    }
}
