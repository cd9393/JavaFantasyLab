package players.meleePlayers;

import armour.Armour;
import behaviours.IAttack;
import behaviours.IDamage;
import weapons.Weapon;

public class Knight extends MeleePlayer implements IAttack, IDamage {

    public Knight(double health, Weapon weapon, Armour armour) {
        super(health, weapon, armour);
    }

    public void attack(IDamage iDamage) {
        iDamage.takeDamage(getWeapon().getAttackDamage());
    }

    public void takeDamage(int damage) {
        double health = this.getHealth();
        double damageTaken = damage / (getArmour().getDamageReduction());
        this.setHealth(health - damageTaken);
    }
}
