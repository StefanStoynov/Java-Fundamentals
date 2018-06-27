package p16_ShoppingSpree;

public class Product {
    private String name;
    private int cost;

    protected Product(String name, int cost) {
        this.setName(name);
        this.setCost(cost);
    }

    private void setName(String name) {
        name = name.trim();
        if (name.length()==0){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getCost() {

        return this.cost;
    }

    private void setCost(int cost) {
        if (cost<0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.cost = cost;
    }
}

