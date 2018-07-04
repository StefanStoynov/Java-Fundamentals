package Exam2.Colonist;


public abstract class Colonist {

    private String id;
    private String familyId;
    private int talent;
    private int age;

    public Colonist(String id, String familyId, int talent, int age) {
        this.id = id;
        this.familyId = familyId;
        this.talent = talent;
        this.age = age;
    }


    public int getTalent() {
        return this.talent;
    }

    public int getAge() {
        return this.age;
    }

    public String getId() {
        return this.id;
    }

    public String getFamilyId() {
        return this.familyId;
    }

    public abstract int getPotential();

    public abstract void grow(int years);


}
