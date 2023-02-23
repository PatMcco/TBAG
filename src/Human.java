import java.util.ArrayList;

public class Human extends Humanoid {
    private int health;

    public Human(String name, int health, String weapon, ArrayList<Item> equipped, ArrayList<Item> inventory) {
        super(name, health, weapon);
        if (health > 0 && health <= 100) {
            this.health = health;
        }
        inventory.add(HealthPotion);
        inventory.add(FancyTwig);
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
