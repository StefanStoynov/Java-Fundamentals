package p25_CarShopExtended;



public class Seat implements Serializable, Sellable {

    private String model;
    private String color;
    private Integer horcePower;
    private String coutryProduced;
    private Double price;

    public Seat(String model, String color, Integer horcePower, String coutryProduced, Double price) {
        this.model = model;
        this.color = color;
        this.horcePower = horcePower;
        this.coutryProduced = coutryProduced;
        this.price = price;
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
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %s tires", this.getModel(), this.coutryProduced, TIRES);
    }


}
