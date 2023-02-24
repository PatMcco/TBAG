import java.util.ArrayList;

class ItemLibrary extends Item {

    private String healthPotion = "Health Potion";
    private String bread = "Bread";     private String water = "Water";
    private String cake = "Cake";       private String apple = "Apple";
    private String egg = "Egg";         private String milk = "Milk";
    private String cheese = "Cheese";   private String beef = "Beef";
    private String fish = "Fish";       private String chicken = "Chicken";
    private String doorKey = "Key";

    public ItemLibrary(String name, int weight, int value, String healthPotion,
                       String bread, String water, String cake, String apple,
                       String egg, String milk, String cheese, String beef,
                       String fish, String chicken, String doorKey) {
        super(name, weight, value);
        this.healthPotion = healthPotion;   this.bread = bread;
        this.water = water;                 this.cake = cake;
        this.apple = apple;                 this.egg = egg;
        this.milk = milk;                   this.cheese = cheese;
        this.beef = beef;                   this.fish = fish;
        this.chicken = chicken;             this.doorKey = doorKey;
    }

    public ArrayList<Object> smallHealItems() {
        ArrayList<Object> smallHealItems = new ArrayList<>();
        smallHealItems.add(egg);
        smallHealItems.add(milk);
        smallHealItems.add(apple);
        return smallHealItems;
    }

    public ArrayList<Object> mediumHealItems() {
        ArrayList<Object> mediumHealItems = new ArrayList<>();
        mediumHealItems.add(bread);
        mediumHealItems.add(water);
        mediumHealItems.add(cheese);
        return mediumHealItems;
    }

    public ArrayList<Object> largeHealItems() {
        ArrayList<Object> largeHealItems = new ArrayList<>();
        largeHealItems.add(cake);
        largeHealItems.add(beef);
        largeHealItems.add(fish);
        largeHealItems.add(chicken);
        return largeHealItems;
    }
    public String getHealthPotion() {
        return healthPotion;
    }

    public void setHealthPotion(String healthPotion) {
        this.healthPotion = healthPotion;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getCake() {
        return cake;
    }

    public void setCake(String cake) {
        this.cake = cake;
    }

    public String getApple() {
        return apple;
    }

    public void setApple(String apple) {
        this.apple = apple;
    }

    public String getEgg() {
        return egg;
    }

    public void setEgg(String egg) {
        this.egg = egg;
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getBeef() {
        return beef;
    }

    public void setBeef(String beef) {
        this.beef = beef;
    }

    public String getFish() {
        return fish;
    }

    public void setFish(String fish) {
        this.fish = fish;
    }

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

    public String getDoorKey() {
        return doorKey;
    }

    public void setDoorKey(String doorKey) {
        this.doorKey = doorKey;
    }

}
