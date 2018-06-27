package p16_ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int money;
    private List<Product> products;


    protected Person(String name, int money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        name = name.trim();
        if (name.length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setMoney(int money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public int getMoney() {
        return this.money;
    }

    protected void addProduct(Product product) {
        this.products.add(product);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (products.size() == 0) {
            return String.format("%s - Nothing bought",this.name);
        }else{

            sb.append(this.name).append(" - ");
            for (Product product : products) {
                sb.append(product.getName()).append(", ");
            }
            sb.deleteCharAt(sb.length()-2);
            return sb.toString();
        }
    }
}
