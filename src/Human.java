import java.util.ArrayList;

public class Human {

    private int health;
    private String name;
    private int level;
    private ArrayList<ItemLibrary> equipped = new ArrayList<>();
    private ArrayList<ItemLibrary> inventory = new ArrayList<>();

    public Human(String name, int health, int level, ArrayList<ItemLibrary> equipped, ArrayList<ItemLibrary> inventory) {
        this.name = name;
        this.equipped = equipped;
        this.inventory = inventory;
        this.level = level;
        if (health > 0 && health <= 100) {
            this.health = health;
        }
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ItemLibrary> getEquipped() {
        return equipped;
    }

    public void setEquipped(ArrayList<ItemLibrary> equipped) {
        this.equipped = equipped;
    }

    public static ArrayList<ItemLibrary> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<ItemLibrary> inventory) {
        this.inventory = inventory;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
