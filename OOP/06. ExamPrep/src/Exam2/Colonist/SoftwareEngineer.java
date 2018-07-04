package Exam2.Colonist;

public class SoftwareEngineer extends Engineer {


    public SoftwareEngineer(String id, String familyId, int talent, int age) {
        super(id,familyId, talent, age);
    }

    @Override
    public int getPotential() {
        return super.getTalent() + 2;
    }
}
