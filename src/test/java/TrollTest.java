import armour.BronzeArmour;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.meleePlayers.Knight;
import weapons.Axe;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;
    Axe axe;
    BronzeArmour bronzeArmour;
    Knight knight;

    @Before
    public void before(){
        troll = new Troll(20, 30);
        axe = new Axe("Bronze axe", 5);
        bronzeArmour = new BronzeArmour("Shield", 1.5);
        knight = new Knight(20, axe, bronzeArmour);
    }

    @Test
    public void hasHealth(){
        assertEquals(20, troll.getHealth(), 0.01);
    }


    @Test
    public void canTakeDamage() {
        troll.takeDamage(20);
        assertEquals(0 ,troll.getHealth(), 0.01);
    }

    @Test
    public void canAttack() {
        troll.attack(knight);
        assertEquals(0, knight.getHealth(), 0.01);
    }
}
