package players.meleePlayers;

import armour.Armour;
import behaviours.IAttack;
import behaviours.IDamage;
import weapons.Weapon;

public abstract class MeleePlayer {

    private double health;
    private Weapon weapon;
    private Armour armour;

    public MeleePlayer(double health, Weapon weapon, Armour armour) {
        this.health = health;
        this.weapon = weapon;
        this.armour = armour;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }
}
