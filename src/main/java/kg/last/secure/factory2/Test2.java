package kg.last.secure.factory2;

import kg.last.secure.factory.Item;

public class Test2 {
    public static void main(String[] args) {
        /*ItemFactory itemFactory = new ItemFactory();
        Item item1 = itemFactory.getItem("Ноутбук");
        item1.sell();*/
        VehicleFactory vf = new VehicleFactory();
        vf.getVehicle(1).drive();
        vf.getVehicle(2).drive();

    }
}
