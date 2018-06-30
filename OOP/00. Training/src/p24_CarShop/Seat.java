package p24_CarShop;

public class Seat implements Serializable{

    private String model;
    private String color;
    private Integer horcePower;
    private String coutryProduced;

    public Seat(String model, String color, Integer horcePower, String coutryProduced) {
        this.model = model;
        this.color = color;
        this.horcePower = horcePower;
        this.coutryProduced = coutryProduced;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horcePower;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %s tires",this.getModel(),this.coutryProduced,TIRES);
    }
}
