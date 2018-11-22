import armour.BronzeArmour;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.meleePlayers.Knight;
import rooms.Dungeon;
import treasures.Gold;
import weapons.Axe;

import static junit.framework.TestCase.assertEquals;

public class DungeonTest {

    Dungeon dungeon;
    Troll troll;
    Gold gold;
    Axe axe;
    BronzeArmour bronzeArmour;
    Knight knight;

    @Before
    public void setUp() {
        troll = new Troll(50, 10);
        gold = new Gold(100, "Rare");
        dungeon = new Dungeon(troll, gold);
        axe = new Axe("Bronze axe", 5);
        bronzeArmour = new BronzeArmour("Shield", 1.5);
        knight = new Knight(20, axe, bronzeArmour);
    }

    @Test
    public void hasTroll() {
        assertEquals(troll, dungeon.getEnemy());
    }

    @Test
    public void hasGold() {
        assertEquals(gold, dungeon.getLoot());
    }

    @Test
    public void canAddCharacter(){
        dungeon.addCharacter(knight);
        assertEquals(1, dungeon.getNumberOfCharacters());
    }



}
