package p15_AnimalFarm;

import java.text.DecimalFormat;

public class Chicken {
    private String name;
    private int years;

    protected Chicken(String name, int years) {
        this.setName(name);
        this.setYears(years);
    }

    private void setName(String name) {
        name = name.trim();
        if (name.length()<=0){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setYears(int years) {
        if (years < 0 || years>15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.years = years;
    }

    private String calculateProductPerDay(){
        DecimalFormat df = new DecimalFormat("#.###############");
        double eggs;
        if (this.years<6){
            eggs = 2;
        }else if (this.years <12){
           eggs = 1;
        }else{
            eggs = 0.75;
        }
        return df.format(eggs);
    }

    public String productPerDay(){
       return calculateProductPerDay();
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %s eggs per day.",this.name,this.years,productPerDay());
    }
}
