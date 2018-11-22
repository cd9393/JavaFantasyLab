package armour;

public abstract class Armour {

    private String name;
    private double damageReduction;

    public Armour(String name, double damageReduction) {
        this.name = name;
        this.damageReduction = damageReduction;
    }

    public double getDamageReduction() {
        return damageReduction;
    }
}
