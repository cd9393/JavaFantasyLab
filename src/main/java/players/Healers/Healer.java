package players.Healers;

import healingTool.HealingTool;

public abstract class Healer {

    private String name;
    private HealingTool healingTool;
    private double health;
    private int attack;

    public Healer(String name, HealingTool healingTool, double health, int attack) {
        this.name = name;
        this.healingTool = healingTool;
        this.health = health;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public HealingTool getHealingTool() {
        return healingTool;
    }

    public void setHealingTool(HealingTool healingTool) {
        this.healingTool = healingTool;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
