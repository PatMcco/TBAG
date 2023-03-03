package Items;

import java.util.ArrayList;

public enum ItemLibrary {

    HEALTHPOTION("Health Potion"),
    BREAD("Bread"),
    WATER("Water"),
    CAKE("Cake"),
    APPLE("Apple"),
    EGG("Egg"),
    MILK("Milk"),
    CHEESE("Cheese"),
    BEEF("Beef"),
    FISH("Fish"),
    CHICKEN("Chicken"),
    DOORKEY("Key");

    private final String itemName;

    ItemLibrary(String item) {
        this.itemName = item;
    }

    public String getItemName() {
        return itemName;
    }

    public ArrayList<Object> smallHealItems() {
        String egg = ItemLibrary.EGG.getItemName();
        String milk = ItemLibrary.MILK.getItemName();
        String apple = ItemLibrary.APPLE.getItemName();
        ArrayList<Object> smallHealItems = new ArrayList<>();
        smallHealItems.add(egg);
        smallHealItems.add(milk);
        smallHealItems.add(apple);
        return smallHealItems;
    }

    public ArrayList<Object> mediumHealItems() {
        ArrayList<Object> mediumHealItems = new ArrayList<>();
        String bread = ItemLibrary.BREAD.getItemName();
        String water = ItemLibrary.WATER.getItemName();
        String cheese = ItemLibrary.CHEESE.getItemName();
        mediumHealItems.add(bread);
        mediumHealItems.add(water);
        mediumHealItems.add(cheese);
        return mediumHealItems;
    }

    public ArrayList<Object> largeHealItems() {
        ArrayList<Object> largeHealItems = new ArrayList<>();
        String cake = ItemLibrary.CAKE.getItemName();
        String beef = ItemLibrary.BEEF.getItemName();
        String fish = ItemLibrary.FISH.getItemName();
        String chicken = ItemLibrary.CHICKEN.getItemName();
        String healthPotion = ItemLibrary.HEALTHPOTION.getItemName();
        largeHealItems.add(cake);
        largeHealItems.add(beef);
        largeHealItems.add(fish);
        largeHealItems.add(chicken);
        largeHealItems.add(healthPotion);
        return largeHealItems;
    }

}
