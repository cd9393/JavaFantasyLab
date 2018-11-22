import armour.BronzeArmour;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BronzeArmourTest {

    BronzeArmour bronzeArmour;

    @Before
    public void before(){
        bronzeArmour = new BronzeArmour("Shield", 1.5);
    }

    @Test

    public void hasDamageReduction() {
        assertEquals(1.5, bronzeArmour.getDamageReduction(), 0.01);
    }
}
