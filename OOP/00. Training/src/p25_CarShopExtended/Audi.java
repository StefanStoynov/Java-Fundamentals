package p25_CarShopExtended;

public class Audi implements Sellable, Rentable {

    private String model;
    private String color;
    private Integer horcePower;
    private String coutryProduced;
    private Integer days;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horcePower, String coutryProduced, Integer days, Double pricePerDay) {
        this.model = model;
        this.color = color;
        this.horcePower = horcePower;
        this.coutryProduced = coutryProduced;
        this.days = days;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.days;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
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

    @Override
    public Double getPrice() {
        return null;
    }
}
