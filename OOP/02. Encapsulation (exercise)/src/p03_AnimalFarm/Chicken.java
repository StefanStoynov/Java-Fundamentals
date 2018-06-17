package p03_AnimalFarm;

import java.text.DecimalFormat;

public class Chicken {
    private String name;
    private int age;

    private final String INVALID_NAME_MESSAGE = "Name cannot be empty.";
    private final String INVALID_AGE_MESSAGE = "Age should be between 0 and 15.";

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) {
        if (name.isEmpty()|| name.trim().length()==0) {
            throw new IllegalArgumentException(INVALID_NAME_MESSAGE);
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age > 15 || age <= 0) {
            throw new IllegalArgumentException(INVALID_AGE_MESSAGE);
        }
        this.age = age;
    }

    public static String productPerDay(int age) {
        return calculateProductPerDay(age);
    }

    private static String calculateProductPerDay(int age) {
        double eggs;
        DecimalFormat df = new DecimalFormat("#.##");
        if (age < 6) {
            eggs = 2;
        } else if (age < 12) {
            eggs = 1;
        } else {
            eggs = 0.75;
        }
        return df.format(eggs);
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %s eggs per day.", this.name, this.age, productPerDay(age));
    }
}
