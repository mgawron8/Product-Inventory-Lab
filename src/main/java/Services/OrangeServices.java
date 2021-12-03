package Services;


import Models.Orange;

import java.util.ArrayList;

public class OrangeServices {

    private static int nextId = 0;

    private static ArrayList<Orange> inventory = new ArrayList<>();

    public static Orange create(int expectedAmount, Double expectedPrice, String expectedripeness, Double expectedWeight) {
        Orange orange = new Orange(nextId++, expectedWeight,expectedripeness,expectedPrice,expectedAmount);
        inventory.add(orange);
        return orange;
    }

    public static Orange create(){
        Orange orange = new Orange();
        inventory.add(orange);
        return orange;
    }

    public Orange findOrange(int id) {
        return inventory.get(id);
    }

    public Orange[] findAll() {
        return inventory.toArray(new Orange[0]);
    }

    public boolean delete(int id) {
        if(inventory.get(id) != null) {
            inventory.remove(id);
            return true;
        }else{return false;}
    }
}
