abstract class Item implements IEquippable {
    private String name;
    private int weight;
    private int value;

    public Item(String name, int weight, int value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getValue() {
        return this.value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void equip() {
        System.out.println("Equip");
    }

    @Override
    public void unequip() {
        System.out.println("Unequip");
    }

    @Override
    public void use() {
        System.out.println("Use");
    }

    @Override
    public void drop() {
        System.out.println("Drop");
    }
}
