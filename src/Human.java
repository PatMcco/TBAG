import java.util.ArrayList;

public class Human extends Humanoid {
    private int health;
    private ArrayList<Item> equipped = new ArrayList<>();
    private ArrayList<Item> inventory = new ArrayList<>();

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
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

    public Human(String name, int health, String weapon,
                 ArrayList<Item> equipped, ArrayList<Item> inventory) {
        super(name, health, weapon);
        if (health > 0 && health <= 100) {
            this.health = health;
        }
    }
    public Human(String name) {
        super(name, 100, "Fists");
    }

    public void createPlayer(String name) {
        Human player = new Human(name);
    }
    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }

    @Override
    public void move() {
        System.out.println("Player is moving");
    }

    @Override
    public void runAway() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void jump() {

    }

    @Override
    public void sneak() {

    }
}
