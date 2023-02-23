public abstract class Humanoid implements IMoveable, IInteractable{
    private final String name;
    private int health;
    private final String weapon;

    public Humanoid(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
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
    public void poke() {
        System.out.println("Poke");
    }

    @Override
    public void talk() {
        System.out.println("Talk");
    }

    @Override
    public void attack() {
        System.out.println("Attack");
    }

    @Override
    public void pickUp() {
        System.out.println("Pick up");
    }

}
