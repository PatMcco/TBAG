abstract class Humanoid implements IMoveable, IInteractable{
    private final String name;
    private int health;

    public Humanoid(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.health = health;
        }
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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
