package p09_Google;

        import java.util.SplittableRandom;

public class Parent {
    //parents <parentName> <parentBirthday>”
    private String parentName;
    private String parentBirthday;

    public Parent(String parentName, String parentBirthday) {
        this.parentName = parentName;
        this.parentBirthday = parentBirthday;
    }

    @Override
    public String toString() {
        return String.format("%s %s",this.parentName,this.parentBirthday);
    }
}
