package p06_BirthdayCelebrations;

public class Citizen implements Mammal{
    private String name;
    private int age;
    private String id;
    private String birthday;

    public Citizen(String name,int age,String id, String birthday) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthday = birthday;
    }

    @Override
    public String getBirthday() {
        return this.birthday;
    }
}
