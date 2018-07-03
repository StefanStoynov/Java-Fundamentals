package p08_MilitaryElite;

public interface IEngineer extends ISpecialistSoldier {
    Iterable<IRepair> getRepairs();

    void addRepair(IRepair repair);
}
