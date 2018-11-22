package enemies;

import weapons.Weapon;

public abstract class Enemy {

    private double health;
    private int attackDamage;

    public Enemy(double health, int attackDamage) {
        this.health = health;
        this.attackDamage = attackDamage;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

}
