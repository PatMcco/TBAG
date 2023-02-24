public class Weapon extends Item {

    private boolean isTwoHanded;
    private int isRanged;
    private int isMelee;
    private boolean isEquippable;
    private int damage;
    private int durability;

    public boolean isTwoHanded() {
        return isTwoHanded;
    }

    public void setTwoHanded(boolean twoHanded) {
        isTwoHanded = twoHanded;
    }

    public int getIsRanged() {
        return isRanged;
    }

    public void setIsRanged(int isRanged) {
        this.isRanged = isRanged;
    }

    public int getIsMelee() {
        return isMelee;
    }

    public void setIsMelee(int isMelee) {
        this.isMelee = isMelee;
    }

    public boolean isEquippable() {
        return isEquippable;
    }

    public void setEquippable(boolean equippable) {
        isEquippable = equippable;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public Weapon(String name, int weight, int value,
                  boolean isTwoHanded, int isRanged, int isMelee,
                  boolean isEquippable, int damage, int durability) {
        super(name, weight, value);
        this.isTwoHanded = isTwoHanded;     this.isRanged = isRanged;
        this.isMelee = isMelee;             this.isEquippable = isEquippable;
        this.damage = damage;               this.durability = durability;
    }

}
