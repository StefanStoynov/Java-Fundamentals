package Exam4.colonist;

public class GeneralPractitioner extends Medic {
    public GeneralPractitioner(String id, String familyId, int talent, int age, String sign) {
        super(id, familyId, talent, age, sign);
    }


    @Override
    public int getPotential() {
        int potential =0;
        if (super.getAge()>15){
            potential+=1;
        }
        if (super.getSign().equals("caring")){
            potential+=1;
        }
        if (super.getSign().equals("careless")){
            potential-=2;
        }
        return super.getPotential()+potential;
    }
}
