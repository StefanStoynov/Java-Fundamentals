package p04_ShoppingSpree;

public class Product {
    //name and cost
    private String name;
    private int price;

    public Product(String name, int price) {
        this.setName(name);
        this.setPrice(price);
    }

    public Product(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.trim().length() == 0 || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;

    }

    public void setPrice(int price) {
        if (price < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.price = price;
    }
}
