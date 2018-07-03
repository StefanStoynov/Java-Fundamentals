package p08_MilitaryElite;

public interface ILeutenantGeneral extends IPrivate {
    Iterable<Soldier> getPrivates();

    void addPrivate(Soldier priv);
}