package enemies;

import behaviours.IAttack;
import behaviours.IDamage;
import weapons.Weapon;

public class Troll extends Enemy implements IAttack, IDamage {
    public Troll(double health, int attackDamage) {
        super(health, attackDamage);
    }

    public void attack(IDamage iDamage) {
        iDamage.takeDamage(getAttackDamage());
    }

    public void takeDamage(int damage) {
        double health = this.getHealth();
        this.setHealth(health - damage);
    }
}
