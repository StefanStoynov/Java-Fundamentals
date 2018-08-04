package p21_CoffeeMachine;

import p21_CoffeeMachine.enums.CoffeeSize;
import p21_CoffeeMachine.enums.Coin;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    List<Coffee>coffeesSold;
    private int money;

    public CoffeeMachine() {
        this.coffeesSold = new ArrayList<>();
    }

    public void buyCoffee(String size, String type){

        if (this.money>= CoffeeSize.valueOf(size.toUpperCase()).getPrice()){
            Coffee coffee = new Coffee(size,type);
            coffeesSold.add(coffee);
            this.money = 0;
        }
    }

    public void insertCoin(String coin){
        this.money += Enum.valueOf(Coin.class, coin).getValue();
    }

    public Iterable<Coffee> coffeesSold(){
       return this.coffeesSold;
    }
}
