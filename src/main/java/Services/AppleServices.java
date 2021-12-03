package Services;

import Models.Apple;

import java.util.ArrayList;

public class AppleServices {

    private static int nextId = 0;

    private static ArrayList<Apple> inventory = new ArrayList<>();

    public static Apple create(int expectedAmount, Double expectedPrice, String expectedripeness, Double expectedWeight) {
        Apple apple = new Apple(nextId++, expectedWeight,expectedripeness,expectedPrice,expectedAmount);
        inventory.add(apple);
        return apple;
    }

    public static Apple create(){
        Apple apple = new Apple();
        inventory.add(apple);
        return apple;
    }

    public Apple findApple(int id) {
        return inventory.get(id);
    }

    public Apple[] findAll() {
        return inventory.toArray(new Apple[0]);
    }

    public boolean delete(int id) {
        if(inventory.get(id) != null) {
            inventory.remove(id);
            return true;
        }else{return false;}
    }
}
