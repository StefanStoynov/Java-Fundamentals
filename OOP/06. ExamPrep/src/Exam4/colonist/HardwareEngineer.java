package Exam4.colonist;

public class HardwareEngineer extends Engineer {
    public HardwareEngineer(String id, String familyId, int talent, int age) {
        super(id, familyId, talent, age);
    }



    @Override
    public int getPotential() {
        if (super.getAge()<18){
            return super.getPotential()+2;
        }
        return super.getPotential();
    }
}
