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

    public static ArrayList<ItemLibrary> smallHealItems() {
        String egg = ItemLibrary.EGG.getItemName();
        String milk = ItemLibrary.MILK.getItemName();
        String apple = ItemLibrary.APPLE.getItemName();
        ArrayList<ItemLibrary> smallHealItems = new ArrayList<>();
        smallHealItems.add(ItemLibrary.valueOf(egg));
        smallHealItems.add(ItemLibrary.valueOf(milk));
        smallHealItems.add(ItemLibrary.valueOf(apple));
        return smallHealItems;
    }

    public ArrayList<ItemLibrary> mediumHealItems() {
        ArrayList<ItemLibrary> mediumHealItems = new ArrayList<>();
        String bread = ItemLibrary.BREAD.getItemName();
        String water = ItemLibrary.WATER.getItemName();
        String cheese = ItemLibrary.CHEESE.getItemName();
        mediumHealItems.add(ItemLibrary.valueOf(bread));
        mediumHealItems.add(ItemLibrary.valueOf(water));
        mediumHealItems.add(ItemLibrary.valueOf(cheese));
        return mediumHealItems;
    }

    public ArrayList<ItemLibrary> largeHealItems() {
        ArrayList<ItemLibrary> largeHealItems = new ArrayList<>();
        String cake = ItemLibrary.CAKE.getItemName();
        String beef = ItemLibrary.BEEF.getItemName();
        String fish = ItemLibrary.FISH.getItemName();
        String chicken = ItemLibrary.CHICKEN.getItemName();
        String healthPotion = ItemLibrary.HEALTHPOTION.getItemName();
        largeHealItems.add(ItemLibrary.valueOf(cake));
        largeHealItems.add(ItemLibrary.valueOf(beef));
        largeHealItems.add(ItemLibrary.valueOf(fish));
        largeHealItems.add(ItemLibrary.valueOf(chicken));
        largeHealItems.add(ItemLibrary.valueOf(healthPotion));
        return largeHealItems;
    }

}
