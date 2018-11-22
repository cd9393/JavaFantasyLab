import armour.BronzeArmour;
import org.junit.Before;
import org.junit.Test;
import players.meleePlayers.Knight;
import weapons.Axe;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Axe axe;
    BronzeArmour bronzeArmour;
    Knight knight;
    Knight knight1;

    @Before
    public void before(){
        axe = new Axe("Bronze axe", 5);
        bronzeArmour = new BronzeArmour("Shield", 1.5);
        knight = new Knight(20, axe, bronzeArmour);
        knight1 = new Knight(20, axe, bronzeArmour);
    }

    @Test
    public void hasHealth(){
        assertEquals(20, knight.getHealth(), 0.01);
    }

    @Test
    public void hasWeapon(){
        assertEquals(axe, knight.getWeapon());
    }

    @Test
    public void hasArmour(){
        assertEquals(bronzeArmour, knight.getArmour());
    }

    @Test
    public void canTakeDamage() {
        knight.takeDamage(20);
        assertEquals(6.666666666666 ,knight.getHealth(), 0.01);
    }

    @Test
    public void canAttack() {
        knight.attack(knight1);
        assertEquals(16.66666666, knight1.getHealth(), 0.01);
    }
}

