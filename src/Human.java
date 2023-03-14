import java.util.ArrayList;
import Items.*;

public class Human {

    private int health;
    private String name;
    private int level;
    private ArrayList<Item> equipped = new ArrayList<>();
    private ArrayList<Item> inventory = new ArrayList<>();

    public Human(String name, int health, int level, ArrayList<Item> equipped, ArrayList<Item> inventory) {
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

    public ArrayList<Item> getEquipped() {
        return equipped;
    }

    public void setEquipped(ArrayList<Item> equipped) {
        this.equipped = equipped;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
