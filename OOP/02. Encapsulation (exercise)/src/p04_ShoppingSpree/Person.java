package p04_ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    //name, money and a bag of products.
    private String name;
    private int money;
    private List<Product> products;

    public Person(String name, int money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    public void addProduct(Product products){
        this.products.add(products);
    }

    private void setName(String name) {
        if (name.trim().length() == 0 || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setMoney(int money) {
        if (money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName() {
        return this.name;
    }

    public int getMoney() {
        return this.money;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.name).append(" - ");
        if (products.size()>0) {
            for (Product product : products) {
                sb.append(product.getName()).append(", ");
            }
            sb.deleteCharAt(sb.length() - 2);
        }else{
            sb.append("Nothing bought");
        }
        return sb.toString();
    }
}

