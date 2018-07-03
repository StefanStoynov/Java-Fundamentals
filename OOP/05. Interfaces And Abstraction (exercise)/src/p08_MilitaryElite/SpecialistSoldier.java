package p08_MilitaryElite;

public abstract class SpecialistSoldier extends Private implements ISpecialistSoldier {
    private String corps;

    protected SpecialistSoldier(String id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.corps = corps;
    }

    @Override
    public String getCorps() {
        return this.corps;
    }

    @Override
    public String toString() {
        return String.format("%s%nCorps: %s", super.toString(), this.corps);
    }
}