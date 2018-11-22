package treasures;

public abstract class Treasure {

    private int value;
    private String rarity;

    public Treasure(int value, String rarity) {
        this.value = value;
        this.rarity = rarity;
    }

    public int getValue() {
        return value;
    }

    public String getRarity() {
        return rarity;
    }
}
