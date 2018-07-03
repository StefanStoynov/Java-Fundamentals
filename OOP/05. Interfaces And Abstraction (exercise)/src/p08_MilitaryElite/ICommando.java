package p08_MilitaryElite;

public interface ICommando {
    Iterable<IMission> getMissions();

    void addMission(IMission mission);
}
